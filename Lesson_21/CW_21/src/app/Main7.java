package app;

// дан массив int найти самое маленькое значение в этом массиве
public class Main7 {
    public static void main(String[] args) {
        int[] arr = {10, -3, 5, 21, 2, -10, 7, 9};
        int min = arr[0]; // Это назначение минимальным значением с индексом 0 внутри массива
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("минимальное значение в массиве:" + min);
    }
}
