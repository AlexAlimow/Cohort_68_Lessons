package app;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str = "Jack,John,Nick,John";
        System.out.println("Исходная строка " + str);
        System.out.println("Обработанная строка " + removeDuplicates(str));

    }

    public static String removeDuplicates(String str) {
        /*
        1. String -> set
        2. set -> String
         */

        // str -> String[]
        String[] words = str.split(",");
        // String[] -> set
        Set<String> set = new LinkedHashSet<>();
        for (String word : words) {
            set.add(word);
        }

        // Set to String
        return String.join(",", set);

        //HashSet<String> set = new HashSet<>(Arrays.asList(words));
    }
}

/*
Дана строка с именами вида Jack,John,Nick,John.
Необходимо написать метод, который удалит из этой строки повторяющиеся имена.
 Т.е. например, в случае строки  “Jack,John,Nick,John” вернет строку  с именами  Jack,John,Nick
*/


