package app;

import app.model.Person;
import app.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", "Alimow", 37);
        Person p2 = new Person("Natalie", "Alimow", 37);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("1. " + Person.getPopulationOfWorld());
//        System.out.println("2. " + p1.getPopulationOfWorld());    не правильный способ обращения

        p1.myNameIs();
        Person.sayGreeting(p1);
        Person.sayGreeting(p2);

        System.out.println("----------HW_32-------------");

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("Alex","G1"));
        myStudents.add(new Student("John","G1"));
        myStudents.add(new Student("Bob","G2"));
        myStudents.add(new Student("Nick","G1"));
        myStudents.add(new Student("Rob","G1"));
        myStudents.add(new Student("Elena","G2"));
        myStudents.add(new Student("Tania","G2"));



        printAllStudents(myStudents);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер группы: ");
        String group = scanner.nextLine();

        printGroupOfStudents(myStudents, group);
        System.out.println("Общее количество студентов: " + Student.howManyStudentsNow());

        System.out.println("Введите имя студента:");
        String name = scanner.nextLine();
        printStudentsByName(myStudents, name);




    }

    private static void printStudentsByName(List<Student> myStudents, String name) {
        System.out.println("Имя студента с этим именем:" + name);
        for (Student s : myStudents) {
//            if (s.getName().toLowerCase().contains(name.toLowerCase())){
//                System.out.println(s);
//            }
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s);
            }
        }
    }


    private static void printGroupOfStudents(List<Student> myStudents, String group) {
        System.out.println("Группа: " + group);
        for (Student s : myStudents){
            if(s.getGroup().toLowerCase().equalsIgnoreCase(group)){
                System.out.println(s);
            }
        }
    }

    private static void printAllStudents(List<Student> myStudents) {
        for(Student s : myStudents){
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
