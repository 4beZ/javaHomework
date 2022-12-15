package _1_2_3;

public class MovablePoint <T extends Number> implements Movable{
    protected double x;
    protected double y;
    protected double xSpeed;
    protected double ySpeed;

    MovablePoint(T x, T y, T xSpeed, T ySpeed) {
        this.x = x.doubleValue();
        this.y = y.doubleValue();
        this.xSpeed = xSpeed.doubleValue();
        this.ySpeed = ySpeed.doubleValue();
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    public String toString () {
        return "x = " + x + "\n" +
                "y = " + y + "\n";
    }
}
