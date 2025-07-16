package app;

import app.model.LectureTracker;
import app.model.Student;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static app.model.LectureTracker.countAttendance;

public class Main2  {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack"));
        students.add(new Student("Joan"));
        students.add(new Student("John"));
        students.add(new Student("Tim"));
        students.add(new Student("Tim"));
        students.add(new Student("Viktor"));
        students.add(new Student("Viktor"));
        students.add(new Student("Viktor"));
        students.add(new Student("Bob"));
        students.add(new Student("Bob"));
        students.add(new Student("Ann"));
        students.add(new Student("Ann"));
        students.add(new Student("Ann"));
        students.add(new Student("Ann"));
        students.add(new Student("Ann"));


        Map<Student, Integer> res = countAttendance(students);
        printAttendance(res);


    }


    public static void printAttendance(Map<Student, Integer> attendanceMap){
        System.out.println("Статистика посещаемости:");
        for (Map.Entry<Student, Integer> entry : attendanceMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue() + " лекций посетил(a)");
        }
    }
}
/*
2.
Допустим, каждый раз, когда студент приходит на лекцию,
преподаватель заносит его в список.
Таким образом, у вас есть список студентов, т.е. List<Student>,
 в котором один и тот же студент может встречаться несколько раз.
 Напишите метод, который сформирует Map<Student,Integer> где ключ - это студент,
 а значение - сколько лекций он посетил

 */