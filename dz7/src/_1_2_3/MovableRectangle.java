package _1_2_3;

public class MovableRectangle <T extends Number> implements Movable{
    private MovablePoint<T> topLeft;
    private MovablePoint<T> bottomRight;

    MovableRectangle(T x1, T x2, T y1, T y2, T xSpeed, T ySpeed) {
        this.topLeft.x = x1.doubleValue();
        this.topLeft.y = y1.doubleValue();
        this.bottomRight.x = x2.doubleValue();
        this.bottomRight.y = y2.doubleValue();
        this.topLeft.xSpeed = xSpeed.doubleValue();
        this.bottomRight.xSpeed = xSpeed.doubleValue();
        this.bottomRight.ySpeed = ySpeed.doubleValue();
        this.topLeft.ySpeed = ySpeed.doubleValue();
    }

    public boolean speedTest () {
        return (Math.abs(topLeft.ySpeed - bottomRight.ySpeed) <= 0.0000001
                && Math.abs(topLeft.xSpeed - bottomRight.xSpeed) <= 0.0000001) ? true : false;
    }

    public String fromIntToString (int i) {
        return Integer.toString(i);
    }

    public String fromDoubleToString (double d) {
        return Double.toString(d);
    }

    @Override
    public void moveUp() {
        topLeft.y++;
        bottomRight.y++;
    }

    @Override
    public void moveDown() {
        topLeft.y--;
        bottomRight.y--;
    }

    @Override
    public void moveLeft() {
        topLeft.x--;
        bottomRight.x--;
    }

    @Override
    public void moveRight() {
        topLeft.y++;
        bottomRight.y++;
    }
}
