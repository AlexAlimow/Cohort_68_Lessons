package app.model;

import app.myInterfaces.Flyable;
import app.myInterfaces.Swimmable;

public class Person implements Swimmable, Flyable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void swim(){
        System.out.println(name + ": кролем! брасом! поплыл");
    }



    @Override
    public String getType() {
        return "Человек";
    }

    @Override
    public void fly() {
        System.out.println("Нет крыльев изобрели самолет");
        System.out.println("Полетели на самолете");
    }
}
