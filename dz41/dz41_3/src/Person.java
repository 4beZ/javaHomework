public class Person {
    String fullName = "Person";
    int age = 0;

    Person () {

    }
    Person (String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move () {
        System.out.println("Person " + fullName + " двигается");
    }
    void talk () {
        System.out.println("Person " + fullName + " говорит");
    }
}
