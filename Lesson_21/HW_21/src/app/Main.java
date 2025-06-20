package app;

/*
Задача 1
Дано: Массив double из 12 значений - каждое значение доход от продаж за соответствующий месяц. Ваша задача:
посчитать доход за весь год
найти месяц (номер месяца) с самым большим доходом
 */
public class Main {
    public static void main(String[] args) {
        double[] salesIncome = {100, 200, 300, 400, 500, 600, 700, 800, 900, 100, 200, 300};
        double sum = 0;
        double max = salesIncome[0];
        for (int i = 0; i < salesIncome.length; i++) {
            sum += salesIncome[i];
            if (salesIncome[i] >= max) {
                max = salesIncome[i];
            }


        }
        System.out.println("Доход за весь год составил: " + sum);
        System.out.println("самый большой доход в месяц составил: " + max);

    }
}
