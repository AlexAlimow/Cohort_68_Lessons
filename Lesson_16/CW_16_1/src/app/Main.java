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
//        System.out.println("Введите возраст:");
//        int age= scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.println("Введите имя:");
//        String name = scanner.nextLine();
//
//        System.out.println(name + " (" + age + ")");


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
//        System.out.println("Введите имя первого пассажира:");
//        String passer1Name = scanner.nextLine();
//
//        System.out.println("Введите массу багажа первого пассажира (целое число):");
//        int baggage1 = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Введите имя второго пассажира:");
//        String passer2Name = scanner.nextLine();
//
//        System.out.println("Введите массу багажа второго пассажира (целое число):");
//        int baggage2 = scanner.nextInt();
//
//        int totalBaggage = baggage1 + baggage2;
//        System.out.println("Пассажир 1: " + passer1Name + ", багаж: " + baggage1);
//        System.out.println("Пассажир 2: " + passer2Name + ", багаж: " + baggage2);
//        System.out.println("Всего багажа: " + totalBaggage);
//        System.out.println("====================================================");



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
        double roomLength = scanner.nextDouble();


        System.out.println("Введите ширину комнаты:");
        double roomWidth = scanner.nextDouble();


        System.out.println("Введите площадь паркета в одной упаковке:");
        double inOnePackage = scanner.nextDouble();

        double roomArea = roomLength * roomWidth;
        int boxForBuy = (int)Math.ceil(roomArea / inOnePackage);  // округление с помощью библиотеки Math и метода ceil



        System.out.println("Площадь комнаты:" + roomArea);
        System.out.println("Вам необходимо " + boxForBuy + " упаковок.");





    }


}
