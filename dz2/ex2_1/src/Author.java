public class Author {
    String name;
    String email;
    char gender;

    public Author (String name, String email, char gender) {
        this.gender = gender;
        this.email = email;
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public String getEmail () {
        return this.email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public char getGender () {
        return this.gender;
    }

    @Override
    public String toString () {
        return "Name: " + this.name + "\nEmail: " + this.email + "\nGender: " + this.gender;
    }
}
