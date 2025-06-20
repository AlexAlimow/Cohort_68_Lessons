package app;
// Создать копию заданного массива начиная с индекса start включительно и
// заканчивая индексом finish (не включительно)
public class Main5 {
    public static void main(String[] args) {
//        int[] arr = {10, -3, 0, 21, 2, 0, 7};
//        int start = 1;
//        int finish = 4;
//        int[] copyArr = new int[finish - start];
//
//        for (int i = start  ; i < finish; i++) {
//            copyArr[i - start] = arr[i];
//
//
//        }
//        for (int i = 0; i <copyArr.length ; i++) {
//            System.out.print(copyArr[i] + "  ");
//        }

        int[] arr = {10, -3, 0, 21, 2, 0, 7};
        int start = 1;
        int finish = 4;
        int[] copyArr = new int[finish - start];
        int j = 0; // индекс в массиве копии

        for (int i = start  ; i < finish; i++) {
            copyArr[j] = arr[i];  // copyArr[j++] = arr[i]; еще как вариант написания сразу плюс в переменную
            j++;

        }
        for (int i = 0; i <copyArr.length ; i++) {
            System.out.print(copyArr[i] + "  ");
        }



 /*       int[] copyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];

        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
        System.out.println();
        System.out.println("Массив копия: ");
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + "  ");
        }
    }

  */
    }
}
