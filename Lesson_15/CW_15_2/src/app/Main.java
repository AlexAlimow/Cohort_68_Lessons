package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str1 = scanner.nextLine();

        System.out.println("Вы ввели:" + str1);

        System.out.println("Введите число:");
        int intValue = scanner.nextInt();
        System.out.println("Введите второе число:");
        int intValue2 = scanner.nextInt();

        System.out.println("Первое число:" + intValue);
        System.out.println("Второе число:" + intValue2);
        System.out.println("Сумма:" + (intValue + intValue2));

        System.out.println("Введите дробное число:");
        double dblValue = scanner.nextDouble();
        System.out.println("Вы ввели:" +dblValue); // double 10.7 через точку


    }
}
