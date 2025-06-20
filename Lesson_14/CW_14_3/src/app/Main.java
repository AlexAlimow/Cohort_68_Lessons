package app;

public class Main {
    public static void main(String[] args) {


        //String s1 = new String("Hello"); могло бы быть так, но нет...

        String str = "hello"; // используем именно двойные кавычки не как в char одинарные
        String str2 = "Java";

        System.out.println(str + " " + str2); // для строк проходит объединение строк

        System.out.println(str + 2); // все что присоединяю к строке, все преобразуется в строку конкатенация

        double f = 10.5;
        System.out.println(str + f); // "hello" + "10.5" -> "hello10.5"

        boolean isOk = true;
        System.out.println(str + isOk); // все что присоединяется к строке становиться строкой

        String myString = "Hello Java!";
        int lenght = myString.length(); // сколько символов в строке myString
        String toUpperCase = myString.toUpperCase();
        String toLowerCase = myString.toLowerCase();

        System.out.println("строка: " + myString);
        System.out.println("Длина строки: " + lenght);
        System.out.println("Строка заглавными буквами: " + toUpperCase);
        System.out.println("Строка строчными буквами: " + toLowerCase);
        System.out.println("Первый символ (char) в строке " + myString.charAt(0));
        System.out.println("Второй символ (char) в строке " + myString.charAt(1));
        System.out.println("Последний символ (char) в строке " + myString.charAt(myString.length()-1));  // Индекс последнего символа в строке

        int lastIndex = myString.length()-1; // Индекс последнего символа в строке

        System.out.println("Последний символ (char) в строке " + myString.charAt(lastIndex));

        int firstSpaceIndex = myString.indexOf(" "); // indexOf - Поиск в строке, вернет индекс
        int lastSpaceIndex = myString.lastIndexOf(" "); // indexOf - Поиск в строке, вернет индекс ищет последний с конца
        System.out.println("Первый пробел имеет индекс: " + firstSpaceIndex);

        System.out.println("=====!!!====");

        System.out.println("слово Java начинается с : " + myString.indexOf("Java"));
        // Если нет совпадения, то покажет -1

        // substring - получить часть строки
        String s1 = myString.substring(4); //берет с 4 индекса и кладет в переменную остаток

        System.out.println(s1);

        String s2 = myString.substring(1,4); // берет с позиции по индексу 1 позицию старт и через запятую уже позицию финиш
        System.out.println(s2);
        String myString15 = "Hello";
        String myString16 = myString15;
        System.out.println(myString15);
        myString15 ="Hel";
        System.out.println(myString15);
        System.out.println(myString16);
        /*
        особенность строки в Java как пример: мы создали строку myString15 и положили значение "Hello",
        потом создали новую переменную строку myString16 и дали в нее значение переменной myString15 ->
        то есть значение стало тоже "Hello", но после того как мы изменили значение в строке myString15
        на новое "hel", в переменной myString16 осталось старое значение "hello"
        Это и есть особенность ссылочного типа в Java

         */



    }

}
