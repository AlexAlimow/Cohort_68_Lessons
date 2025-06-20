package app;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Задание 1
Ваша программа должна (используя Scanner) запросить

Возраст пользователя
имя пользователя
Именно в таком порядке, сначала возраст потом имя.
Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:

Jack (20)

Естественно, в результат должны подставится введенные данные
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст пользователя:");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите имя пользователя:");
        String userName = scanner.nextLine();

        System.out.println(userName + " (" + userAge + ")");
        System.out.println("=============================");

/*
Задание 2
Ваша программа должна (используя Scanner) запросить

Имя первого пассажира
количество груза первого пассажира (целое число)
имя второго пассажира
количество груза первого пассажира (целое число)
Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:

Пассажир 1: имя, багаж: xxx
Пассажир 2: имя, багаж: xxx
Всего багажа: yyy

Естественно, в результат должны подставится введенные данные.
                */
        System.out.println("Введите имя первого пассажира:");
        String passengerOneName = scanner.nextLine();
        System.out.println("Введите количество багажа (целое число):");
        int passengerOneBaggage = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите имя второго пассажира:");
        String passengerTwoName = scanner.nextLine();
        System.out.println("Введите количество багажа (целое число):");
        int passengerTwoBaggage = scanner.nextInt();
        int totalBaggage = passengerOneBaggage + passengerTwoBaggage;
        scanner.nextLine();

        System.out.println("Пассажир 1: " + passengerOneName + ", Багаж: " + passengerOneBaggage + " Кг");
        System.out.println("Пассажир 2: " + passengerTwoName + ", Багаж: " + passengerTwoBaggage + " Кг");
        System.out.println("Всего багажа: " + totalBaggage + " Кг");
        System.out.println("====================================");

/*
Задание 3 (чуть сложнее)
Исходные данные: есть длина и ширина комнаты, площадь паркета в одной упаковке.
Напишите программу, которая запрашивает эти данные у пользователя,
сохраняет эти данные в переменных, вычисляет и выводит в консоль,
сколько упаковок паркета необходимо купить для этой комнаты.

Например:

Длинна комнаты: 4.0
Ширина комнаты: 3.0
В одной упаковке: 3.5 метра

Площадь комнаты 12 м.  Необходимо 4 упаковки

Подсказка: Здесь вам может пригодиться преобразовать double -
количество упаковок получившееся при расчетах, к int
 */
        System.out.println("Введите длину комнаты:");
        String roomLengthStr = scanner.nextLine();
        double roomLength = Double.parseDouble(roomLengthStr);

        System.out.println("Введите ширину комнаты:");
        String roomWidthStr = scanner.nextLine();
        double roomWidth = Double.parseDouble(roomWidthStr);

        double parquetInOnePackage = 3.5;
        double roomArea = (roomLength * roomWidth);
        double packageCount = (roomArea / parquetInOnePackage);
        int packagesNeeded = (int) Math.ceil(packageCount); // Округление через ceil
        System.out.println("Площадь комнаты " + roomArea + " м" + " Необходимо " + packagesNeeded + " упаковки");


    }
}
