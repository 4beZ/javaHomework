public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Petrov", 12, "technologies", "22.06.2022", "79087865764");
        Reader reader2 = new Reader("Ivanov", 12, "politics", "14.05.2003", "87869056781");
        Reader[] readers = {reader2, reader2};
        reader1.returnBook(3);
        reader1.returnBook("BookBook", "SomeBook");
    }
}