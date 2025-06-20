package app;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long score = 0;
        while (true){
            System.out.println("Введите целое число или 0 для завершения :");
            int num = scanner.nextInt();

            if (num == 0){

                break;
            }
            score += num;
        }

        System.out.println("========");
        System.out.println("Сумма введенных чисел = " + score);
    }
}
