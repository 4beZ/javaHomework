public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.2, 3, 5);
        Circle circle2 = new Circle(2.2, 3, 5);
        System.out.println(circle2.compare(circle1));
        circle2.setXY(5, 5);
        circle1.setRadius(3);
        System.out.println(circle2.square());
        System.out.println(circle2.length());
    }
}