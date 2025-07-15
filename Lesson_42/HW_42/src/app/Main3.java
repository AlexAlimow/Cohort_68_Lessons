package app;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        /*3 (по желанию)

        Дана длинная строка, в которой нет знаков препинания,
        все слова разделены пробелом. Необходимо получить Map<String, Integer> где ключ,
         слово из строки, значение - сколько раз это слово встречается
         */

        String text = "В саду цвели розы, розы красные, розы белые, розы розовые. " +
                "Розы, розы, розы - они наполняли воздух своим ароматом. " +
                "Розы, розы, розы - радовали глаз своей красотой. " +
                "Розы, розы, розы - символ любви и красоты";

        Map<String, Integer> wordCountMap = countWords(text);

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    private static Map<String, Integer> countWords(String text) {
        // Разделяем строку на слова по пробелу
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        // Убираем пробелы и делаем слова в ниж. регистре
        for (String word : words) {      // trim удаляет начальные и конечные пробелы
            word = word.trim().toLowerCase();

            map.put(word, map.getOrDefault(word, 0) + 1);

        }
        return map;
    }
}
