package app;
// Дан массив найти сумму всех элементов массива которые больше заданного значения
public class Main9 {
    public static void main(String[] args) {
        int[] arr = {10, -3, 5, 21, 2, -10, 7, 9};
        long summa = 0;
        int limitValue = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > limitValue) {
                summa += arr[i]; // summa = summa + arr[i]

            }

        }
        System.out.println("Сумма всех элементов в массиве: " + summa);
    }
}
