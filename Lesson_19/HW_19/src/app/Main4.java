package app;

public class Main4 {
    public static void main(String[] args) {
        int[] intArray = {10, 19, 30, 20, 21, 40}; // массив целых чисел

        System.out.println(intArray[0]);  // выводим первый элемент массива
        System.out.println(intArray[1]);  // выводим второй элемент массива
        intArray[0] = 1000;
        System.out.println(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("[" + "]" + intArray[i] + "   ");

        }

    }
}
