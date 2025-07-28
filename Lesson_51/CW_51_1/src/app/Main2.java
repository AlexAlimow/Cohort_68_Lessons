package app;

import app.model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = readFile("persons.txt");
        list.forEach(System.out::println);

    }


    public static List<String> readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines().toList();
        } catch (IOException ex) {
            throw new RuntimeException("Не смогли прочитать файл..." + ex);
        }
    }
}
