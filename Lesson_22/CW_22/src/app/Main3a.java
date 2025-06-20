package app;

public class Main3a {
    public static void main(String[] args) {
        int[] arr = {10, 4, -1, 14};

        // вывод на экран нашего исходного массива
        printArray(arr);
        System.out.println(); // Переходим на новую строчку

        // находим индекс первого минимального элемента начинаем с 0....
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        // переставляем элемент с индексом 0 в исходном массиве на найденное минимальный элемент
        //используем временную переменную temp
        int temp = arr[0];
        arr[0] = arr[indexMin];
        arr[indexMin] = temp;

        /// Находим индекс второго минимального элемента

        indexMin = 1; // Начинаем уже с индекса 1
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        // переставляем элемент с индексом 1 в исходном массиве на найденное минимальный элемент
        //используем временную переменную temp
        temp = arr[1]; // Начинаем уже с индекса 1
        arr[1] = arr[indexMin];
        arr[indexMin] = temp;

        // Выводим на экран уже измененный массив
        printArray(arr);


        System.out.println("---------------------------");
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
