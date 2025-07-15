package app;

import model.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();
        map.put("Jack", 1);
        map.put("John", 2);
        map.put("Paul", 3);


        Set<String> keySet = map.keySet(); // получаем Сет из ключей
        Collection<Integer> values = map.values(); // получить коллекцию из значений
        System.out.println("значения: " + values);
        System.out.println("Ключи: " + keySet);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Ключ и значение: " + entries);

//        for (var entry : entries)
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());


        }
        // Увеличиваем все значения map на 1
        for (var entry : map.entrySet()) {
            entry.setValue(entry.getValue() + 1);

        }
        System.out.println(map);

        Map<Integer, List<String >> map1 = new HashMap<>();
        map1.put(4, List.of("Jack", "John","Mike"));
        map1.put(3, List.of("Ann", "Kim","Lee"));
        map1.put(5, List.of("Tomas", "George"));

        System.out.println(map1 + System.lineSeparator());


        System.out.println("----------MySet Contains----------");
        MySet<String> set = new MySet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        System.out.println(set.contains("2"));

        // TreeMap TreeSet


    }
}
