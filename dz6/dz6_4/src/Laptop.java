public class Laptop implements Priceable{
    int price;

    Laptop (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
