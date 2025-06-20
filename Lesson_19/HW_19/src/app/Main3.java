package app;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        /*
        Задача 3 (сложнее, по желанию)
Пользователь вводит целое число. Ваша задача определить, сумму разрядов этого числа.
Например, ввели число 2317
Нужно посчитать: 2 + 3 + 1 + 7
Ответ: 13
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        int sum = 0;
        System.out.println("Вы ввели: " + number);

        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;

        }
        System.out.println("Сумма цифр: " + sum);
    }
}
