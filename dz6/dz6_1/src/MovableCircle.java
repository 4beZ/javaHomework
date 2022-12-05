public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.y++;
    }

    @Override
    public void moveDown() {
        center.y--;
    }

    @Override
    public void moveLeft() {
        center.x--;
    }

    @Override
    public void moveRight() {
        center.x++;
    }

    public String toString () {
        return "x = " + center.x + "\n" +
                "y = " + center.y + "\n" +
                "radius = " + radius + "\n";
    }
}
