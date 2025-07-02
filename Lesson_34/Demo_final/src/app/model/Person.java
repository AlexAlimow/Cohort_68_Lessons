package app.model;

import app.interfaces.MyConstants;

public class Person implements MyConstants {
    private String name;
    public static final String TYPE = "Человек разумный"; // константа пишется большими буквами

    public Person(String name) {
        this.name = name;
        System.out.println(Person.WELCOME_MSG);
    }
}
