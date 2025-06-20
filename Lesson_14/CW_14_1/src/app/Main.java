package app;

public class Main {

    public static void main(String[] args) {
        /* Задание 1
создайте новый модуль. В модуле создайте package c названием app.
Создайте новый класс. Создайте метод main.
Исходные данные: Цена за один билет в кино составляет 4 у.е. У вас 19 у.е.
 Напишите программу, которая сохраняет эти данные в переменных,
 вычисляет и выводит в консоль, сколько билетов вы можете купить.
 Сколько денег у вас останется, после покупки максимально возможного количества билетов.
 */
        int ticketPrice = 4;
        int availableMoney = 19;


        int availableTickets = availableMoney / ticketPrice;
        int moneyLeft = availableMoney % ticketPrice;

        System.out.println("Доступно билетов " + availableTickets);
        System.out.println("Остаток денег " + moneyLeft);

        System.out.println("====================================");

        /*
        Создайте новый класс. Создайте метод main. Объявите 2 переменные:

цена товара без налога;
налог;
Напишите программу, которая вычисляет цену товара с налогом
Например, так:
Введите цену товара: 200.0
Налон составит: 19
Цена с налогом 238.0
         */
        double price = 200;
        double taxPercent = 19;

        double totalTax = price * (taxPercent / 100);
        double result = totalTax + price;

        System.out.println("Цена товара:" + price + " Euro");
        System.out.println("Сумма налога:" + taxPercent + " %");
        System.out.println("сумма налога: " + totalTax + " Euro");
        System.out.println("Цена на товар с учетом налога составит: " + result + " Euro");

        System.out.println("===========================================================");



        long a = 123466787654L; // L большая в конце используется при типе переменных long
        long b = 1_233_456_789; // _ используется для разделения разрядов
        float f = 7689.7F; // F большая в конце при объявлении при типах float
        boolean isOk = true; // true / false всегда с маленькой буквы

        // переменные типа int положить в double без cast никак нельзя

        double x = 19.783;
        int y = (int) x; // (int) в скобках это команда на явное преобразования данных к типу int
        System.out.println(y);







    }

}
