package app;

public class Demo {
    public static void main(String[] args) {
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("========================");
        int i = 10;
        for (; i >= 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("========================");
        i = 10;
        for ( ; i >= 0 ; ) {
            System.out.println(i);
            i--;
        }
        System.out.println("========================");
        i = 10;
        for ( ; true  ; ) {
            if (i<0){
                break;
            }
            System.out.println(i);
            i--;
        }

    }
}
