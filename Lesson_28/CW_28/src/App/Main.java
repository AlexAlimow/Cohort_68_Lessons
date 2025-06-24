package App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] Books = {
                new Book("Дюна","Френк Герберт","Научная фантастика",1963),
                new Book("Задача трех тел","Лю Цысинь","Научная фантастика",2006),
                new Book("Марсианин","Энди Вейер","Научная фантастика",2011),
                new Book("Автостопом по галактике","Дуглас Адамс","Научная фантастика",1979),
                new Book("Убийство в восточном экспрессе","Агата Кристи","Детектив",1934),
                new Book("Смерть на Ниле","Агата Кристи","Детектив",1937),
                new Book("Безмолвный свидетель","Агата Кристи","Детектив",1937)
        };
        BookArray  bookArray = new BookArray(Books);
        System.out.println("Список всех книг:");
        System.out.println(bookArray);
        System.out.println("\nПоиск по автору:\n" + getBooksByAuthor(scanner, bookArray));
        System.out.println("Проверка наличия книги:");
        hasBookByTitle(scanner, bookArray);

    }
    public static void hasBookByTitle(Scanner scanner, BookArray bookArray){

        System.out.println("Есть ли книга которая называется ?");
        String inputTitle = scanner.nextLine().trim();
        boolean result = bookArray.isBookByTitleExist(inputTitle);
        if( result){
            System.out.println("Такая книга есть");
        } else {
            System.out.println("Такой книги нет");
        }

    }
    public static  String getBooksByAuthor(Scanner scanner, BookArray bookArray) {
        System.out.println("Введите автора книги:");
        String inputAuthor = scanner.nextLine();
        String result = bookArray.getBooksByAuthor(inputAuthor);
        if (result.isEmpty()) {
            return "Нет книги с таким автором";
        } else {
            return result;
        }
    }
}
