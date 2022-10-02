public class Point {
    double x = 0.0;
    double y = 0.0;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point () {

    }

    @Override
    public String toString () {
        return "x = " + this.x + " y = " + this.y;
    }
}
