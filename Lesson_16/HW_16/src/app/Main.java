package app;

import java.util.Scanner;

public class Main {
    /*
    Задача 1
Пользователь вводит целое число.
Ваша задача определить может ли это число являться
валидным номером месяца (т.е. от 1 до 12) и записать
это значение в переменную boolean isMonthValid.
Если isMonthValid - программа должна выводить сообщение
"месяц корректный", иначе выводить сообщение: "ошибка ввода месяца".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число :");
        int value = scanner.nextInt();
        Boolean isMonthValid = value >= 1 && value <=12;

        if (isMonthValid) {
            System.out.println("Месяц корректный");
        } else {
            System.out.println("Ошибка ввода месяца");
        }

        scanner.nextLine();




    }
}
