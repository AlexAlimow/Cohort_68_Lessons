package app;

/*
Задача 2

Напишите два метода,

int minIndex(int[] arr) метод который получает массив,
 а возращает индекс минимального элемента в этом массиве
int maxIndex(int[] arr) метод который получает массив,
а возращает индекс максимального элемента в этом массиве
Используя эти два метода, напишите программу,
которая меняет местами минимальный элемент массива с максимальным элементом массива.
 */
public class Main2 {
    public static void main(String[] args) {
        int[] arr = {10, 5, -3, 7, 20};
        System.out.println("До обмена:");
        printArray(arr);

        int minIndex = minIndex(arr);
        int maxIndex = maxIndex(arr);
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;


        System.out.println("после обмена:");
        printArray(arr);


    }

    public static int minIndex(int[] arr) {
        int indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }


    public static int maxIndex(int[] arr) {
        int indexMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > indexMax) {
                indexMax = i;
            }

        }
        return indexMax;

    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
