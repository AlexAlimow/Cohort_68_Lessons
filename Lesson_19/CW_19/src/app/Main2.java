package app;

/*
    Задача 2
Напишите программу, которая просит пользователя ввести строку и 1 символ.
Ваша программа должна считать, сколько раз заданный символ встречается во введенной строке

Например:

hello java
a

результат: 2
     */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputStr = scanner.nextLine();

        System.out.println("Введите один символ:");
        String charString = scanner.nextLine();

        char findChar = charString.charAt(0);
        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if (ch == findChar) {
                count++;
            }

        }
        System.out.println("Символ '" + findChar + "' встречается " + count + " раз в строке ");

        System.out.println("=======================While=============================");


        count = 0;
        int i = 0;
        while (i < inputStr.length()) {
            char ch = inputStr.charAt(i);
            if (ch == findChar) {
                count++;
            }
            i++;
        }
        System.out.println("Символ '" + findChar + "' встречается " + count + " раз в строке ");
    }
}

