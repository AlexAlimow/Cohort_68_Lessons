package app;

public class Main10 {
    public static void main(String[] args) {
        String str = "Hello Java";

        char[] charArray = str.toCharArray(); // возвращает массив из char входящих в строку
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + "   ");

        }

    }
}
