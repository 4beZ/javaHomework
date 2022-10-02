public class Dog {
    String klichka;
    int age;

    public Dog (String klichka, int age) {
        this.klichka = klichka;
        this.age = age;
    }

    void setAge (int age) {
        this.age = age;
    }

    void setKlichka (String klichka) {
        this.klichka = klichka;
    }

    int humanAge () {
        return this.age * 8;
    }

    @Override
    public String toString () {
        return "Dog:\n" + "Klichka: " + this.klichka + "\nAge: " + this.age;
    }
}
