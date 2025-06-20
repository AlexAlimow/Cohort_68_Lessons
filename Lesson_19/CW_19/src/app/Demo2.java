package app;

public class Demo2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Сейчас i = " + i);
            }


        }
        System.out.println("===========================");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Сейчас i = " + i);


        }


    }


}
