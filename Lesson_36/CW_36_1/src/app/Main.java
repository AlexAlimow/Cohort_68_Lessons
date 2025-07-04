package app;

import app.model.Book;
import app.service.BookUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Book> myBooks = new ArrayList<>();
        myBooks.add(new Book("Дюна", "Френк Герберт"));
        myBooks.add(new Book("Дюна", "Френк Герберт"));
        myBooks.add(new Book("Дюна", "Френк Герберт"));
        myBooks.add(new Book("Дюна", "Френк Герберт"));
        myBooks.add(new Book("Задача трех тел", "Лю Цысинь"));
        myBooks.add(new Book("Марсианин", "Энди Вейер"));
        myBooks.add(new Book("Автостопом по галактике", "Дуглас Адамс"));
        myBooks.add(new Book("Убийство в восточном экспрессе", "Агата Кристи"));
        myBooks.add(new Book("Марсианин", "Энди Вейер"));

        Book book = new Book("Дюна","Френк Герберт");
        Book book1 = new Book("Марсианин","Энди Вейер");


        BookUtil.print(myBooks);
        BookUtil.count(myBooks,book);
        int count = BookUtil.count(myBooks, book);
        int count1 = BookUtil.count(myBooks, book1);

        System.out.println("Книга: [" + book + "]" + "встречается в списке " + count + " раз(а)");


        BookUtil.count(myBooks,book1);
        System.out.println("Книга: [" + book1 + "]" + "встречается в списке " + Collections.frequency(myBooks, book1) + " раз(а)");









    }

}

/*
Задача 1
Создайте класс книга Book (String title, String author). Создайте список из книг.
Реализуйте метод, который считает сколько раз заданная книга встречается в списке.

Задача 2
Создайте класс книга Book (String title, List<Author> authors).
В отличие от первой задачи, авторов может быть много,
и  Author - объект из 3х полей (firstName, lastName, int year)
 Создайте список из книг.
Реализуйте метод, который формирует список книг заданного автора
(т.е. если автор встречается в списке авторов книги, книга должна попасть в итоговый список)


 */
