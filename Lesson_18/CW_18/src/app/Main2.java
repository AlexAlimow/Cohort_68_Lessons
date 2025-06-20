package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите выражение: ");
        String inputStr = scanner.nextLine();
        int firstSpace = inputStr.indexOf(" ");
        int lastSpace = inputStr.lastIndexOf(" ");
        int num1 = Integer.parseInt(inputStr.substring(0,firstSpace));
        int num2 = Integer.parseInt(inputStr.substring(lastSpace +1 ));
        String operation = inputStr.substring(firstSpace + 1, firstSpace + 2);





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

