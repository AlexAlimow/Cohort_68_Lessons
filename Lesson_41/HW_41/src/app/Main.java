package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Jim");
        list.add("Nick");
        list.add("Lena");
        list.add("Jim");
        list.add("John");
        list.add("Rick");
        list.add("Rick");
        list.add("Viktor");
        list.add("Mike");
        list.add("Lena");


        System.out.println("В нашем листе " + list + " есть дубликаты ? \n"
                + hasDuplicate(list) + System.lineSeparator());

        System.out.println("Новый список без дубликатов: " + removeDuplicate(list));


    }

    public static boolean hasDuplicate(List<String> list) {
        Set<String> set = new HashSet<>();
        for (String s : list) {
            if (!set.add(s)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> removeDuplicate(List<String> list) {
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}

/*
Дан лист String. Необходимо определить, есть ли в данном листе повторяющиеся строки.

Дана строка с именами вида Jack,John,Nick,John.
Необходимо написать метод, который удалит из этой строки повторяющиеся имена.
 Т.е. например, в случае строки  “Jack,John,Nick,John” вернет строку  с именами  Jack,John,Nick



 */