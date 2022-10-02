public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Gogol", "Dead Souls", 1800);
        Book book2 = new Book("Pushkin", "Captain daugther", 1750);
        Book book3 = new Book("blade runner", "unknown", 2377);
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);
        System.out.println(bookshelf);
        bookshelf.sortByAge();
        System.out.println(bookshelf);
    }
}