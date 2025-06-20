package app;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputStr = scanner.nextLine();

        System.out.println("Введите один символ:");
        String charString = scanner.nextLine();

        char findCharUpper = charString.toUpperCase().charAt(0);
        char findCharLower = charString.toLowerCase().charAt(0);


        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if (ch == findCharUpper || ch == findCharLower) {
                count++;
            }

        }
        System.out.println("Символ '" + charString + "' встречается " + count + " раз в строке ");
    }
}
