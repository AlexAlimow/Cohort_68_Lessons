package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Задача 1
Напишите программу, которая позволяет пользователю вводить целые числа.
Как только пользователь введет 0 - считаем что ввод закончен.
Программа должна вывести на экран все введенные числа и их сумму
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        inputNumber(numList);

    }


    public static void inputNumber(List<Integer> numList) {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Введите целое число: (0 - Завершить ввод)");

        while (true) {
            System.out.print("Число: ");
            input = scanner.nextInt();
            if(input== 0){
                break;

            }
            numList.add(input);
        }
        int sum = 0;
        for (int num : numList){
            sum += num;
        }
        System.out.println("Введённые числа: " + numList);
        System.out.println("Сумма: " + sum);
    }
}
