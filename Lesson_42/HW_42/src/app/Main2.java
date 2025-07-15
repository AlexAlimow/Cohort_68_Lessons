package app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jack", "John", "Tom", "Ron","Ron","Tom","Ann","Ann");
        Map<String, Boolean> result = getUniqNamesMap(list);

        for (Map.Entry<String, Boolean> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    private static Map<String, Boolean> getUniqNamesMap(List<String> list) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String s : list) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        //Делаем итоговую Map<String,Boolean>
        Map<String, Boolean> result = new HashMap<>();
        for (String key : countMap.keySet()) {
            result.put(key, countMap.get(key) == 1);
        }
        return result;
    }
}
/*
 Дан лист строк, необходимо получить Map<String,Boolean>  где ключ,
 это строка, а значение true - если строка встретилась в листе только один раз,
 false - если встретилась больше одного раза
 */