public class Person {
    String firstName;
    String secondName;
    String fathersName;

    Person (String firstName, String secondName, String fathersName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fathersName = fathersName;
    }

    public String getFIO () {
        String res = secondName;
        if (!firstName.isEmpty())
            res += " " + firstName;
        if (!fathersName.isEmpty())
            res += " " + fathersName;
        return res;
    }
}
