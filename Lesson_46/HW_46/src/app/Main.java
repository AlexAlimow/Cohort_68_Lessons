package app;

import app.model.Programmer;
import app.model.Task;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Programmer> programmers = Arrays.asList(
                new Programmer("Alice", "Berlin", Arrays.asList(
                        new Task(1, "Fix login bug", "open", 3),
                        new Task(2, "Update security patch", "finish", 6),
                        new Task(3, "Optimize DB", "in progress", 4)
                )),
                new Programmer("Bob", "Munich", Arrays.asList(
                        new Task(4, "Write unit tests", "open", 7),
                        new Task(5, "Refactor service", "finish", 10),
                        new Task(6, "Clean code", "in progress", 8)
                )),
                new Programmer("Charlie", "Hamburg", Arrays.asList(
                        new Task(7, "Setup CI/CD", "open", 9),
                        new Task(8, "Dockerize app", "in progress", 6),
                        new Task(9, "Write docs", "finish", 2)
                )),
                new Programmer("Diana", "Berlin", Arrays.asList(
                        new Task(10, "Code review", "open", 1),
                        new Task(11, "Improve UI", "finish", 5)
                ))
        );


        printProgrammersWithTasksAndCount(programmers);


        Map<String, Integer> taskCountByProgrammer = programmers.stream()
                .collect(Collectors.toMap(
                        Programmer::getName,
                        p -> p.getTasks().size()
                ));

        taskCountByProgrammer.forEach((name, count) ->
                System.out.println(name + " -> " + count + " задач"));


        System.out.println("------------------------------------");

        List<Task> berlinTasks = programmers.stream()
                .filter(p -> "Berlin".equalsIgnoreCase(p.getCity()))
                .flatMap(p -> p.getTasks().stream())
                .filter(task -> !"finish".equalsIgnoreCase(task.getStatus()))
                .sorted(Comparator.comparingInt(Task::getDaysInProcessing))
                .toList();
        System.out.println("Задачи программистов из Берлина , по дням:");
        berlinTasks.forEach(System.out::println);

        System.out.println("------------------------------------");

        List<Set<Task>> taskSets = programmers.stream()
                .filter(p -> !"Berlin".equalsIgnoreCase(p.getCity()))
                .map(p -> p.getTasks().stream()
                        .filter(t -> t.getDaysInProcessing() > 5)
                        .filter(t -> !"finish".equalsIgnoreCase(t.getStatus()))
                        .collect(Collectors.toSet())
                )
                .filter(set -> !set.isEmpty()) // Убираем пустые множества
                .collect(Collectors.toList());

        System.out.println("Списки задач программистов не из Берлина, где задачи >5 дней и не 'finish':");
        List<Set<Task>> filteredTaskSets = getFilteredTaskSets(programmers);

        int i = 1;
        for (Set<Task> taskSet : filteredTaskSets) {
            System.out.println("Набор #" + i++);
            taskSet.forEach(System.out::println);
        }


    }

    public static void printProgrammersWithTasksAndCount(List<Programmer> programmers) {
        for (Programmer programmer : programmers) {
            System.out.println("Programmer: " + programmer.getName()
                    + ", City: " + programmer.getCity()
                    + ", Task count: " + programmer.getTasks().size());

            for (Task task : programmer.getTasks()) {
                System.out.println("  -> " + task);
            }
        }
    }

    public static List<Set<Task>> getFilteredTaskSets(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> !"Berlin".equalsIgnoreCase(p.getCity()))
                .map(p -> p.getTasks().stream()
                        .filter(t -> t.getDaysInProcessing() > 5)
                        .filter(t -> !"finish".equalsIgnoreCase(t.getStatus()))
                        .collect(Collectors.toSet())
                )
                .filter(set -> !set.isEmpty())
                .collect(Collectors.toList());
    }


}

/*
Дан список Programmer(String name, String city, List<Task>  tasks).
Каждый программист  имеет список задач    Task (int Number,
String description, String status, int daysInProcessing).
 В данной задаче имя программиста уникально и не повторяется,
  список задач не пустой и в нем нет null значений

	1.
 Сформировать Map<String, Integer> где ключ,
 это имя программиста, а значение количество задач в списке у данного программиста.

2.
Сформировать список всех задач,
которые относятся к программистам из Berlin, отсортированный по количеству дней в обработке
( daysInProcessing). В списке не должны присутствовать уже закрытые задачи (status = “finish”)

3
Сформировать список сет задач,
которые относятся к программистам не из Berlin,
daysInProcessing у них больше 5 и статус не “finish”

	4 (Сложная**, по желанию)
 Сформировать Map<Task, Programmer> где ключ,
 задача, значение - программист, ответственный за задачу


 */