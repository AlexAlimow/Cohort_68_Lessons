package app;

import app.interfaces.PersonFormatter;
import app.model.Address;
import app.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Jack", "Smith", "j.smith@gmail.com", "1234567",
                        new Address("54294", "Trier", "Trierer", "5")),
                new Person("Ann", "Williams", "a.williams@icloud.com", "5544223",
                        new Address("20095", "Hamburg", "Bahnhoffstr", "3")),
                new Person("Tim", "Allen", "t.allen@yahoo.com", "8123355",
                        new Address("10115", "Berlin", "Hauptstr", "7"))
        );

        printFullNames(personList);
        printEmails(personList);
        printPhones(personList);
        printAddresses(personList);
    }

    private static void printFullNames(List<Person> personList) {
        System.out.println("Список всех имен и фамилий:");
        mapPersons(personList, person ->
                person.getfName() + " " + person.getlName()
        ).forEach(System.out::println);
    }

    private static void printEmails(List<Person> personList) {
        System.out.println("\nСписок всех email адресов:");
        mapPersons(personList, Person::getEmail)
                .forEach(System.out::println);
    }

    private static void printPhones(List<Person> personList) {
        System.out.println("\nСписок всех телефонов:");
        mapPersons(personList, Person::getPhone)
                .forEach(System.out::println);
    }

    private static void printAddresses(List<Person> personList) {
        System.out.println("\nСписок всех адресов:");
        mapPersons(personList, person -> person.getAddress().toString())
                .forEach(System.out::println);
    }

    public static List<String> mapPersons(List<Person> personList, PersonFormatter formatter) {
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            result.add(formatter.format(person));
        }
        return result;
    }
}
/*
2
В программе задан список Person{String fName, String lName, String email, String
phone, Address}. Address{String postcode, String city, String street, String
house}
Реализовать следующие функции:
-получить список всех ФИО
-получить список всех e-mail
-получить список всех телефонов-получить список всех адресов в виде строки адреса

Естественно, все вышеперечисленные функции может и должен реализовать
один метод, в который в качестве параметра должен приходить список Person и
реализация необходимого способа обработки.


Подсказка на следующей странице
1.создать функциональный интерфейс с методом String personToString(Person p)
2.В main реализовать метод, который в качестве параметра принимает лист Person,
а возвращает лист строк.
Вторым параметром метод должен принимать интерфейс ваш функциональный интерфейс
*/
