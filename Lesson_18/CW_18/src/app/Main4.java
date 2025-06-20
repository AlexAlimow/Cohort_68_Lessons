package app;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        int index = 0;
        while (index < inputString.length() ) {
            System.out.println(inputString.charAt(index));
            index++;
        }
        System.out.println("================FOR ");
        String inputStr = "Hello Java";
        int index2 = 0;

        for (index2 = 0; index2 < inputStr.length(); index2++) {
            System.out.println(inputStr.charAt(index2));
        }

        System.out.println("-----------------reverse-----------");
        index = inputString.length() -1;
        while (index >= 0) {
            System.out.println(inputString.charAt(index));
            index--;
        }
//        for (index2 = 0; index2 >= inputStr.length(); index2 --) {
//            System.out.println(inputStr.charAt(index2));
//            index2--;
//        }
        System.out.println("---------------- без l");
        index = 0;
        String result = "";
        while (index < inputString.length()) {
             if (inputString.charAt(index) != 'l') {
              result += inputString.charAt(index);
             }
            index++;
        }
        System.out.println(result);

    }

}
