package app;

import java.util.Scanner;

/*
Задача 2
Дан массив строк. Необходимо вывести его на экран.
Далее программа должна запросить два целых числа - номера элементов,
 и поменять местами соответствующие элементы. После чего опять вывести массив на экран.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] stringArray = {"Alex", "Natalie", "Maja", "Sawah"};


        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i] + " - Под индексом " + i);
        }
        System.out.print("Введите индекс первого элемента для обмена: ");
        int i = scanner.nextInt();
        System.out.print("Введите индекс второго элемента для обмена: ");
        int j = scanner.nextInt();

        if (i >= 0 && i < stringArray.length && j >= 0 && j < stringArray.length) {
            String temporaryStr = stringArray[i];
            stringArray[i] = stringArray[j];
            stringArray[j] = temporaryStr;

            System.out.println("Массив после обмена: ");
            for (int k = 0; k < stringArray.length; k++) {
                System.out.println(stringArray[k] + " ");

            }


        }
    }


}


