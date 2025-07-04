package app;

import app.model.Author;
import app.model.Book;
import app.service.BookUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Author> author1 = new ArrayList<>();
        List<Author> author2 = new ArrayList<>();

//        author1.add(new Author("Лю","Цысинь",2006));
//        author1.add(new Author("Энди ","Вейер",2011));
//        author1.add(new Author("Дуглас","Адамс",1979));
        author1.add(new Author("Агата","Кристи",1934));


        author2.add(new Author("Френк","Герберт",1963));

        List<Book> books = new ArrayList<>();
        books.add(new Book("Дюна",author2));

        books.add(new Book("Безмолвный свидетель",author1));
        books.add(new Book("Убийство в восточном экспрессе",author1));
        books.add(new Book("Смерть на Ниле",author1));

        BookUtil.print(books);
        Author author = new Author("Агата","Кристи",1934);

        List<Book> booksByAuthor = BookUtil.findBooksByAuthor(books, author);

        System.out.println("-------------------");
        BookUtil.print(booksByAuthor);


    }


}
