package app.model;

import app.Employee;

public class Programmer implements Employee {
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Programmer: " + name;
    }
}
