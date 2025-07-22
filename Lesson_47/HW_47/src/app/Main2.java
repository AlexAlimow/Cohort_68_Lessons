package app;

import app.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Jack", "Jackson", 22),
                new Person("Anna", "Smith", 21),
                new Person("Peter", "Jackson", 32),
                new Person("Lucy", "Lu", 25),
                new Person("Tim", "Shaffer", 26),
                new Person("Mark", "Johnson", 27)

        );

        Map<String, List<Person>> result = groupByLastName(personList);

        result.forEach((lastName, persons) -> {
            System.out.println(lastName + ":");
            persons.forEach(p -> System.out.println(" " + p));

        });

    }

    public static Map<String, List<Person>> groupByLastName(List<Person> personList) {
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getlName));
    }
}
/*
Естественно, решить используя Stream.
[поиск однофамильцев] Дан лист Person(firstName,lastName, age)
 ваша задача получить Map<String, List<Person>> где ключ lastName,
 значение список Person с соответствующим lastName

 */