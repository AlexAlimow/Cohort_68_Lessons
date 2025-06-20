package app;

import java.util.Scanner;

public class Main4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long score = 0;
        int num = 0;
        do {
            System.out.println("Введите целое число или 0 для завершения :");
            num = scanner.nextInt();
            score += num;
        } while (num != 0);
        System.out.println("========");
        System.out.println("Сумма введенных чисел = " + score);

    }


}

