package app;
import java.util.Scanner;

public class Main4 {

    /*
    Задача 4 (по желанию)
Пользователь вводит email ваша задача проверить,
может ли введенная строка быть корректным email.
Email корректен если он:
содержит @
длиннее 8 символов
содержит .
@ и . не последний и не первый символ
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите email: ");
        String email = scaner.nextLine();

        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");
        boolean longEnough = email.length() > 8;

        boolean atNotEdge = hasAt && email.indexOf("@") != 0 && email.indexOf("@") != email.length() -1;
        boolean dotNotEdge = hasDot && email.indexOf(".") != 0 && email.indexOf(".") != email.length() -1;

        boolean isEmailValid = longEnough && hasAt && hasDot && atNotEdge && dotNotEdge;


        if (isEmailValid) {
            System.out.println("Email корректен");
        }else {
            System.out.println("Ошибка, Email не корректен !");
        }


    }
}
