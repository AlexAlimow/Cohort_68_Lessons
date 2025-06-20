package app;

import java.util.Scanner;

public class Main5 {
            /*
Задача 2
Напишите программу, которая запрашивает у пользователя три числа.
Программа должна определить наибольшее из трех чисел.

Например:
Ввод: -3, 10, 7 -> Результат: 10
Ввод: 9, 3, 9 -> Результат: 9

         */

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scaner.nextInt();

        System.out.println("Введите второе число:");
        int b = scaner.nextInt();

        System.out.println("Введите третье число:");
        int c = scaner.nextInt();

        int maxNumber = a;

        if (b > maxNumber) {
            maxNumber = b;
        }
        if (c > maxNumber) {
            maxNumber = c;
        }
        System.out.println("Наибольшее число: " + maxNumber);


    }
}
