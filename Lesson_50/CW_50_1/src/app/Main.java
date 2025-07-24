package app;

import app.exceptions.NotCorrectEmailFormatException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String email = null;
        while (email == null) {
            try {
                email = getEmail();
            } catch (NotCorrectEmailFormatException e) {
                System.out.println("Ошибка ввода email: " + e.getMessage());
                System.out.println("Повторите ввод");
            }
        }
        System.out.println("Email " + email);

    }

    public static String getEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой email");
        String email = scanner.nextLine().trim();
        // проверка
        if (email.length() < 5) {
            throw new NotCorrectEmailFormatException("Email должен быть больше 5 символов");
        }
        int indexAt = email.indexOf('@');
        if (indexAt == -1) {
            throw new NotCorrectEmailFormatException("Нет '@'");
        } else {
            if (indexAt != email.lastIndexOf('@')) {
                throw new NotCorrectEmailFormatException("Должен быть только один символ @");
            }

            if (email.startsWith("@")) {
                throw new NotCorrectEmailFormatException("Не должен начинаться с символа '@'");
            }

            if (email.endsWith("@")) {
                throw new NotCorrectEmailFormatException("Не должен заканчиваться с символа '@'");
            }

        }
        return email;
    }
}
