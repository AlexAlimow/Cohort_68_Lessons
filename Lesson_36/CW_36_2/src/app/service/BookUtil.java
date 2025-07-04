package app.service;

import app.model.Author;
import app.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookUtil {
    private BookUtil() {
    }

    public static List<Book> findBooksByAuthor(List<Book> books, Author author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isAuthorExists(author)) {
                result.add(book);
            }
        }

        return result;
    }

    public static void print(List<Book> list){
        int count = 0;
        for (Book book : list){
            System.out.println(++count +". " + book);
        }
    }
}
