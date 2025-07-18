package app.model;

public class Student {
    private int id;
    private String name;
    private String group;
    private static int counter = 0;

    public Student(String name, String group) {
        this.id = counter++;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Student(" +
                "id=" + (id +1) +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ')' + "Всего студентов: " + counter;
    }

    public static int howManyStudents(){
        return counter;

    }
}
