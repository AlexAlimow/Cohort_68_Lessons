package app;

public class MainNestedClass {
    public static void main(String[] args) {

        Person p = new Person("Vasya",10);
        Person.LoginPassword lp = p.new LoginPassword(); // вар 1 создания

        Person.LoginPassword lp1 = new Person("Kolya",15).new LoginPassword();  // вариант 2

        System.out.println(lp.getLogin());
        System.out.println(lp.getPassword());

    }

}
