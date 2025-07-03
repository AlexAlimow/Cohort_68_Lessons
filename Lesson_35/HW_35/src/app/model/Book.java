package app.model;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return title + " - " + author;
    }

    public class Task1 {
        public static int countBookOccurrences(List<Book> books, Book target) {
            int count = 0;
            for (Book b : books) {
                if (b.equals(target)) {
                    count++;
                }
            }
            return count;
        }
    }

}
