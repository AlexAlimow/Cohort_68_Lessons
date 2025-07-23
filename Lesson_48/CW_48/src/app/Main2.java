package app;

import app.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Person> peopleList = List.of(
                new Person("Jack", "Jackson", 30),
                new Person("John", "Jackson", 28),
                new Person("Ann", "Brown", 28),
                new Person("Tim", "Burton", 26),
                new Person("Woody", "Alen", 29),
                new Person("Stive", "Martin", 23)
        );
        peopleList.forEach(System.out::println);


        Map<String, List<Person>> result = peopleList.stream()
                .collect(Collectors.groupingBy(Person::getLastName));
        System.out.println("---------------------------------");

        result.forEach((lastName, persons) -> {
            System.out.println(lastName + ":");
            persons.forEach(p -> System.out.println(" " + p));

        });


    }

    }

/*
Естественно, решить используя Stream.
[поиск однофамильцев] Дан лист Person(firstName,lastName, age)
 ваша задача получить Map<String, List<Person>> где ключ lastName,
 значение список Person с соответствующим lastName

 */