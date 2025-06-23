package app;

/*
Задача 1
Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов:
 title (название), author (автор), genre (жанр), yearOfPublished (год издания).
  Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры
 */
public class Book {
    private String title;
    private String author;
    private String genre;
    private int yearOfPublished;

    public Book(String title, String author, String genre, int yearOfPublished) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearOfPublished = yearOfPublished;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        if (yearOfPublished > 0) {
            this.yearOfPublished = yearOfPublished;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public String toString() {
        return "Название книги: " + title + ", Автор: " +
                author + ", Жанр: " + genre +
                ", Год издания: " + yearOfPublished + ".";

    }
}

