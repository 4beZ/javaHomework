public class Circle {
    Point center;
    Point somePoint;

    public Circle (Point point) {
        this.center = point;
    }

    public Circle () {
        this.center = new Point();
    }

    void addSomePoint (double x, double y) {
        somePoint = new Point(x, y);
    }
}
