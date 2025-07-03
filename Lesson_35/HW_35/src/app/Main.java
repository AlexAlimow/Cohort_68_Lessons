package app;

import app.model.Author;
import app.model.BookMulti;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static app.model.Task2.getBooksByAuthor;

public class Main {
    public static void main(String[] args) {

        Author a1 = new Author("Фрэнк", "Герберт", 1920);
        Author a2 = new Author("Брайан", "Герберт", 1947);
        Author a3 = new Author("Дж. К.", "Роулинг", 1965);

        List<BookMulti> books = new ArrayList<>();
        books.add(new BookMulti("Дюна", Arrays.asList(a1)));
        books.add(new BookMulti("Дети Дюны", Arrays.asList(a1, a2)));
        books.add(new BookMulti("Гарри Поттер", Arrays.asList(a3)));

        List<BookMulti> foundBooks = getBooksByAuthor(books, a1);
        System.out.println("Книги Фрэнка Герберта:");
        for (BookMulti b : foundBooks) {
            System.out.println(b);
        }
    }
}





