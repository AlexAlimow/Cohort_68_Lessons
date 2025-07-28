package app.service;

import app.model.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class PersonService {
    public List<Person> removeDuplicate(List<Person> list){
        return new ArrayList<>(new HashSet<>(list));
    }

    public List<Person> sort(List<Person> list){
        list.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        return list;
    }

    public void writeToFile(List<Person> people, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Person person : people) {
                writer.write(person.toString());
                writer.newLine();
            }
            System.out.println("✅ Результат записан в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}