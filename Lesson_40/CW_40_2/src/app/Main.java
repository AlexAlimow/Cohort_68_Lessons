package app;

public class Main {
    public static void main(String[] args) {

        // Анонимный класс
        // r - объект какого то класса,
        // который реализует интерфейс Runnable
        MyRunnable r = new MyRunnable() {
            private int currentNodeIndex = 0;
            @Override
            public void run() {
                System.out.println("hello from anonymous class");

            }
        };
        r.run();


    }
}
