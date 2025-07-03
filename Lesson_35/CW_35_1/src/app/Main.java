package app;

import app.model.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jack",33,"jack@mail.com");
        Person p2 = new Person("Jack",33,"jack@mail.com");
        Person p3 = new Person("Jack2",44,"jack@mail.com");


        System.out.println(p1 + (p1.equals(p2) ? " equals " : " not equals ") + p2);



    }
}
