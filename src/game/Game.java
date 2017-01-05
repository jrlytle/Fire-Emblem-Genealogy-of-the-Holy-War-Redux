package game;

import functions.MoveRange;
import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.effect.PerspectiveTransform;
import javafx.application.Application;
import javafx.scene.PerspectiveCamera;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.transform.Rotate;

/**
 *
 * @author jrlytle
 */
public class Game extends Application
{
    DisplayTips dT = new DisplayTips();
    DrawMap dM = new DrawMap();
    DrawMinimap dMM = new DrawMinimap();
    DrawStatScreen dSS = new DrawStatScreen();
    KeyListener kL = new KeyListener();
    MoveRange mR = new MoveRange();
    PerspectiveTransform e = new PerspectiveTransform();
    
    @Override
    public void start(Stage stage)
    {
        Pane root = new Pane();
        Pane upperScreen = new Pane();
        Pane lowerScreen = new Pane();
        Scene scene = new Scene(root, 504, 702);
        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(-16);
        camera.setTranslateY(48);
        scene.setCamera(camera);
        stage.setTitle("Fire Emblem:  Genealogy of the Holy War Redux"); //Title of window
        stage.setScene(scene); //Adds scene to stage
        stage.show(); //Makes the stage visible
        stage.setResizable(false); //Sets window so that it can't be resized
        
        Thread moveRangeRun = new Thread(mRR);
        
        new AnimationTimer()
        {
            @Override
            public void handle(long now)
            {
                upperScreen.setRotationAxis(Rotate.X_AXIS);
                upperScreen.setRotate(-26.5);
                upperScreen.getChildren().removeAll();
                upperScreen.getChildren().clear();
                lowerScreen.getChildren().removeAll();
                lowerScreen.getChildren().clear();
                dM.drawMap(upperScreen, kL.horizontalAdj, kL.verticalAdj);
                dM.drawCursor(upperScreen, kL.fullTurnNumber, kL.cursorHorizontalAdj, kL.cursorVerticalAdj);
                
                Rectangle r = new Rectangle(-16, 395, 516, 367);
                r.setFill(Color.BLACK);
                lowerScreen.getChildren().add(r);
                if(dM.characterLocations[kL.verticalAdj + kL.cursorVerticalAdj + 6][kL.horizontalAdj + kL.cursorHorizontalAdj + 8].getCharacterID() > 0)
                {
                    dSS.statScreen(lowerScreen, dM.characterLocations[kL.verticalAdj + kL.cursorVerticalAdj + 6][kL.horizontalAdj + kL.cursorHorizontalAdj + 8]);
                    mR.getMoveRange(upperScreen, dM.characterLocations[kL.verticalAdj + kL.cursorVerticalAdj + 6][kL.horizontalAdj + kL.cursorHorizontalAdj + 8], kL.verticalAdj + kL.cursorVerticalAdj + 6, kL.horizontalAdj + kL.cursorHorizontalAdj + 8, kL.horizontalAdj, kL.verticalAdj);
                    //moveRangeRun.start();
                    dT.displayTips(dSS.tips, lowerScreen, dM.characterLocations[kL.verticalAdj + kL.cursorVerticalAdj + 6][kL.horizontalAdj + kL.cursorHorizontalAdj + 8]);
                }
                else
                {
                    dMM.drawMinimap(root);
                }
                dM.drawCharacterIcons(upperScreen, kL.horizontalAdj, kL.verticalAdj);
            }
        }.start();
        kL.addKeyHandler(scene, upperScreen, lowerScreen); //Add Key Listener to Scene
        root.getChildren().addAll(upperScreen, lowerScreen);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}
