public class Shirt {
    String name, model, color, size;

    Shirt (String name, String model, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.model = model;
    }

    public String toString () {
        String res = "Модель: " + model + "\n" + "Название: " + name +
                "\n" + "Цвет: " + color + "\n" + "Размер: " + size;
        return res;
    }
}
