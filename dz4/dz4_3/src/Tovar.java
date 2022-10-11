public abstract class Tovar {
    public String name;
    public int price;
    public String descrption;

    public String toString () {
        return this.name + " | " + this.descrption + " | " + this.price + " $";
    }
}
