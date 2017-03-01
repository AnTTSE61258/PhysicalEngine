package pgame.engine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by An on 3/1/2017.
 */
public class BigWorld extends Thread{
    List<Circle> livingObjects;
    private long lastTime;
    public BigWorld(){
        livingObjects = new ArrayList<Circle>();
        lastTime = System.currentTimeMillis();
    }

    @Override
    public void run() {
        while (true){
            long interval = System.currentTimeMillis() - lastTime;
            lastTime = System.currentTimeMillis();
            System.out.println(interval);


            // Let OS take a nap
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private void move(int interval){
        for (Circle c: livingObjects) {
            double newX = c.getX() + c.getVx() * interval;
            double newY = c.getY() + c.getVy() * interval;
            c.setPosition(newX, newY);
        }


    }
}
