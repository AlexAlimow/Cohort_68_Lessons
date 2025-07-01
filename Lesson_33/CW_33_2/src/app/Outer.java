package app;

public class Outer {
    private static int var1 = 22;
    private int var2 = 33;

    static class Inner{

        public void run(){
            System.out.println(var1);
//            System.out.println(var2); Error
        }
    }
}
