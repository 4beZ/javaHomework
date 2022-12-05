public class Car implements Priceable{
    int price = 0;

    Car (int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
