package pgame.main;

import pgame.engine.BigWorld;

import javax.swing.*;

/**
 * Created by An on 3/1/2017.
 */
public class RunClass {
    public static void main(String args[]){
        BigWorld bigWorld = new BigWorld();
        bigWorld.start();
        JFrame jFrame = new JFrame("TestFrame");
        jFrame.setVisible(true);

    }
}
