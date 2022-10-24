public class Phone {
    int weight = 0;
    String model, number = "undefined";
    Phone (int weight, String number, String model) {
        this(number, model);
        this.weight = weight;
    }
    Phone (String number, String model) {
        this.number = number;
        this.model = model;
    }
    Phone () {

    }
    String getInfo () {
        return "Model: " + model + "\n" +
                "Number: " + number + "\n" +
                "Weight: " + weight;
    }
    void receiveCall (String name) {
        System.out.println("Звонит " + name);
    }
    void receiveCall (String name, String smdNumber) {
        System.out.println("Звонит " + name + " с номера " + smdNumber);
    }
    String getNumber () {
        return number;
    }
    void sendMessage (String... numbers) {
        System.out.println("Numbers: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

}
