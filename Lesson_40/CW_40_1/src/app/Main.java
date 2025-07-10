/*
        Допустим дан список строк. Используя итератор реализуйте следующие методы:
        метод String join(List list), который в качестве результата возвращает строку,
        полученную соединением всех строк исходного списка через запятую.
        Пример ["jack","ann","kim"] -> jack,ann,kim
        Удаляет из исходного списка все строки короче 3 символов


*/


package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Jack");
        myList.add("John");
        myList.add("Nick");
        myList.add("Mike");
        myList.add("Ann");
        myList.add("Ash");
        myList.add("Jo");
        myList.add("Bo");
        myList.add("Lu");

        System.out.println("первоначальный лист вышлядит так: "+ myList);

        System.out.println(join(myList));

        removeStr(myList);

        System.out.println(myList);


    }

    public static String join(List<String> list) {
        String str = "";
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            str += element;
            if (iterator.hasNext()) {
                str += " , ";
            }
        }

        return str;
    }

    public static void removeStr(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() < 3) {
                iterator.remove();
            }
        }
    }
}
