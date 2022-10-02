import java.util.Scanner;

public class Computer {
    String processor = "";
    String motherBoard = "";
    String name = "";
    int price = 0;

    public Computer (String proc, String moth, String name, int price) {
        this.processor = proc;
        this.motherBoard = moth;
        this.name = name;
        this.price = price;
    }

    public Computer () {

    }

    void setProcessor (String processor) {
        this.processor = processor;
    }

    void setMotherBoard (String motherBoard) {
        this.motherBoard = motherBoard;
    }

    void setName (String name) {
        this.name = name;
    }

    void setPrice (int price) {
        this.price = price;
    }

    void setComputer () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        setName(scan.nextLine());
        System.out.println("Processor:");
        setProcessor(scan.nextLine());
        System.out.println("Mother board:");
        setMotherBoard(scan.nextLine());
        System.out.println("Price:");
        setPrice(scan.nextInt());
    }

    @Override
    public String toString () {
        return "Computer:\n" +
                "name: " + this.name +
                "\nprocessor: " + this.processor +
                "\nmother board: " + this.motherBoard +
                "\nprice: " + this.price;
    }
}
