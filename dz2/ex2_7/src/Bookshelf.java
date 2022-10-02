import java.util.ArrayList;
import java.util.Comparator;

public class Bookshelf {
    ArrayList<Book> bookshelf = new ArrayList<>();

    void addBook (Book book) {
        bookshelf.add(book);
    }

    int getNumberOfBooks () {
        return bookshelf.size();
    }

    Book getEarliestBook () {
        int min = bookshelf.get(0).getAgeDate();
        int ind = 0;
        for (int i = 0; i < bookshelf.size(); i++) {
            if (bookshelf.get(i).getAgeDate() < min) {
                min = bookshelf.get(i).getAgeDate();
                ind = i;
            }
        }
        return bookshelf.get(ind);
    }

    Book getLatestBook () {
        int max = bookshelf.get(0).getAgeDate();
        int ind = 0;
        for (int i = 0; i < bookshelf.size(); i++) {
            if (bookshelf.get(i).getAgeDate() > max) {
                max = bookshelf.get(i).getAgeDate();
                ind = i;
            }
        }
        return bookshelf.get(ind);
    }

    void sortByAge () {
        bookshelf.sort((o1, o2) -> {
            if (o1.getAgeDate() == o2.getAgeDate())
                return 0;
            else if (o1.getAgeDate() > o2.getAgeDate())
                return 1;
            else
                return -1;
        });
    }

    @Override
    public String toString () {
        String result = "";
        for (int i = 0; i < bookshelf.size(); i++) {
            Book book = bookshelf.get(i);
            String buff = book.getAuthor() + " - " + book.getName() + " - " + book.getAgeDate();
            result += buff + "\n";
        }
        result += "---------------------------";
        return result;
    }
}
