package app;

import app.comparator.ComparatorByAge;
import app.comparator.ComparatorByName;
import app.comparator.ComparatorByWeight;
import app.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of( ///  неизменяемый лист !!!!
                new Person("Jack",12,48.2,164),
                new Person("Nick",13,40.1,142),
                new Person("Lena",14,42.2,153),
                new Person("Ann",15,45.2,164),
                new Person("Mike",13,43.2,132),
                new Person("Bro",11,46.1,162)
        );
        List<Person> personList = new ArrayList<>(people); // А это уже стандартный изменяемый лист
        System.out.println("-------------------------By Age-------------------------");
        Collections.sort(personList, new ComparatorByAge());  // отсортировали по возрасту от мельшего к большему
        System.out.println(personList);

        System.out.println("-------------------------By Weight-------------------------");
        Collections.sort(personList, new ComparatorByWeight()); // отсортировали по возрасту от мельшего к большему
        System.out.println(personList);

        System.out.println("-------------------------By Name-------------------------");
        Collections.sort(personList, new ComparatorByName());
        System.out.println(personList);


        System.out.println("-------------------------By Name reversed-------------------------");
        ComparatorByName comparatorByName = new ComparatorByName();
        Collections.sort(personList, comparatorByName.reversed());
        System.out.println(personList);


    }
}
