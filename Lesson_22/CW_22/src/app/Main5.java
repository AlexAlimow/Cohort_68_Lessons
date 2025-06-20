package app;

public class Main5 {
    public static void main(String[] args) {
        int[] massive1 = {3, 2, -1};
        int[] massive2 = {16, 4, 2, 4, 76, 8, 5, -19};
        int[] massive3 = {8, 5, -19, 200};
        String[] names = {"aa","bb"};


        printArray(massive1);
        System.out.println("---------------");
        printArray(massive2);
        System.out.println();
        printArray(massive3);
        System.out.println("---------------------");

        System.out.println("сумма первого массива: ");
        long sum1 = sumArray(massive1);
        System.out.println(sum1);

        long sum2 = sumArray(massive2);
        System.out.println("сумма второго массива: ");
        System.out.println(sum2);

        long sum3 = sumArray(massive3);

        System.out.println(sum1 + sum2 + sum3);


        System.out.println(temp("Java world", 1));


    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");


        }

    }
    public static long sumArray(int[] arr){
        long result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
    public static String temp(String str, int a){
        return a + " " + str + " " + a;
    }
}
