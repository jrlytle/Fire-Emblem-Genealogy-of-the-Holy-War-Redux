package game;

import java.awt.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Rotate;

/**
 *
 * @author Jason
 */
public class DrawMap
{
    public int chapterID = 0;
    Image charIcon;
    
    final ImageView playerCursor = new ImageView("images/player_cursor.gif");
    final ImageView enemyCursor = new ImageView("images/enemy_cursor.gif");
    final ImageView enemy2Cursor = new ImageView("images/enemy2_cursor.gif");
    final ImageView npcCursor = new ImageView("images/npc_cursor.gif");
    
    //May need separate class for these...
    ImageView dummy = new ImageView("images/dummy_char.png");
    ImageView myUnit = new ImageView("images/myUnit.gif");
    ImageView arden = new ImageView("images/arden_swordArmor.gif");
    
    ImageView characterIcon;
    ImageView tile;
    
    character[][] characterLocations = getCharacterLocations(chapterID);
    final Rotate rotationTransform = new Rotate(0, 16, 16);
    
    public void drawMap(Pane root, int horizontalAdj, int verticalAdj)
    {
        Dimension[][] currentMap = getCurrentMap(chapterID);
        for (int i = horizontalAdj; i < (17 + horizontalAdj); i++)
        {
            for (int j = verticalAdj; j < (13 + verticalAdj); j++)
            {
                String filename = "images/" + (int)currentMap[j][i].getWidth() + ".png";
                tile = new ImageView(filename);
                tile.setLayoutX(((i - horizontalAdj) * 32) + 2 - 32);
                tile.setLayoutY(2 + ((j - verticalAdj) * 32));
                root.getChildren().add(tile);
            }
        }
    }
    
    public void drawCharacterIcons(Pane root, int horizontalAdj, int verticalAdj)
    {
        for (int i = horizontalAdj; i < (17 + horizontalAdj); i++)
        {
            for (int j = verticalAdj; j < (13 + verticalAdj); j++)
            {
                if(characterLocations[j][i].getCharacterID() > 0)
                {
                    characterIcon = getCharacterIcon(characterLocations[j][i].getCharacterID());
                    characterIcon.setTranslateX(((i - horizontalAdj) * 32) - 30);
                    characterIcon.setTranslateY(((j - verticalAdj) * 32));
                    characterIcon.setRotationAxis(Rotate.X_AXIS);
                    characterIcon.setRotate(15);
                    root.getChildren().add(characterIcon);
                }
            }
        }
    }
    
    public void drawCursor(Pane root, int fullTurnNumber, int cursorHorizontalAdj, int cursorVerticalAdj)
    {
        switch(fullTurnNumber)
        {
            default: 
            {
                playerCursor.setLayoutX(225 + (cursorHorizontalAdj * 32));
                playerCursor.setLayoutY(193 + (cursorVerticalAdj * 32));
                root.getChildren().add(playerCursor);
            }
            break;
            case 1: 
            {
                enemyCursor.setLayoutX(225 + (cursorHorizontalAdj * 32));
                enemyCursor.setLayoutY(193 + (cursorVerticalAdj * 32));
                root.getChildren().add(enemyCursor);
            } 
            break;
            case 2: 
            {
                enemy2Cursor.setLayoutX(225 + (cursorHorizontalAdj * 32));
                enemy2Cursor.setLayoutY(193 + (cursorVerticalAdj * 32));
                root.getChildren().add(enemy2Cursor);
            }
            break;
            case 3: 
            {
                npcCursor.setLayoutX(225 + (cursorHorizontalAdj * 32));
                npcCursor.setLayoutY(193 + (cursorVerticalAdj * 32));
                root.getChildren().add(npcCursor);
            }
            break;
        }
    }
    
    public Dimension[][] getCurrentMap(int chapterID)
    {
        maps.prologue p = new maps.prologue();
        switch(chapterID)
        {
            case 0: return p.prologue;
            default: return p.prologue;
        }
    }
    public character[][] getCharacterLocations(int chapterID)
    {
        characterLocations.prologue cLP = new characterLocations.prologue();
        switch(chapterID)
        {
            case 0: return cLP.cLPrologue;
            default: return cLP.cLPrologue;
        }
    }
    public ImageView getCharacterIcon(int characterID) //May have to shift icons y axis to make up for different icon heights
    {
        switch(characterID)
        {
            default: return new ImageView("images/dummy_char.png");//dummy;
            case 1: return new ImageView("images/dummy_char.png");//dummy;
            case 4: return arden;
            case 5: return myUnit;
        }
    }
    public Dimension getMapDim()
    {
        maps.prologue p = new maps.prologue();
        switch(chapterID)
        {
            case 0: return new Dimension(p.prologue.length, p.prologue[0].length);
            default: return new Dimension(p.prologue.length, p.prologue[0].length);
        }
    }
}
