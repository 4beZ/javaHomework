public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Shop shop = new Shop();
        Printable mas[] = {book, shop};

        for (Printable pr : mas) {
            pr.print();
        }
    }
}