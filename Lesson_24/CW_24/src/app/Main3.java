package app;

public class Main3 {
    public static void main(String[] args) {
        MyDate newYear = new MyDate(31,12,2026); // создали новый объект класса
        MyDate birthday1 = new MyDate(10,4,1980); // создали еще новый объект класса
        MyDate birthday2 = new MyDate(2,6,1988);

        printDate(newYear);
        printDate(birthday1);
        printDate(birthday2);

        Person person1 = new Person("Jack","Jackson",birthday1);
        Person person2 = new Person("Lena", "Brown",birthday2);

        printPerson(person1);
        printPerson(person2);

    }
    public static void printDate(MyDate date){
        System.out.println(date.day + "/" + date.month + "/" + date.year);
    }

    public static void printPerson(Person person) {
        System.out.println(person.firstName + " " + person.lastName);
        System.out.println("День рождения: ");
        printDate(person.birthday);
    }

}
