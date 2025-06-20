package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день:");
        int day = scanner.nextInt();
        System.out.println("Введите месяц:");
        int month = scanner.nextInt();
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        printDate(day, month, year);


// --------------------------------------------------
        printDate(11, 3, 2023);
    }

    public static void printDate(int day, int month, int year) {
        System.out.println(year + " " + getMonthTitle(month) + " " + day);

    }


    public static String getMonthTitle(int month) {
        String[] months = {
                "январь", "февраль", "март", "апрель",
                "май", "июнь", "июль", "август",
                "сентябрь", "октябрь", "ноябрь", "декабрь"
        };
        return months[month];

    }
}