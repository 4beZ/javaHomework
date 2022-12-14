public class Celsius implements Convertable{
    float value = 0;

    Celsius(float value){
        this.value = value;
    }

    @Override
    public void convert() {
        System.out.println("Fahrenheit: " + (value*9/5 + 32));
        System.out.println("Kelvin: " + (value + 273.15));
    }
}
