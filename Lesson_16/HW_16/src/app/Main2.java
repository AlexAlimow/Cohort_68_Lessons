package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
Задача 2
В программе заданно 2 переменных: adminLogin и adminPass.
Пользователь вводит свои логин и пароль.
Если введенные логин и пароль совпадают с adminLogin и adminPass,
программа выдает сообщение: "доступ возможен", иначе "вы не опознаны"
 */
        String adminLogin = "admin";
        String adminPass = "1234";

        System.out.println("Введите логин администратора:");
        String userLogin = scanner.nextLine();

        System.out.println("Введите пароль администратова:");
        String userPass = scanner.nextLine();

        if (userLogin.equals(adminLogin) && userPass.equals(adminPass)) {
            System.out.println("Доступ возможен");
        } else {
            System.out.println("Вы не опознаны");
        }


    }
}
