package app;

import app.model.Course;
import app.model.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Jack", List.of(new Course("Java", "Mike"), new Course("C++", "Nick"))),
                new Student("Ann", List.of(new Course("Java", "Mike"), new Course("QA", "Lena"))),
                new Student("Tom", List.of(new Course("C++", "Nick")))
        );

        List<List<Course>> list = students.stream()
                .map(s -> s.getCourses())
                .toList();
        System.out.println(list);

        List<Course> list1 = students.stream()
                .flatMap(student -> student.getCourses().stream())
                .distinct()
                .toList();
        System.out.println(list1); // это уже лист с курсами


        Set<Student> collect = students.stream()
                .collect(Collectors.toSet());// /получить сет из стрима

        Map<String, Student> collect1 = students.stream()
                .collect(Collectors.toMap(s -> s.getName(), s -> s));

        System.out.println(collect1);


    }
}
