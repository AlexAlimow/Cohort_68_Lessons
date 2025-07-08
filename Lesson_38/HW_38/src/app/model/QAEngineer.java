package app.model;

import app.Employee;

public class QAEngineer implements Employee {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public QAEngineer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "QA Engineer: " + name;
    }
}
