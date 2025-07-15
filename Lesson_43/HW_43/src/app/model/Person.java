package app.model;

import java.util.Objects;

public class Person {
    private String fName;
    private String lName;

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Person person = (Person) object;
        return Objects.equals(fName, person.fName) && Objects.equals(lName, person.lName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(fName);
        result = 31 * result + Objects.hashCode(lName);
        return result;
    }

    @Override
    public String toString() {
        return fName + " " + lName;
    }
}
