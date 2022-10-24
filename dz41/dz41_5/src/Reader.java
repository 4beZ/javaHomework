public class Reader {
    String fio;
    int id;
    String facult;
    String dateOfBirth;
    String phoneNumber;

    Reader (String fio, int id, String facult, String dateOfBirth, String phoneNumber) {
        this.fio = fio;
        this.id = id;
        this.facult = facult;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    Reader () {

    }

    void takeBook (int num) {
        System.out.println(fio + " took " + num + " books");
    }
    void takeBook (String... books) {
        System.out.println(fio + " took some books:\n");
        for (String book : books) {
            System.out.print(book + " ");
        }
    }
    void takeBook (Book... books) {
        System.out.println(fio + " took some books:\n");
        for (Book book : books) {
            System.out.print(book.name + " ");
        }
    }

    void returnBook (int num) {
        System.out.println(fio + " returned " + num + " books");
    }
    void returnBook (String... books) {
        System.out.println(fio + " returned some books:");
        for (String book : books) {
            System.out.print(book + " ");
        }
    }
    void returnBook (Book... books) {
        System.out.println(fio + " returned some books:\n");
        for (Book book : books) {
            System.out.print(book.name + " ");
        }
    }
}
