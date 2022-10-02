public class Tester {
    public static void main(String[] args) {
        Circle circleMas[] = new Circle[5];
        int circleMasLength = circleMas.length;

        Point point = new Point(2, 3);
        Circle circle = new Circle(point);
        System.out.println(circle.center);
        circle.addSomePoint(7, 8);
        System.out.println(circle.somePoint);
    }
}