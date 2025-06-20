package app;
/*
Написать метод, который создает и возвращает новый массив который является копией исходного,
 но в обратном порядке {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */
public class Main {
    public static void main(String[] args) {
        int[] originalArr = {10, 3, 3, 5, -9};
        int[] reverseArr = reverseArray(originalArr);

        System.out.println("Исходный массив: ");
        printArray(originalArr);
        System.out.println("результат: ");
        reverseArray(originalArr);
        printArray(reverseArr);



    }
    public static int[] reverseArray(int[] array){
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            res[array.length -1 - i] = array[i];

        }
        return res;
    }
    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
    }
}
