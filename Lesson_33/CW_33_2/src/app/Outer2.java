package app;

public class Outer2 {
    private  static int var1 = 33;
    private int var2 = 44;

    class Inner{
        public void run(){
            System.out.println(var1);
            System.out.println(var2);
        }
    }
}
