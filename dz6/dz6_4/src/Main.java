public class Main {
    public static void main(String[] args) {
        Car car = new Car(500);
        Laptop laptop = new Laptop(100);
        System.out.println(car.getPrice());
        System.out.println(laptop.getPrice());
    }
}