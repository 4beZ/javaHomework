import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Scanner scan = new Scanner(System.in);
        System.out.println("How many computers u wanna add?");
        int numberOfComputers = scan.nextInt();

        for (int i = 0; i < numberOfComputers; i++) {
            System.out.println("Computer #" + (i + 1));
            Computer computer = new Computer();
            computer.setComputer();
            shop.addComputer(computer);
        }
        GUI shopGUI = new GUI(shop);
        shopGUI.setVisible(true);
    }
}