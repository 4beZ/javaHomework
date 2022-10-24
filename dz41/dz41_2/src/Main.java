public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(50, "79629852947", "someModel");
        Phone phone2 = new Phone(100, "89305647893", "someOtherModel");
        Phone phone3 = new Phone(200, "78904567368", "lastModel");
        Phone[] phones = {phone1, phone2, phone3};
        for (Phone phone : phones) {
            System.out.println(phone.getInfo());
            System.out.println(phone.getNumber());
            phone.receiveCall("Alex", "89076875938");
            System.out.println();
        }
    }
}