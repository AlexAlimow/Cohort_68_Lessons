package app;

import app.model.Programmer;
import app.model.Task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task(1, "Bug fix");
        Task t2 = new Task(2, "Write tests");
        Task t3 = new Task(3, "Write test report");

        Programmer p1 = new Programmer("Alex", Arrays.asList(t1, t2));
        Programmer p2 = new Programmer("Jack", Arrays.asList(t3));

        List<Programmer> programmers = Arrays.asList(p1, p2);

        Map<Programmer, List<Task>> programmerTaskMap = mapProgrammersTasks(programmers);
        printProgrammerTasks(programmerTaskMap);


    }

    public static Map<Programmer, List<Task>> mapProgrammersTasks(List<Programmer> programmers) {
        Map<Programmer, List<Task>> result = new HashMap<>();
        for (Programmer programmer : programmers) {
            result.put(programmer, programmer.getTasks());
        }


        return result;
    }

    public static void printProgrammerTasks(Map<Programmer, List<Task>> map) {
        for (Map.Entry<Programmer, List<Task>> entry : map.entrySet()) {
            Programmer programmer = entry.getKey();
            List<Task> tasks = entry.getValue();

            System.out.println("Programmer: " + programmer.getName());
            if (tasks.isEmpty()) {
                System.out.println("  No tasks assigned.");
            } else {
                for (Task task : tasks) {
                    System.out.println("  - Task #" + task.getNumber() + ": " + task.getDescription());
                }
            }
            System.out.println();
        }
    }

}

/*
Дан список Programmer(String name,  List<Task>  tasks).
Каждый программист  имеет список Task (int Number, String description) .
 Напишите метод, который сформирует Map< Programmer, List<Task> > где ключ - программист,
 а значение список его задач.
 */