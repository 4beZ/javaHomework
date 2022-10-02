public class Circle {
    double x = 0.0;
    double y = 0.0;
    double radius = 0.0;

    public Circle (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void setXY (double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX () {
        return this.x;
    }

    double getY () {
        return this.y;
    }

    void setRadius (double radius) {
        this.radius = radius;
    }

    double getRadius () {
        return this.radius;
    }

    double square () {
        return Math.PI * Math.pow(this.radius, 2);
    }

    double length () {
        return Math.PI * 2 * this.radius;
    }

    boolean compare (Circle circle) {
        boolean eq = true;
        if (this.x != circle.x)
            eq = false;
        else if (this.y != circle.y)
            eq = false;
        else if (this.radius != circle.radius)
            eq = false;
        return eq;
    }
}
