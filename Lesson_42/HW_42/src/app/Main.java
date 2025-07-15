package app;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> example = Map.of(
                "Jack",10,
                "John", 5
        );
        Map<String, Integer> multableMap = new HashMap<>(example);

        mergeKeys(multableMap, "Jack","John");
    }

    public static void mergeKeys(Map<String, Integer> map , String key1, String key2){
        if(map.containsKey(key1) && map.containsKey(key2)){
            int sum = map.get(key1) + map.get(key2);
            String newKey = key1 + "_" + key2;
            map.put(newKey, sum);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }


    }
}
/*
1
Напишите метод, который принимает map<String,Integer>, и две строки key1 и key2
Если в map есть заданные ключи key1 и key2,
то метод должен сформировать в map новый ключ из строке (key1+”-”+key2) и
положить туда сумму значений. Если какого-то из ключей нет, map остается без изменения.
Вывести на экран получившуюся Map столбиком:
ключ:значение

Примечание: Метод void, т.е. он не возвращает новый map а изменяет переданный в параметрах.

Пример:
Map:{
   “jack”,10
   “john”,5
}
Вызываем метод с ключами “jack” и “john”, получаем:
Map:{
   “jack”,10
   “john”,5
   “jack_john”:15
}

 */