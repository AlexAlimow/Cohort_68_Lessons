package app;

public class Person {
    private String fName;
    private String lName;
    private int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return fName + " " + lName + " " + getAge();
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

        @Override
        public String toString () {
            return getName() + " (" + age + ")";

        }
    }

