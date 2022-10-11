public class Atelier implements MenClothing,WomenClothing{
    Clothes tShirt = new TShirt(Sizes.S, 123, "red");
    Clothes tie = new Tie(Sizes.M, 321, "black");
    Clothes pants = new Pants(Sizes.L, 546, "white");
    Clothes skirt = new Skirt(Sizes.XS, 890, "pink");
    Clothes[] clothes = {tShirt, tie, pants, skirt};

    public void dressMan() {
        System.out.println("Men clothes: ");
        for (Clothes cl : clothes) {
            if (cl instanceof MenClothing) {
                System.out.println(cl);
            }
        }
    }
    public void dressWomen () {
        System.out.println("Women clothes: ");
        for (Clothes cl : clothes) {
            if (cl instanceof WomenClothing) {
                System.out.println(cl);
            }
        }
    }
}
