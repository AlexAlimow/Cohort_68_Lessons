package app;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        m1(a);
        System.out.println("main a=: " + a);
        int[] arr = {1,2,3,4};
        m2(arr);
        System.out.println("main finish arr[0] = " + arr[0]);

        printArr(arr);
        System.out.println("-------------------");

        int[] copy = createCopy(arr);
        printArr(copy);


    }
    public static int m1(int a){
        System.out.println("m1 start a= " + a);
        a = 100;
        System.out.println("m1 finish a= " + a);
        System.out.println("-----------------");
        return a;
    }
    public static void m2(int[] arr){
        System.out.println("m2 start arr[0] = " + arr[0]);
        arr[0] = 1000;
        System.out.println("m2 finish arr[0] = " + arr[0]);
    }
    public static int[] createCopy(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
            return copy;

            }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
        }


