public class Circle extends Shape{
    int radius = 1;
    Circle (int radius) {
        this.radius = radius;
        this.name = "Circle";
    }
    Circle () {
        this.name = "Circle";
    }
    double getArea () {
        return Math.PI * Math.pow(radius, 2);
    }
    double getPerimeter () {
        return Math.PI * 2 * radius;
    }
}
