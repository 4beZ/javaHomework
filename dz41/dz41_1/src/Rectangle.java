public class Rectangle extends Shape {
    protected int a, b = 1;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.name = "Rectangle";
    }
    Rectangle () {
        this.name = "Reactangle";
    }

    int getArea () {
        return a*b;
    }

    int getPerimeter() {
        return 2 * (a + b);
    }
}
