package app;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "C:\\aittr\\Proj_02\\Lesson_50\\HW_50\\src\\app\\files\\user_input.txt";

    public static void main(String[] args) {
        writeToFile();
        readFromFile();

    }

    // метод для записи
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

    // Метод для чтения

    public static void readFromFile() {
        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }
    }
}

/*
a) Напишите программу, которая позволяет
 пользователю вводить с клавиатуры строки и записывает эти строки в файл.
 Для выхода из программы, пользователь должен ввести строку “exit”.
 В итоге должен быть файл со всеми введенными строками.
b) Ваша программа должна прочитать сформированный файл и вывести его содержимое на экран.

 */
