public class Pants extends Clothes implements MenClothing,WomenClothing{
    public void dressMan() {

    }
    public void dressWomen () {

    }
    Pants(Sizes size, int price, String color) {
        this.color = color;
        this.size = size;
        this.price = price;
    }
}
