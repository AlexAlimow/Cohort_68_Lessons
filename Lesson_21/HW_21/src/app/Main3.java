package app;
/*
Задача 3
Дан массив int. Написать программу, которая ищет самый маленький элемент массива
и меняет его с первым элементам (т.е. с элементом с индексом 0)
Потом меняет местами второй самый маленький элемент
с элементом с индексом 1. Например: Например: {10,5,-1,4,14} -> {-1,4,10,5,14}
 */
public class Main3 {
    public static void main(String[] args) {
        int[] myArray = {10, 5, -1, 4, 14};
        int firstMinIndex = 0;
        int secondMinIndex = 1;


        System.out.println("Исходный массив:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i <myArray.length ; i++) {
            if (myArray[i] < myArray[firstMinIndex]){
                firstMinIndex = i;
            }
        }


        int temp = myArray[0];
        myArray[0] = myArray[firstMinIndex];
        myArray[firstMinIndex] = temp;

        for (int i = 1; i < myArray.length ; i++) {
            if( myArray[i] < myArray[secondMinIndex]) {
                secondMinIndex = i;

            }
        }
        temp = myArray[1];
        myArray[1] = myArray[secondMinIndex];
        myArray[secondMinIndex] = temp;

        System.out.println("================");
        System.out.println("Массив после изменения:");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "  ");
        }






    }
}
