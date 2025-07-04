package app.model;

import java.util.Collections;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }


    public boolean isAuthorExists(Author author) {
        return Collections.frequency(authors, author) > 0;  // equals у авторов иначе не работает

    }
}
