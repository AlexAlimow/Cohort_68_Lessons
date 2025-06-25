package app;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    /*
    Задача 2
    Используя класс ArrayList реализовать следующую программу:
    Пользователь вводит строки. Как только пользователь ввел строку Exit
    ваша программа должна вывести на экран все введенные пользователем строки, плюс сформировать статистику:

    сколько всего строк введено
    какая самая длинная строка
    какая самая короткая строка
 */

    public static void main(String[] args) {
        ArrayList<String> list = inputStrings();
        System.out.println(list);
        String shortestString = shortestString(list);
        System.out.println("Самая короткая строка: " + shortestString);
        String longestString = longestString(list) ;
        System.out.println("Самая длинная строка: " + longestString);

    }

    public static ArrayList<String> inputStrings() {

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите строку или \"exit\" для завершения:");
            String inputString = scanner.nextLine();
            if (inputString.equalsIgnoreCase("exit")) {
                System.out.println("Вы завершили ввод");
                break;
            } else {
                if (!inputString.isBlank()) {
                    list.add(inputString);
                }
            }
        }
        while (true);
        return list;
    }
    public static String shortestString (ArrayList<String> list){
        if(list.size() == 0){
            return "";
        }
        String shortestString = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            if (element.length() < shortestString.length()){
                shortestString = element;
            }
        }
        return shortestString;

    }

    public static String longestString (ArrayList<String> list){
        if(list.size() == 0){
            return "";
        }
        String longestString = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            if (element.length() > longestString.length()){
                longestString = element;
            }
        }
        return longestString;

    }





}
