public class Ball {
    double x = 0.0;
    double y = 0.0;

    public Ball (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball () {

    }

    double getX () {
        return this.x;
    }

    void setX (double x) {
        this.x = x;
    }

    double getY () {
        return this.y;
    }

    void setY (double y) {
        this.y = y;
    }

    void setXY (double x, double y) {
        this.x = x;
        this.y = y;
    }

    void move (double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString () {
        return "Ball:\n" + "x = " + this.x + "\ny = " + this.y;
    }
}
