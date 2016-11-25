/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import functions.MoveRange;
import javafx.scene.layout.Pane;

/**
 *
 * @author jrlytle
 */
public class MoveRangeRunnable implements Runnable
{
    DrawMap dM = new DrawMap();
    KeyListener kL = new KeyListener();
    MoveRange mR = new MoveRange();
    Pane upperScreen = new Pane();
    public MoveRangeRunnable(Pane upperScreen)
    {
        this.upperScreen = upperScreen;
    }
    @Override
    public void run()
    {
        mR.getMoveRange(upperScreen, dM.characterLocations[kL.verticalAdj + kL.cursorVerticalAdj + 6][kL.horizontalAdj + kL.cursorHorizontalAdj + 8], kL.verticalAdj + kL.cursorVerticalAdj + 6, kL.horizontalAdj + kL.cursorHorizontalAdj + 8, kL.horizontalAdj, kL.verticalAdj);
    }
    
}
