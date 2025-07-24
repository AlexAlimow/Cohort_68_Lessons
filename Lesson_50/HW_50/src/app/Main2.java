package app;

import app.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    private static final String FILE_NAME = "C:\\aittr\\Proj_02\\Lesson_50\\HW_50\\src\\app\\files\\persons.txt";

    public static void main(String[] args) {

        writeToFile(); // или можно просто добавить

        List<Person> people = readPersonsFromFile(FILE_NAME);
        System.out.println("Список людей из файла:");
        for (Person person : people) {
            System.out.println(person);
        }

    }

    public static void writeToFile() {
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            System.out.println("Введите строки. Для выхода введите 'exit':");

            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(line);
                writer.newLine();

            }
            System.out.println("Строки успешно записаны в файл.");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл " + e.getMessage());
        }
    }

    public static List<Person> readPersonsFromFile(String filename) {
        List<Person> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 3) continue; // пропускаем некорректные строки

                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());
                String email = parts[2].trim();

                list.add(new Person(name, age, email));
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        return list;

    }
}

/*
Пусть дан текстовый файл, с информацией о Person
~~~
jack,32,jack@mail.com
john,21,john@mail.com
ann,5,ann@mail.com
lena,17,lena@mail.com
~~~
т.е. имя, возраст, email . Ваша задача получить список Person

 */

