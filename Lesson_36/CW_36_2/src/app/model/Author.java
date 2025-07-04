package app.model;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;
    private int yearOfPublish;

    public Author(String firstName, String lastName, int yearOfPublish) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfPublish = yearOfPublish;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Author author = (Author) object;
        return yearOfPublish == author.yearOfPublish && Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + yearOfPublish;
        return result;
    }
}
