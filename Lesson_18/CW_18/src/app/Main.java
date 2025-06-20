package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Выберите операцию (+, -, *, /): ");
        String operation = scanner.nextLine();

        int result = 0;


        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль невозможно");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Ошибка: неизвестная операция");
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }





}

