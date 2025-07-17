package app;

import app.model.Address;
import app.model.Person;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Jack", "Smith", "j.smith@gmail.com", "1234567",
                        new Address("54294", "Trier", "Trierer", "5")),
                new Person("Jack", "Black", "j.black@gmail.com", "123444567",
                        new Address("54294", "Trier", "Trierer", "5")),
                new Person("Ann", "Williams", "a.williams@icloud.com", "5544223",
                        new Address("20095", "Hamburg", "Bahnhoffstr", "3")),
                new Person("Tim", "Allen", "t.allen@yahoo.com", "8123355",
                        new Address("10115", "Berlin", "Hauptstr", "7"))
        );

        List<String> list1 = personList.stream()
                .map(person -> person.getEmail())
                .toList();
        System.out.println(list1);

        List<Address> list2 = personList.stream()
                .map(person -> person.getAddress())
                .toList();
        System.out.println(list2);



    }
}
