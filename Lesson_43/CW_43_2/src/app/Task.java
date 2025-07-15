package app;

import model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
    public static void main(String[] args) {

        /*Написать метод который получает Map<Integer, List<Person>>
         где ключ это возраст а значение список людей этого возраста
         */

        List<Person> list = List.of(
                new Person("Jack", 22),
                new Person("Mike", 20),
                new Person("Nick", 22),
                new Person("Lena", 22),
                new Person("Stan", 21),
                new Person("John", 20));


        Map<Integer, List<Person>> result = mapPersonByAge(list);
        for (var entry : result.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static Map<Integer, List<Person>> mapPersonByAge(List<Person> list) {
        Map<Integer, List<Person>> result = new HashMap<>();

        for (Person person : list) {
            Integer key = person.getAge();
            List<Person> peopleByAge = result.get(key);
            if (peopleByAge == null) {
                peopleByAge = new ArrayList<>();
                result.put(key, peopleByAge);
            }
            peopleByAge.add(person);
        }
        return result;
    }
}








