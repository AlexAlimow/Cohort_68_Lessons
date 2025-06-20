package app;

public class Person {
    String firstName;
    String lastName;
    MyDate birthday;


    public Person(String firstName, String lastName, MyDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    public String toString(){
        return firstName.charAt(0) +"." + lastName
                + " " + "(" + birthday.toString() + ")";
    }
}