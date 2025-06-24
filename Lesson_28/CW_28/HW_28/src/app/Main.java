package app;
/*
       Задача 1
По образу и подобию кода написанного на занятие,
сделайте из вашего класса BookArray (в проектe про книги) динамический массив.
 Т.е. Ваша программа должна позволять пользователю
 вводить и обрабатывать любое количество книг
 При выполнении данного задания не используйте стандартный Java класс ArrayList
         */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookArray myBookArray = new BookArray();
        myBookArray.add(new Book("Алхимик", "Паоло Коэльо", "Роман", 1988));
        myBookArray.add(new Book("Алхимик2", "Паоло Коэльо", "Роман", 1988));
        myBookArray.add(new Book("Дюна", "Френк Герберт", "Научная фантастика", 1963));
        System.out.println("Добавили 3 книги: \n" + myBookArray.toStringReal());
        System.out.println("=====================================================================");

        myBookArray.add(new Book("Дюна2", "Френк Герберт", "Научная фантастика", 1963));
        myBookArray.add(new Book("Задача трех тел", "Лю Цысинь", "Научная фантастика", 2006));
        myBookArray.add(new Book("Задача трех тел2", "Лю Цысинь", "Научная фантастика", 2006));
        myBookArray.add(new Book("Марсианин", "Энди Вейер", "Научная фантастика", 2011));
        System.out.println("Добавили 4 книги: \n" + myBookArray.toStringReal());
        System.out.println("=====================================================================");


        myBookArray.add(new Book("Автостопом по галактике", "Дуглас Адамс", "Научная фантастика", 1979));
        myBookArray.add(new Book("Убийство в восточном экспрессе", "Агата Кристи", "Детектив", 1934));
        myBookArray.add(new Book("Смерть на Ниле", "Агата Кристи", "Детектив", 1937));
        myBookArray.add(new Book("Безмолвный свидетель", "Агата Кристи", "Детектив", 1937));
        System.out.println("Добавили еще 4 книги и теперь книг всего:" + myBookArray.size() + "\n" + myBookArray);
        System.out.println("=====================================================================");



    }

}




