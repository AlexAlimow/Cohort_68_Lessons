package app;
/*
Задача 2
Используя класс ListArray реализовать следующую программу:
Пользователь вводит строки. Как только пользователь ввел строку Exit
ваша программа должна вывести на экран все введенные пользователем строки, плюс сформировать статистику:

сколько всего строк введено
какая самая длинная строка
какая самая короткая строка
 */


import java.util.ArrayList;
import java.util.Scanner;

public class UserInputString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        list.add(scanner.nextLine());

        while (true) {
            System.out.println("Введите строку (или exit для выхода) :");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Вы закончили ввод");
                break;
            }
            list.add(input);
        }

        System.out.println("Все введённые вами строки :");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
        System.out.println("Всего строк: " + list.size() + System.lineSeparator());

        if (!list.isEmpty()) {
            String shortest = list.get(0);
            String longest = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (str.length() < shortest.length()) {
                    shortest = str;
                }
                if (str.length() > longest.length()) {
                    longest = str;
                }
            }

            System.out.println("Самая короткая строка: " + shortest);
            System.out.println("Самая длинная строка: " + longest);
        } else {
            System.out.println("Строки не найдены");

        }

    }

}









