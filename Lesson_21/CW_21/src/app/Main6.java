package app;
// Создать копию заданного массива скопировать только те элементы которые делятся на 3 без остатка

public class Main6 {
    public static void main(String[] args) {
        int[] arr = {10, -3, 0, 21, 2, 0, 7,9};
        int counter = 0; // сколько элементов исходного массива делятся на 3
        for (int i = 0; i <arr.length ; i++) {
            if ( arr[i] % 3 == 0) {
                counter ++;
            }
        }
        int[] arrCopy = new int[counter];

        // копирование элементов из исходного массива в копию
        int j = 0;
        System.out.println("Количество элементов которые делятся на 3: " + counter);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0){
                arrCopy[j] = arr[i];
                j++;
            }
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
        System.out.println();
        System.out.println("Массив копия: ");
        for (int i = 0; i < arrCopy.length; i++) {
            System.out.print(arrCopy[i] + "  ");
        }

        }




    }

