package app;

import com.sun.java.accessibility.util.AccessibilityListenerList;

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
        String[] arrayStr = {"Jack", "Elly", "John", "Richard","Adam","Adam","Kerry","Adam","Elly","Jack","Jack"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для поиска:");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].equals(input)){
                count ++;
            }
        }
        System.out.println("Строка " + input + " встречается " + count + " раз(а).");
            
        }
    }

