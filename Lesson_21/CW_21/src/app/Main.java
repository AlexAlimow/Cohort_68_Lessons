package app;
/*
Задача 1
Реализовать программу, которая просит пользователя ввести 5 имен,
 создает массив с этими именами и выводит их на экран:
Ввод:

jack
jonh
ann
lena
nick
Copy
Вывод:

0.jack
1.jonh
2. ann
3.lena
4.nick
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int namesQuantity = 5;
        String[] names = new String[namesQuantity];

        for (int i = 0; i < names.length; i++) {
            System.out.println("для " + "[" + (i + 1) + "]" + " Введите имя:");
            names[i] = scanner.nextLine();


        }
        for (int i = 0; i < names.length; i++) {
            System.out.print("names[" + (i + 1) + "] " + names[i] + "  ");
        }
    }
}
