package app.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book " + "Title name: " + title + " Author: " + author;
    }
}

