package app;

public class Main2 {
    public static void main(String[] args) {
    int[] arr = { 122,15,1,-5,0,-17};
        System.out.println("исходный массив");
        printArr(arr);
//        int minIdx = minIndex(arr);
//        int maxIdx = maxIndex(arr);
//        System.out.println("индекс минимального элемента : " + minIdx);
//        System.out.println("индекс максимального элемента : " + maxIdx);

//        int temp = arr[minIdx];
//        arr[minIdx] = arr[maxIdx];
//        arr[maxIdx] = temp;
//        System.out.println("Результат:");
//        printArr(arr);

        changeMethod(arr);

        System.out.println("Результат:");
        printArr(arr);




    }


    public static int minIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[minIndex] > arr[i]){
                minIndex = i;

            }
        }

        return minIndex;
    }

    public static int maxIndex(int[] arr){
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void changeMethod(int[] arr){
        int minIdx = minIndex(arr);
        int maxIdx = maxIndex(arr);
        int temp = arr[minIdx];
        arr[minIdx] = arr[maxIdx];
        arr[maxIdx] = temp;

    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

}
