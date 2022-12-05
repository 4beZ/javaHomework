public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle (int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.topLeft.xSpeed = xSpeed;
        this.bottomRight.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
        this.topLeft.ySpeed = ySpeed;
    }

    public boolean sameSpeed () {
        return (topLeft.ySpeed == bottomRight.ySpeed && topLeft.xSpeed == bottomRight.xSpeed) ? true : false;
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
