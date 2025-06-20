package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Задача 1
Пользователь водит строку. Ваша задача получить новую строку,
которая будет состоять из букв исходной, стоящих на нечетных позициях. Например:

Ввод: "java is very easy"
Вывод: "aai eyes"
Copy
или

Ввод: "0123456"
Вывод: "135"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        String res = "";

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 != 0) {
                res += input.charAt(i);

            }


        }
        System.out.println(res);
        System.out.println("==== второй вариант=======");

        res = "";
        for (int i = 1; i < input.length(); i+=2) {
            res = res + input.charAt(i);

        }

    }
}
