package functions;

import game.DrawMap;
import game.character;
import java.awt.Dimension;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import maps.prologue;
import weapons.item;

/**
 *
 * @author jrlytle
 */
public class MoveRange
{
    public int[][] getMoveRange(Pane upperScreen, character player, int xPos, int yPos, int horizontalAdj, int verticalAdj)
    {
        //Need to use polymorphism to make maps
        //DrawMap dM = new DrawMap();
        //Dimension[][] map = dM.getCurrentMap(dM.chapterID);
        prologue p = new prologue();
        //0 - Can't move, 1 - Can move, 2 - Attack range
        int[][] move = new int[31][65];
        double[][] moveVals = new double[31][65];
        
        for(int i = 0; i < 31; i++)
        {
            for(int j = 0; j < 65; j++)
            {
                moveVals[i][j] = Double.POSITIVE_INFINITY; //Initialize all values in MoveVals to Infinity
            }
        }
        
        moveVals[xPos][yPos] = 0; //Set starting position equal to 0 - it costs nothing to not move
        
        for(int i = 0; i <= player.getCurrentStats(9); i++)
        {
            for(int j = 0; j <= i; j++)
            {
                if(i != 0 || j != 0)
                {
                    double up = Double.POSITIVE_INFINITY;
                    double down = Double.POSITIVE_INFINITY;
                    double left = Double.POSITIVE_INFINITY;
                    double right = Double.POSITIVE_INFINITY;
                    if(xPos + i < 31 && yPos + j < 65)
                    {
                        if(yPos + j + 1 < 65)
                        {
                            up = moveVals[xPos + i][yPos + j + 1];
                        }
                        if(yPos + j - 1 >= 0)
                        {
                            down = moveVals[xPos + i][yPos + j - 1];
                        }
                        if(xPos + i - 1 >= 0)
                        {
                            left = moveVals[xPos + i - 1][yPos + j];
                        }
                        if(xPos + i + 1 < 31)
                        {
                            right = moveVals[xPos + i + 1][yPos + j];
                        }
                        moveVals[xPos + i][yPos + j] = p.getMapStats(p.prologue[xPos + i][yPos + j])[getCharType(player.getClassID()) + 4] + Math.min(Math.min(up, down), Math.min(left, right));
                    }
                    if(xPos - i >= 0 && yPos + j < 65)
                    {
                        up = Double.POSITIVE_INFINITY;
                        down = Double.POSITIVE_INFINITY;
                        left = Double.POSITIVE_INFINITY;
                        right = Double.POSITIVE_INFINITY;
                        if(yPos + j + 1 < 65)
                        {
                            up = moveVals[xPos - i][yPos + j + 1];
                        }
                        if(yPos + j - 1 >= 0)
                        {
                            down = moveVals[xPos - i][yPos + j - 1];
                        }
                        if(xPos - i - 1 >= 0)
                        {
                            left = moveVals[xPos - i - 1][yPos + j];
                        }
                        if(xPos - i + 1 < 31)
                        {
                            right = moveVals[xPos - i + 1][yPos + j];
                        }
                        moveVals[xPos - i][yPos + j] = p.getMapStats(p.prologue[xPos - i][yPos + j])[getCharType(player.getClassID()) + 4] + Math.min(Math.min(up, down), Math.min(left, right));;
                    }
                    if(xPos + i < 31 && yPos - j >= 0)
                    {
                        up = Double.POSITIVE_INFINITY;
                        down = Double.POSITIVE_INFINITY;
                        left = Double.POSITIVE_INFINITY;
                        right = Double.POSITIVE_INFINITY;
                        if(yPos - j + 1 < 65)
                        {
                            up = moveVals[xPos + i][yPos - j + 1];
                        }
                        if(yPos - j - 1 >= 0)
                        {
                            down = moveVals[xPos + i][yPos - j - 1];
                        }
                        if(xPos + i - 1 >= 0)
                        {
                            left = moveVals[xPos + i - 1][yPos - j];
                        }
                        if(xPos + i + 1 < 31)
                        {
                            right = moveVals[xPos + i + 1][yPos - j];
                        }
                        moveVals[xPos + i][yPos - j] = p.getMapStats(p.prologue[xPos + i][yPos - j])[getCharType(player.getClassID()) + 4] + Math.min(Math.min(up, down), Math.min(left, right));;
                    }
                    if(xPos - i >= 0 && yPos - j >= 0)
                    {
                        up = Double.POSITIVE_INFINITY;
                        down = Double.POSITIVE_INFINITY;
                        left = Double.POSITIVE_INFINITY;
                        right = Double.POSITIVE_INFINITY;
                        if(yPos - j + 1 < 65)
                        {
                            up = moveVals[xPos - i][yPos - j + 1];
                        }
                        if(yPos - j - 1 >= 0)
                        {
                            down = moveVals[xPos - i][yPos - j - 1];
                        }
                        if(xPos - i - 1 >= 0)
                        {
                            left = moveVals[xPos - i - 1][yPos - j];
                        }
                        if(xPos - i + 1 < 31)
                        {
                            right = moveVals[xPos - i + 1][yPos - j];
                        }
                        moveVals[xPos - i][yPos - j] = p.getMapStats(p.prologue[xPos - i][yPos - j])[getCharType(player.getClassID()) + 4] + Math.min(Math.min(up, down), Math.min(left, right));;
                    }
                    
                    if(xPos + j < 31 && yPos + i < 65)
                    {
                        up = Double.POSITIVE_INFINITY;
                        down = Double.POSITIVE_INFINITY;
                        left = Double.POSITIVE_INFINITY;
                        right = Double.POSITIVE_INFINITY;
                        if(yPos + i + 1 < 65)
                        {
                            up = moveVals[xPos + j][yPos + i + 1];
                        }
                        if(yPos + i - 1 >= 0)
                        {
                            down = moveVals[xPos + j][yPos + i - 1];
                        }
                        if(xPos + j - 1 >= 0)
                        {
                            left = moveVals[xPos + j - 1][yPos + i];
                        }
                        if(xPos + j + 1 < 31)
                        {
                            right = moveVals[xPos + j + 1][yPos + i];
                        }
                        moveVals[xPos + j][yPos + i] = p.getMapStats(p.prologue[xPos + j][yPos + i])[getCharType(player.getClassID()) + 4] + Math.min(Math.min(up, down), Math.min(left, right));;
                        
                    }
                    if(xPos - j >= 0 && yPos + i < 65)
                    {
                        up = Double.POSITIVE_INFINITY;
                        down = Double.POSITIVE_INFINITY;
                        left = Double.POSITIVE_INFINITY;
                        right = Double.POSITIVE_INFINITY;
                        if(yPos + i + 1 < 65)
                        {
                            up = moveVals[xPos - j][yPos + i + 1];
                        }
                        if(yPos + i - 1 >= 0)
                        {
                            down = moveVals[xPos - j][yPos + i - 1];
                        }
                        if(xPos - j - 1 >= 0)
                        {
                            left = moveVals[xPos - j - 1][yPos + i];
                        }
                        if(xPos - j + 1 < 31)
                        {
                            right = moveVals[xPos - j + 1][yPos + i];
                        }
                        moveVals[xPos - j][yPos + i] = p.getMapStats(p.prologue[xPos - j][yPos + i])[getCharType(player.getClassID()) + 4] + Math.min(Math.min(up, down), Math.min(left, right));;
                    }
                    if(xPos + j < 31 && yPos - i >= 0)
                    {
                        up = Double.POSITIVE_INFINITY;
                        down = Double.POSITIVE_INFINITY;
                        left = Double.POSITIVE_INFINITY;
                        right = Double.POSITIVE_INFINITY;
                        if(yPos - i + 1 < 65)
                        {
                            up = moveVals[xPos + j][yPos - i + 1];
                        }
                        if(yPos - i - 1 >= 0)
                        {
                            down = moveVals[xPos + j][yPos - i - 1];
                        }
                        if(xPos + j - 1 >= 0)
                        {
                            left = moveVals[xPos + j - 1][yPos - i];
                        }
                        if(xPos + j + 1 < 31)
                        {
                            right = moveVals[xPos + j + 1][yPos - i];
                        }
                        moveVals[xPos + j][yPos - i] = p.getMapStats(p.prologue[xPos + j][yPos - i])[getCharType(player.getClassID()) + 4] + Math.min(Math.min(up, down), Math.min(left, right));;
                    }
                    if(xPos - j >= 0 && yPos - i >= 0)
                    {
                        up = Double.POSITIVE_INFINITY;
                        down = Double.POSITIVE_INFINITY;
                        left = Double.POSITIVE_INFINITY;
                        right = Double.POSITIVE_INFINITY;
                        if(yPos - i + 1 < 65)
                        {
                            up = moveVals[xPos - j][yPos - i + 1];
                        }
                        if(yPos - i - 1 >= 0)
                        {
                            down = moveVals[xPos - j][yPos - i - 1];
                        }
                        if(xPos - j - 1 >= 0)
                        {
                            left = moveVals[xPos - j - 1][yPos - i];
                        }
                        if(xPos - j + 1 < 31)
                        {
                            right = moveVals[xPos - j + 1][yPos - i];
                        }
                        moveVals[xPos - j][yPos - i] = p.getMapStats(p.prologue[xPos - j][yPos - i])[getCharType(player.getClassID()) + 4] + Math.min(Math.min(up, down), Math.min(left, right));;
                    }
                }
            }
        }
        
        for (int i = 0; i < 31; i++)
        {
            for (int j = 0; j < 65; j++)
            {
                if(moveVals[i][j] <= player.getCurrentStats(9))
                {
                    move[i][j] = 1;
                }
            }
        }
        
        item equippedWeapon = player.getEquippedWeapon(player.getItems());
        int minRange = equippedWeapon.getMinRange();
        int maxRange = equippedWeapon.getMaxRange();
        for(int i = 0; i < 31; i++)
        {
            for(int j = 0; j < 65; j++)
            {
                if(move[i][j] == 1)
                {
                    for(int k = 0; k <= maxRange; k++)
                    {
                        for(int l = 0; l <= maxRange; l++)
                        {
                            if(k + l >= minRange && k + l <= maxRange)
                            {
                                if (i - k >= 0 && j - l >= 0 && move[i - k][j - l] == 0)
                                {
                                    move[i - k][j - l] = 2;
                                }
                                if (i - k >= 0 && j + l < 65 && move[i - k][j + l] == 0)
                                {
                                    move[i - k][j + l] = 2;
                                }
                                if (i + k < 31 && j - l >= 0 && move[i + k][j - l] == 0)
                                {
                                    move[i + k][j - l] = 2;
                                }
                                if (i + k < 31 && j + l < 65 && move[i + k][j + l] == 0)
                                {
                                    move[i + k][j + l] = 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        for (int i = horizontalAdj; i < (17 + horizontalAdj); i++)
        {
            for (int j = verticalAdj; j < (13 + verticalAdj); j++)
            {
                if(move[j][i] == 1)
                {
                    Rectangle startPos = new Rectangle(((i - horizontalAdj) * 32) + 3 - 32, 3 + ((j - verticalAdj) * 32), 30, 30);
                    startPos.setFill(Color.color(0.0f, 0.0f, 1.0f, 0.5f));
                    upperScreen.getChildren().add(startPos);
                }
                if(move[j][i] == 2)
                {
                    Rectangle attackPos = new Rectangle(((i - horizontalAdj) * 32) + 3 - 32, 3 + ((j - verticalAdj) * 32), 30, 30);
                    attackPos.setFill(Color.color(1.0f, 0.0f, 0.0f, 0.5f));
                    upperScreen.getChildren().add(attackPos);
                }
            }
        }
        return move;
    }
    public int getCharType(int classID)
    {
        int charType = 0;
        // 4 -> 5 -> etc.  (Knight1, Knight2, Flier, Foot, Armor, Fighter, Brigand, Pirate)
        switch (classID)
        {
            case 0: charType = 0;
                break;
            case 1: charType = 3;
                break;
            case 2: charType = 0;
                break;
            case 3: charType = 0;
                break;
            case 4: charType = 3;
                break;
            case 5: charType = 3;
                break;
            case 6: charType = 3;
                break;
            case 7: charType = 0;
                break;
            case 8: charType = 0;
                break;
            case 9: charType = 0;
                break;
            case 10: charType = 4;
                break;
            case 11: charType = 4;
                break;
            case 12: charType = 4;
                break;
            case 13: charType = 4;
                break;
            case 14: charType = 4;
                break;
            case 15: charType = 4;
                break;
            case 16: charType = 4;
                break;
            case 17: charType = 4;
                break;
            case 18: charType = 4;
                break;
            case 19: charType = 3;
                break;
            case 20: charType = 3;
                break;
            case 21: charType = 3;
                break;
            case 22: charType = 3;
                break;
            case 23: charType = 3;
                break;
            case 24: charType = 3;
                break;
            case 25: charType = 3;
                break;
            case 26: charType = 3;
                break;
            case 27: charType = 3;
                break;
            case 28: charType = 3;
                break;
            case 29: charType = 3;
                break;
            case 30: charType = 6;
                break;
            case 31: charType = 6;
                break;
            case 32: charType = 7;
                break;
            case 33: charType = 7;
                break;
            case 34: charType = 3;
                break;
            case 35: charType = 3;
                break;
            case 36: charType = 3;
                break;
            case 37: charType = 0;
                break;
            case 38: charType = 0;
                break;
            case 39: charType = 0;
                break;
            case 40: charType = 3;
                break;
            case 41: charType = 3;
                break;
            case 42: charType = 3;
                break;
            case 43: charType = 2;
                break;
            case 44: charType = 2;
                break;
            case 45: charType = 2;
                break;
            case 46: charType = 2;
                break;
            case 47: charType = 2;
                break;
            case 48: charType = 2;
                break;
            case 49: charType = 2;
                break;
            case 50: charType = 2;
                break;
            case 51: charType = 2;
                break;
            case 52: charType = 2;
                break;
            case 53: charType = 3;
                break;
            case 54: charType = 3;
                break;
            case 55: charType = 3;
                break;
            case 56: charType = 0;
                break;
            case 57: charType = 0;
                break;
        }
        return charType;
    }
}
