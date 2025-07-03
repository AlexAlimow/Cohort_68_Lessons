package app.model;
import java.util.*;

public class Author {
    private String firstName;
    private String lastName;
    private int year;

    public Author(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Author)) return false;
        Author author = (Author) obj;
        return year == author.year &&
                Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, year);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + year + ")";
    }
}

