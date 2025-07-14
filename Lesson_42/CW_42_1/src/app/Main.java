package app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "Ringo", "James", "Ringo", "Bob", "Bob", "John", "Bob");
        System.out.println(list);
        System.out.println("В листе есть дубликаты: " + isDuplicateValue(list));
        List<String> list1 = List.of("Jack", "John", "Goerge");

        System.out.println("---------------------");
        System.out.println(list1);
        System.out.println("В листе есть дубликаты: " + isDuplicateValue(list1));
        isDuplicateValue(null);
    }

    public static boolean isDuplicateValue(List<String> list) {
        if (list == null) {
            return false;
        }
        Set set = new HashSet<>(list);
        return set.size() != list.size();

    }


}

/*
Дан лист String. Необходимо определить, есть ли в данном листе повторяющиеся строки.

Дана строка с именами вида Jack,John,Nick,John.
Необходимо написать метод, который удалит из этой строки повторяющиеся имена.
 Т.е. например, в случае строки  “Jack,John,Nick,John” вернет строку  с именами  Jack,John,Nick



 */