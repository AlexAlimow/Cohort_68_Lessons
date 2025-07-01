package app;

import app.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> myBooks = new ArrayList<>();
        myBooks.add(new Book("Гарри Поттер и тайная комната","Джулиан Роулинг"));
        myBooks.add(new Book("Алхимик","Паоло Коэльо"));
        myBooks.add(new Book("Дюна","Френк Герберт"));
        myBooks.add(new Book("Задача трех тел","Лю Цысинь"));
        myBooks.add(new Book("Марсианин","Энди Вейер"));
        myBooks.add(new Book("Автостопом по галактике","Дуглас Адамс"));
        myBooks.add(new Book("Убийство в восточном экспрессе","Агата Кристи"));
        myBooks.add(new Book("Смерть на Ниле","Агата Кристи"));
        myBooks.add(new Book("Идиот","Федор Достоевский"));

        String searchAuthor = "Агата";
        List<Book> foundBooks = getBookByAuthorName(myBooks, searchAuthor);
        printBooks(foundBooks);
        System.out.println("------------------------------------------");
        System.out.println("All books in list:");
        printBooks(myBooks);




    }
    public static ArrayList<Book> getBookByAuthorName(List<Book> list, String author){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book: list){
            if(book.getAuthor().toLowerCase().contains(author.toLowerCase())){
                result.add(book);
            }
        }
        return result;
    }

    public static void printBooks(List<Book> book) {
        if (book.isEmpty()) {
            System.out.println("Книги не найдены");
        } else {
            for (Book b : book) {
                System.out.println(b);

            }
        }
    }


}
/*
HW_33_TEXT
1. Создайте класс Book (название, автор). Создайте ArrayList<Book>.
Добавьте туда несколько объектов.
Напишите метод `ArrayList<Book> getBook (ArrayList<Book> list, String author)`
который возвращает список книг, заданного автора.
Распечатайте его из мейна.
1.2 adv.
Предусмотрите в задаче 1. возможность поиска книг по списку авторов для
конкретной книги НАПРИМЕР
Илья Ильф, Евгений Петров
Борис Стругацкий, Аркадий Стругацкий
 */