package app;

import app.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jack",10));
        list.add(new Person("Ann",12));
        list.add(new Person("Joan",15));
        list.add(new Person("Nick",14));
        list.add(new Person("Mike",16));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare( o1.getAge(), o2.getAge());
            }
        });

        System.out.println(list);



    }


}
