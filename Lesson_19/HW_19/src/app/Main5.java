package app;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int[] arr = new int[5];  // мы создали пустой массив
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число с индексом [" + i + "] :");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "      ");

        }
        System.out.println("===========================");

        String[] names = {"Jack", "Lena", "Ira", "Vlad"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);




        }


    }
}
