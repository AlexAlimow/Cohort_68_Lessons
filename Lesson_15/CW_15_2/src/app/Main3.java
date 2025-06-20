package app;

import java.util.Scanner;

// Решение номер 1 в Scanner -> исправление потока
public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int i = scanner.nextInt();
        scanner.nextLine(); // исправили, очистили поток
        System.out.println("Число:" + i);

        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println("Строка:" + str);

        System.out.println("=================Finish================");

        // исправление в Main3 и Main4

    }
}
