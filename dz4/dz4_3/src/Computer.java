public class Computer extends Tovar{
    String processor, motherBoard;

    Computer(String processor, String motherBoard, String name, String description, int price) {
        this.processor = processor;
        this.motherBoard = motherBoard;
        this.name = name;
        this.descrption = description;
        this.price = price;
    }
}
