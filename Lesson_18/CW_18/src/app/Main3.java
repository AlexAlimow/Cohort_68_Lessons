package app;

public class Main3 {
    public static void main(String[] args) {

        /* while

            while (Условие цикла) - пока условия выполняется - True {
                тело -
                1.
                2.
                3.
                ....
            }
         */
        int a = 0;
        while (a < 3) {
            System.out.println("a = " + a);
            a++;
        }

        /*
        2.for

           for ( инит;  условие; измен  ) {

           }

                  */

        for (int b = 0; b < 3; b++) {
            System.out.println("b = " + b);

        }

        /*

        do ... while

        do{
           тело цикла
        } while ( условие )
         */
        System.out.println("_______________Do...While_______________");
        do {
            System.out.println("a = " + a);
            a++;
        } while (a < 3);
    }
}

