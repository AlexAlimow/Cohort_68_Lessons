package app.model;

import app.myInterfaces.Flyable;
import app.myInterfaces.Swimmable;

public class Duck extends Bird implements Swimmable, Flyable {
    private String name;
    private String color;

    public Duck(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public void swim(){
        System.out.println(name + ": крякнула и поплыла");
    }

    @Override
    public String getType() {
        return "Утка";
    }

    @Override
    public void fly() {
        System.out.println("машем крыльями и летим");
    }
}
