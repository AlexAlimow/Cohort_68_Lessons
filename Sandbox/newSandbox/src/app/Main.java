package app;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int[][] arrays = new int [5][5]; // пример синтаксиса двумерных массивов

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();

        }
        int[][] arr2 = new int[5][5];

        String textExample = "John";
        String textExample1 = "John";
        String textExample2 = "Tim";
        System.out.println(textExample.equalsIgnoreCase(textExample1));

    }
}
