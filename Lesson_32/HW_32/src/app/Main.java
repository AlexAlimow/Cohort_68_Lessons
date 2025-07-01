package app;

import app.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex Brown", "1"));
        students.add(new Student("Natalie Johnson", "2"));
        students.add(new Student("Maja Locker", "3"));
        students.add(new Student("Sawah Anderson", "2"));
        students.add(new Student("Dmitry Baker", "4"));
        students.add(new Student("Dmitry Smith", "2"));
        students.add(new Student("Jack Smith", "4"));
        students.add(new Student("Rick Archer", "4"));
        students.add(new Student("Nick James", "4"));
        students.add(new Student("Jim Walker", "4"));

        printAllStudents(students);
        System.out.println("--------");
        System.out.println(Student.howManyStudents());
        System.out.println("--------");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название группы которую ищите:");
        String group = scanner.nextLine();
        printGroupOfStudents(students, group);

        System.out.println("Введите имя студента которого ищите:");
        String name = scanner.nextLine();
        printStudentByName(students, name);


    }

    public static void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);

        }
    }

    public static void printGroupOfStudents(List<Student> list, String group) {
        System.out.println("Студенты в группе: " + group);
        for (Student s : list) {
            if (s.getGroup().equalsIgnoreCase(group)) {
                System.out.println(s);
            }
        }
    }

    public static void printStudentByName(List<Student> list, String name) {
        System.out.println("Студенты с именем: " + name);
        for (Student s : list) {
        if (s.getName().toLowerCase().contains(name.toLowerCase()))
                System.out.println(s);

            }
        }
    }



/*
Задача 1
Представьте, что вы пишете программу для on-line школы.
Создайте класс Student (int id, String name, String group)
Поле id должно заполнятся автоматически, порядковым номером студента.
В классе Student реализуйте статический метод, который отвечает на вопрос,
сколько студентов всего.

Создайте список студентов. Создайте несколько методов для работы со списком студентов:

Выведите его на экран.
Вывести студентов заданной группы
Вывести всех студентов, имя которых содержит заданную строку

 */