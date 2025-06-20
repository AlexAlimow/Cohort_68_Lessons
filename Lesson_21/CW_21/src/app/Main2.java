package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*
Задача 2
Дан массив строк. Необходимо вывести его на экран.
Далее программа должна запросить два целых числа - номера элементов,
 и поменять местами соответствующие элементы. После чего опять вывести массив на экран.
 */

        String[] arr = {
                "Hello java"
                , "Hello c"
                , "Hello JS"
                , "Hello C++",
                "Hello Swift"
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индексы элементов, которые нужно поменять местами:");
        System.out.println("Первый индекс:");
        int index1 = scanner.nextInt();
        System.out.println("Второй индекс:");
        int index2 = scanner.nextInt();

        boolean isInputCorrect = index1 >= 0 && index2 >= 0 && index1 < arr.length && index2 < arr.length;
        boolean isIndexesEquals = index1 != index2;
        if (isInputCorrect && isIndexesEquals){
            String temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        } else if (!isInputCorrect) {
            System.out.println("Введены некорректные индексы");
        } else {
            System.out.println("Индексы должны быть разные");
        }
        System.out.println("Получилось:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }

    }
}
