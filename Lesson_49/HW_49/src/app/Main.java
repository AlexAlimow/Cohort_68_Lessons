package app;

import app.exceptions.NotCorrectEmailFormatException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        try {
            String email = askForEmail();
            System.out.println("Вы ввели корректный email: " + email);
        } catch (NotCorrectEmailFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String askForEmail() throws NotCorrectEmailFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email: ");
        String input = scanner.nextLine().trim();

        List<String> errors = new ArrayList<>();

        if (input.length() < 5) {
            errors.add("строка короче 5 символов");
        }
        int atIndex = input.indexOf('@');

        if (atIndex == -1) {
            errors.add("Отсутствует символ '@'");
        } else {
            if (input.lastIndexOf('@') != atIndex) {
                errors.add("Должен быть только один символ @ ");
            }
            if (atIndex == 0) {
                errors.add("@ не должен быть первым символом");
            }
            if (atIndex == input.length() - 1) {
                errors.add("@ не должен быть последним символом");
            }
            if (input.startsWith(".")) {
                errors.add("точка не должна быть первым символом");
            }
            if (input.endsWith(".")) {
                errors.add("email не должен заканчиваться на точку");
            }
            if (input.contains("..")) {
                errors.add("email не должен содержать две точки подряд");
            }
            String domainPart = input.substring(atIndex + 1);
            if (!domainPart.contains(".")) {
                errors.add("после @ должна быть хотя бы одна точка (например: gmail.com)");
            }
        }
        if (!errors.isEmpty()) {
            throw new NotCorrectEmailFormatException(errors);
        }
        return input;
    }
}


