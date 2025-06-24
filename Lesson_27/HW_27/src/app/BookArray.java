package app;

/*
Задача 2
Реализуйте класс BookArray, который управляет массивом книг. Класс должен позволять
вывести все книги на экран
вывести на экран все книги данного автора
ответит есть ли книга с заданным названием в массиве
 */
public class BookArray {
    private Book[] arr;

    BookArray(Book[] arr) {
        this.arr = arr;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + "\n";

        }
        return result;
    }

    public void printBooksByAuthor(String author) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAuthor().equalsIgnoreCase(author)) {
                System.out.println(arr[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книг автора \"" + author + "\" не найдено.");
        }
    }

    public void printAllBooks() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Все книги в массиве:" + System.lineSeparator()  + arr[i]);
        }
    }

    public boolean hasBookInArray(String title) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTitle().equalsIgnoreCase(title)) {
                return arr[i].getTitle().equalsIgnoreCase(title);
            }
        }
        return false;
    }

}






