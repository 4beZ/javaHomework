public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.getPerimeter());
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(rectangle.getArea());
        Circle circle = new Circle(7);
        System.out.println(circle.getArea());
        System.out.println(circle.getType());
    }
}