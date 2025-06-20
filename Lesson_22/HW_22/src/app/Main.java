package app;
/*
Задача 1
Напишите метод void printDate(int day, int month, int year)
который получает 3 значения int и выводит на экран дату, следующем виде:

год месяц число
Copy
Например:

printDate(15,1,2008)
Вывод: 2008 январь 15
в рамках данной задачи предполагаем, что данные корректны
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        printDate(11, 3, 2023);
    }

    public static void printDate(int day, int month, int year) {
        String[] months = {
                "январь", "февраль", "март", "апрель",
                "май", "июнь", "июль", "август",
                "сентябрь", "октябрь", "ноябрь", "декабрь"
        };
        String monthName = months[month - 1];
        System.out.println(year + " " + monthName + " " + day);

    }
}
