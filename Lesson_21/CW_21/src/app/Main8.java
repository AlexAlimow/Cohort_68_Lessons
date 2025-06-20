package app;
// Дан массив найти сумму всех элементов массива
public class Main8 {
    public static void main(String[] args) {
        int[] arr = {10, -3, 5, 21, 2, -10, 7, 9};
        long summa = 0;

        for (int i = 0; i < arr.length; i++) {
            summa += arr[i]; // summa = summa + arr[i]

        }
        System.out.println("Сумма всех элементов в массиве: " + summa);
    }
}
