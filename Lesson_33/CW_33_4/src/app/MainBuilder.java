package app;

import java.util.ArrayList;
import java.util.List;

public class MainBuilder {
    public static void main(String[] args) {
        Person p1 = new Person.Builder("Jack", "Jackson")
                .height(178)
                .age(40)
                .build();

        System.out.println(p1);

        Person p2 = new Person.Builder("John", "Johnson")
                .weight(66)
                .age(25)
                .build();

        System.out.println(p2);

        Person p3 = new  Person.Builder("Ivan","Ivanov")
                .age(34)
                .weight(77)
                .height(180)
                .build();

        System.out.println(p3);

        List<Person> company = new  ArrayList<Person>();
        company.add(p1);
        company.add(p2);
        company.add(p3);





    }
}
