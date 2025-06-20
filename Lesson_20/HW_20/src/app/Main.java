package app;

import java.util.Scanner;

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
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[5];

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Введите имя с индексом [" + i + "] :");
            stringArray[i] = scanner.nextLine();


        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i] + "    ");

        }

    }
}
