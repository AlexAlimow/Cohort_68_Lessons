package app.service;

import app.model.Book;

import java.util.List;

public class BookUtil {

    private BookUtil(){}

    public static int count(List<Book> list, Book findBook){
        int count = 0;
        for (Book book : list){
            if(book.equals(findBook)){
                count++;
            }
        }
        return  count;
    }

    public static void print(List<Book> list){
        int count = 0;
        for (Book book : list){
            System.out.println(++count +". " + book);
        }
    }



}
