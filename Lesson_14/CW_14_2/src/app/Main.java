package app;

public class Main {
    public static void main(String[] args) {


        char chA = 'A'; // Всегда одинарные кавычки

        /*
        65 - A
        66 - B
        67 - C
        ----- таблица аски

         */
        int intChA = (int) chA;
        System.out.println("символ : " + chA + " имеет код - " + intChA);

        int diff = 32; // проведение в маленькую
        System.out.println((char) (chA - 20));

        System.out.println((char) (chA + diff));
        System.out.println(chA + diff);

    }
}
