public class TShirt extends Clothes implements MenClothing,WomenClothing{
    public void dressMan() {

    }
    public void dressWomen () {

    }
    TShirt(Sizes size, int price, String color) {
        this.color = color;
        this.size = size;
        this.price = price;
    }
}
