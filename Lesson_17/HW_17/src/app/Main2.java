package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
/*
Задача 2
Напишите программу, которая просит пользователя ввести
 два числа и выбрать операцию умножить, сложить, умножить или поделить.
 В качестве результата система должна выводить строку вида:

3 * 3 = 9

Естественно, числа и операция должны зависеть от введенных данных.


 */
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Выберите операцию (+, -, *, /): ");
        String operation = scanner.next();

        int result;


        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль невозможно");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Ошибка: неизвестная операция");
        }

    }
}


