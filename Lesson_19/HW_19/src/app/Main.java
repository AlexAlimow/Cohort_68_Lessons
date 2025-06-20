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
        String inputString = scanner.nextLine();
        String result = "";

        for (int i = 1; i < inputString.length(); i += 2) {
            result = result + inputString.charAt(i);

        }
        System.out.println("Результат " + result);


        }
    }



