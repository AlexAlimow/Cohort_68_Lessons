package app;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        String lowerStr = inputString.toLowerCase();
        String upperStr = inputString.toUpperCase();

        System.out.println(lowerStr);
        System.out.println(upperStr);

        String result = "";
        for (int i = 0; i < inputString.length(); i++) {

            char ch;

            if ( i == 0 || (i > 0 && result.charAt(i - 1) == ' ') ){
                ch = upperStr.charAt(i);
            }
            else {
                ch = lowerStr.charAt(i);
            }
            result += ch;
        }
        System.out.println("=====");
        System.out.println("Result = " + result);
    }
}






