package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*
        Задача 2
Пользователь водит целое число. Ваша задача определить,
является ли жто число простым. Напомню, простое число это то,
которое без остатка делится только на 1 и на само себя,
иными словами, не делится ни на какое число больше.
Например:

5 простое делится только на 1 и на 5
6 не простое делится на 1, 2, 3 и 6
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " - Простое число");
        } else {
            System.out.println(number + " - Не простое число");
        }

        System.out.println("===================================");

        if (number < 2) {
            System.out.println(number + " - Не простое число");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " - Не простое число");
                return;
            }
        }
        System.out.println(number + " - Простое число");
    }
}

