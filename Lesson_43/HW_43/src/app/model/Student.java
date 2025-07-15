package app.model;

import java.util.Objects;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

}
