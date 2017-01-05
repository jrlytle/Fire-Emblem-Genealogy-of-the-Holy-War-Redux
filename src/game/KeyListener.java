package game;

import functions.MoveRange;
import java.awt.Dimension;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Jason
 */
public class KeyListener
{
    DrawMap dM = new DrawMap();

    boolean upKey = false;
    boolean downKey = false;
    boolean leftKey = false;
    boolean rightKey = false;

    int horizontalAdj = 48;
    int verticalAdj = 4;
    int zRotate = 0;
    int adj = 1;
    boolean reachedUpperBound = false;
    boolean reachedLowerBound = true;

    int cursorHorizontalAdj = 5;
    int cursorVerticalAdj = 0;

    int fullTurnNumber = 0;

    public void addKeyHandler(Scene scene, Pane upperScreen, Pane lowerScreen)
    {
        Dimension mapDim = dM.getMapDim();

        scene.setOnKeyPressed(k
                -> 
                {
                    if (k.getCode() == KeyCode.ENTER)
                    {
                        fullTurnNumber++;
                        if (fullTurnNumber > 3)
                        {
                            fullTurnNumber = 0;
                        }
                    }
                    if (k.getCode() == KeyCode.Z)
                    {
                        System.out.println("Z");
                        MoveRange mR = new MoveRange();
                        int xPos = verticalAdj + cursorVerticalAdj + 6;
                        int yPos = horizontalAdj + cursorHorizontalAdj + 8;
                        int[][] move = mR.getMoveRange(upperScreen, dM.characterLocations[xPos][yPos], xPos, yPos, horizontalAdj, verticalAdj);
                        for (int i = horizontalAdj; i < (17 + horizontalAdj); i++)
                        {
                            for (int j = verticalAdj; j < (13 + verticalAdj); j++)
                            {
                                if (move[j][i] == 1)
                                {
                                    Rectangle startPos = new Rectangle(((i - horizontalAdj) * 32) + 3 - 32, 3 + ((j - verticalAdj) * 32), 30, 30);
                                    startPos.setFill(Color.color(0.0f, 0.0f, 1.0f, 0.5f));
                                    upperScreen.getChildren().add(startPos);
                                }
                                if (move[j][i] == 2)
                                {
                                    Rectangle attackPos = new Rectangle(((i - horizontalAdj) * 32) + 3 - 32, 3 + ((j - verticalAdj) * 32), 30, 30);
                                    attackPos.setFill(Color.color(1.0f, 0.0f, 0.0f, 0.5f));
                                    upperScreen.getChildren().add(attackPos);
                                }
                            }
                        }
                    }
                    if (k.getCode() == KeyCode.UP)
                    {
                        if (verticalAdj > 0 && cursorVerticalAdj == 0) //Need to adjust these bounds when more maps are added
                        {
                            verticalAdj--;
                        }
                        else if (cursorVerticalAdj > -6)
                        {
                            cursorVerticalAdj--;
                        }
                    }
                    if (k.getCode() == KeyCode.DOWN)
                    {
                        if (verticalAdj + 13 < mapDim.getWidth() && cursorVerticalAdj == 0) //Need to adjust these bounds when more maps are added
                        {
                            verticalAdj++;
                        }
                        else if (cursorVerticalAdj < 6)
                        {
                            cursorVerticalAdj++;
                        }
                    }
                    if (k.getCode() == KeyCode.RIGHT)
                    {
                        if (horizontalAdj + 15 < mapDim.getHeight() - 2 && cursorHorizontalAdj == 0) //Need to adjust these bounds when more maps are added
                        {
                            horizontalAdj++;
                        }
                        else if (cursorHorizontalAdj < 7)
                        {
                            cursorHorizontalAdj++;
                        }
                    }
                    if (k.getCode() == KeyCode.LEFT)
                    {
                        if (horizontalAdj > 0 && cursorHorizontalAdj == 0) //Need to adjust these bounds when more maps are added
                        {
                            horizontalAdj--;
                        }
                        else if (cursorHorizontalAdj > -7)
                        {
                            cursorHorizontalAdj--;
                        }
                    }
        });
    }
}
