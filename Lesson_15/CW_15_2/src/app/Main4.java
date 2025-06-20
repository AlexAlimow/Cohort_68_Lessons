package app;
// Решение в Scanner номер 2 получением строчки и преобразованием строчки в число * (parsing)
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        String numStr = scanner.nextLine(); // Получили число как строку
        int i = Integer.parseInt(numStr); // Преобразовали в число Int -> Parsing
        System.out.println("Число:" + i);

        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println("Строка:" + str);

        System.out.println("=================Finish================");



        // исправление в Main3 и Main4
    }
}
