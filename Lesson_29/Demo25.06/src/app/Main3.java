package app;

import java.util.ArrayList;
import java.util.List;


public class Main3 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Alex", 36));
        list.add(new Person("Jack", 20));
        list.add(new Person("Nick", 19));
        list.add(new Person("Emma", 18));

        print(list);

        introduceAll(list);
        System.out.println("--- Персоны старще чем 18");
        List<Person> personOldestAge = getPersonOldestAge(list, 18);
        print(personOldestAge);
        List<String> names = getPersonName(list);
        System.out.println(names);


    }

    public static void print(List<Person> list) {
        for (Person person : list) {
            System.out.println(person);
        }
    }

    public static void introduceAll(List<Person> list) {
        for (Person person : list) {
            person.introduce();
        }
    }

    // public static List<Person> - то что возвращает метод
    // (List<Person> list, int ageLimit) - то что должно прийти в метод
    public static List<Person> getPersonOldestAge(List<Person> list, int ageLimit) {
        List<Person> result = new ArrayList<>();
        for (Person person : list) {
            if (person.getAge() >= ageLimit) {
                result.add(person);
            }
        }
        return result;
    }

    public static List<String> getPersonName(List<Person> list){
        List<String> res = new ArrayList<>();
        for (Person person : list){
           res.add(person.getName());

        }

        return res;
    }
}
