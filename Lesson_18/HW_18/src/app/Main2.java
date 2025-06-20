package app;

import java.util.Scanner;

public class Main2 {
    /*
    Задача 2
Напишите программу, которая просит пользователя ввести строку и 1 символ.
Ваша программа должна считать, сколько раз заданный символ встречается во введенной строке

Например:

hello java
a

результат: 2
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        System.out.print("Введите символ: ");
        char myChar = scanner.next().charAt(0);

        int count = 0;
        int i = 0;

        while (i < input.length()) {
            if (input.charAt(i) == myChar) {
                count++;
            }
            i++;
        }

        System.out.println("Результат: " + count);
    }
}
