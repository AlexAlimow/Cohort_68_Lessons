package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        while (a<=20) {
            System.out.println(a);
            a++;
        }
        int b = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println(b);
            b++;
        }

        Scanner scanner = new Scanner(System.in);

        // Ввод чисел
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        boolean validOperation = false;

        // Повторять, пока не будет введена корректная операция
        while (!validOperation) {
            System.out.print("Выберите операцию (+, -, *, /): ");
            String operation = scanner.next();

            int result;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    validOperation = true;
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    validOperation = true;
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    validOperation = true;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Ошибка: деление на ноль невозможно");
                    } else {
                        double divResult = (double) num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + divResult);
                        validOperation = true;
                    }
                    break;
                default:
                    System.out.println("Ошибка: неизвестная операция. Попробуйте ещё раз.");
            }
        }

        scanner.close();
    }
}
