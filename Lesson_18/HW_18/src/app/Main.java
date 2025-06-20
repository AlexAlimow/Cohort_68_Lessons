package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите текстовую строку (Например hello java):");
        String input = myScanner.nextLine();


        int index = 0;
        while (index < input.length() && input.charAt(index) != ' ') {
            int i = input.charAt(index);
            System.out.println(i);
            index++;


        }

    }
}
