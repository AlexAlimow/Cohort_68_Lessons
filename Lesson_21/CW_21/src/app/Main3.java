package app;

import java.util.Scanner;

/*
Задача 3
Дан массив строк.
Пользователь вводит строку.
Программа должна сосчитать,
сколько раз введенная строка встречается в массиве.
 */
public class Main3 {
    public static void main(String[] args) {
        String[] arr = {"Jack", "John", "Ann", "Jack", "Nick", "Jack", "Ann"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для поиска: ");
        String findStr = scanner.nextLine();

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(findStr))
                counter ++;
        }
        System.out.println("Строка " + findStr + " встречается " + counter + " раз(а)");
    }
}
