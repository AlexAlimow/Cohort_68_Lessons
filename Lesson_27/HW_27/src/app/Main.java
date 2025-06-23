package app;
/*
Задача 1
Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов:
 title (название), author (автор), genre (жанр), yearOfPublished (год издания).
  Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры
 */

import java.util.Scanner;

/*
Задача 2
Реализуйте класс BookArray, который управляет массивом книг. Класс должен похволять

вывести все книги на экран
вывести на экран все книги данного автора
ответит есть ли книга с заданным названием в массиве

 */
public class Main {
    public static void main(String[] args) {

        Book mybook1 = new Book("Алхимик", "Паоло Коэльо", "Роман", 1988);
        System.out.println(mybook1);
        System.out.println(mybook1.getTitle());
        System.out.println(mybook1.getYearOfPublished());

        Book[] myBooks = {
                new Book("Дюна", "Френк Герберт", "Научная фантастика", 1963),
                new Book("Задача трех тел", "Лю Цысинь", "Научная фантастика", 2006),
                new Book("Марсианин", "Энди Вейер", "Научная фантастика", 2011),
                new Book("Автостопом по галактике", "Дуглас Адамс", "Научная фантастика", 1979),
                new Book("Убийство в восточном экспрессе", "Агата Кристи", "Детектив", 1934),
                new Book("Смерть на Ниле", "Агата Кристи", "Детектив", 1937),
                new Book("Безмолвный свидетель", "Агата Кристи", "Детектив", 1937),
                mybook1
        };
        BookArray bookArray = new BookArray(myBooks);

        System.out.println("-----------------------------------------------------");
        System.out.println(bookArray);

        System.out.println("-----------------------------------------------------");
        bookArray.printAllBooks();

        System.out.println("-----------------------------------------------------");
        System.out.println("Все книги автора Агата Кристи:");
        bookArray.printBooksByAuthor("Агата Кристи");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги которую ищете: ");
        String searchTitleInArray = scanner.nextLine();


        if (bookArray.hasBookInArray(searchTitleInArray)) {
            System.out.println("Книга " + searchTitleInArray + " есть в библиотеке");
        } else {
            System.out.println("Книга " + searchTitleInArray + " не найдена в библиотеке");
        }


    }
}
