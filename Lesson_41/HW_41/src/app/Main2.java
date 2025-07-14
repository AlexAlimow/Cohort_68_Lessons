package app;

import app.model.Employee;
import app.model.Person;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        List<Employee> team1 = Arrays.asList(
                new Employee("Tim", 1),
                new Employee("Lena", 2));
        List<Employee> team2 = Arrays.asList(
                new Employee("Jack", 3),
                new Employee("Tim", 1));

        List<Employee> team3 = List.of(
                new Employee("Joan", 5));

        List[] allTeams = new List[]{
                team1, team2, team3
        };

        Set unique = getAllUniqueEmployees(allTeams);


        printUniqueEmployees(unique);

        List<Person> list1 = Arrays.asList(
                new Person("Igor", 30),
                new Person("Lena", 25),
                new Person("Max", 40)
        );

        List<Person> list2 = Arrays.asList(
                new Person("Lena", 25),
                new Person("Kate", 22)
        );

        Set<Person> commonPersons = getCommonPersons(list1, list2);
        System.out.println("\n== Общие персоны в двух списках ==");
        for (Person p : commonPersons) {
            System.out.println(p);
        }


    }

    public static Set<Employee> getAllUniqueEmployees(List<Employee>[] teamLists) {
        Set<Employee> result = new HashSet<>();
        for (List<Employee> team : teamLists) {
            result.addAll(team);
        }
        return result;
    }

    public static void printUniqueEmployees(Set<Employee> unique) {
        System.out.println("Уникальные сотрудники: ");
        for (Employee employee : unique) {
            System.out.println(employee);
        }
    }
    public static Set<Person> getCommonPersons(List<Person> list1, List<Person> list2) {
        Set<Person> set1 = new HashSet<>(list1);
        set1.retainAll(list2);
        return set1;
    }


}
/*[по желанию] Руководство компании решило премировать сотрудников.
                Каждый team lead подал список сотрудников для получения премии.
        Но получилось так, что некоторые сотрудники работают на
        нескольких проектах и попали в списки несколько раз.
        Итак, у вас есть массив из списков Employee.
        Ваша задача помочь получить один общий список сотрудников, но без повторов.
[по желанию] Дано два списка с Person необходимо получить Set
        с персонами которые присутствуют и в том и в другом списке*/