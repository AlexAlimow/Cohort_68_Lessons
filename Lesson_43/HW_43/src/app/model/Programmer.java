package app.model;

import java.util.List;
import java.util.Objects;

public class Programmer {
    private String name;
    private List<Task> tasks;

    public Programmer(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Programmer{" + "name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Programmer that = (Programmer) object;
        return Objects.equals(name, that.name) && Objects.equals(tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(tasks);
        return result;
    }
}
