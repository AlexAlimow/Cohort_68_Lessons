package app;

import app.exceptions.NotCorrectEmailFormatException;
import app.exceptions.NotCorrectEmailFormatException2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
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
        List<String> errors = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой email");

        String email = scanner.nextLine().trim();

        // проверка
        if (email.length() < 5) {
            errors.add("Email должен быть больше 5 символов");
        }
        int indexAt = email.indexOf('@');
        if (indexAt == -1) {
            errors.add("Нет '@'");
        } else {
            if (indexAt != email.lastIndexOf('@')) {
                errors.add("Должен быть только один символ @");
            }

            if (email.startsWith("@")) {
                errors.add("Не должен начинаться с символа '@'");
            }

            if (email.endsWith("@")) {
                errors.add("Не должен заканчиваться с символа '@'");
            }

        }
        if (!errors.isEmpty()){
            throw new NotCorrectEmailFormatException2(errors);
        }
        return email;
    }
}