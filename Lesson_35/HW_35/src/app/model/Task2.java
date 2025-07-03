package app.model;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<BookMulti> getBooksByAuthor(List<BookMulti> books, Author targetAuthor) {
        List<BookMulti> result = new ArrayList<>();
        for (BookMulti book : books) {
            if (book.getAuthors().contains(targetAuthor)) {
                result.add(book);
            }
        }
        return result;
    }

}
