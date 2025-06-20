package app;

import java.util.Scanner;

/*
Задача 1
Напишите программу, которая просит пользователя ввести строку
 и выводит на экран первое слово введенной строке,
  по-буквам, в столбик. Задачу необходимо реализовать двумя видами цикла из трех.

Например:

hello java

h
e
l
l
o
Copy
Ограничения:

если исходная строка из одного слова, выводим всю строку
слова разделены пробелом
в рамках этой задачи нельзя использовать substring
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.next();

//        int index = 0;
//        while (index < input.length() && input.charAt(index)!= ' ') {
//            char ch = input.charAt(index);
//            System.out.println(ch);
//            index++;
//        }

        System.out.println("=======================");

//        for(index = 0;index < input.length() && input.charAt(index)!= ' '; index++ ) {
//            char ch = input.charAt(index);
//            System.out.println(ch);
//        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }

        }
        System.out.println("Finish");

        System.out.println("===============While with Break");

        int index = 0;
        while (index < input.length()) {
            char ch = input.charAt(index);
            if (ch == ' ') {
                break;
            }
            System.out.println(ch);
            index++;
        }
        System.out.println("===============For with Break");

        for (index = 0; index < input.length(); index++) {
            char ch = input.charAt(index);
            if (ch == ' ') {
                break;
            }


        }
    }
}



