package app.model;

import java.util.ArrayList;
import java.util.List;



public class BookMulti {
    private String title;
    private List<Author> authors;

    public BookMulti(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " - " + authors;
    }
}

