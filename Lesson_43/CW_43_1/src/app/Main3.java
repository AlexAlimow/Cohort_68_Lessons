package app;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        String str = "Дана длинная строка, в которой нет знаков препинания,\n" +
                "        все слова разделены пробелом. Необходимо получить Map<String, " +
                "Integer> где ключ,\n" +
                "         слово из строки, значение - сколько раз это слово встречается ";

        System.out.println(str);
        System.out.println();

    }

    public Map<String, Integer> count(String str) {
//        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : str.split(" ")) {
            Integer value = map.get(word);
//            if (value== null){
//                map.put(word,1);
//            } else {
//                map.put(word, value + 1);
//            }
            map.put(word, value == null ? 1 : value + 1);
        }
        return map;

    }


}
