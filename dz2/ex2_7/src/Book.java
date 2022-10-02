public class Book {
    String author;
    String name;
    int ageDate;

    public Book (String author, String name, int ageDate) {
        this.author = author;
        this.name = name;
        this.ageDate = ageDate;
    }

    void setAuthor (String author) {
        this.author = author;
    }

    void setName (String name) {
        this.name = author;
    }

    void setAgeDate (int ageDate) {
        this.ageDate = ageDate;
    }

    String getAuthor () {
        return this.author;
    }

    String getName () {
        return this.name;
    }

    int getAgeDate () {
        return this.ageDate;
    }
}
