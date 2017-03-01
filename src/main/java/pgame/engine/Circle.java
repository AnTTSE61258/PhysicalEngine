package pgame.engine;

/**
 * Created by An on 3/1/2017.
 */
public class Circle {
    private double x;
    private double y;
    private double r;
    private double vx;
    private double vy;

    public Circle(double x, double y, double r, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.vx = vx;
        this.vy = vy;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getVx() {
        return vx;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }
    public void setPosition(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }
}
