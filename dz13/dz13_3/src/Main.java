public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.getAddressFromString("Страна,Регион,Город,Улица,Дом,Корпус,Квартира");
        Address address1 = new Address();
        address1.getAddressFromStringAny("Страна;Регион;Город;Улица;Дом;Корпус;Квартира");
    }
}