package app.model;

public class Student {
    private int id;
    private String name;
    private String group;
    private static int counter = 0;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
        counter++;
        this.id = counter;
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
        return "Student(ID: " + id  + ", Имя " + name + ", группа: " + group;
    }

    public static int howManyStudentsNow(){
        return counter;
    }
}
