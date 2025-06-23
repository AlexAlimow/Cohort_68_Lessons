package app;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jack","Jackson",20);
//        System.out.println(p1);

//        p1.age = -10;
//        p1.name = ""
//        System.out.println(p1);

        System.out.println(p1.getAge());// получить возраст
        p1.setAge(-22);

        System.out.println(p1.getAge());
        System.out.println(p1.getName());

        Acount acount = new Acount();
        System.out.println("-----------");
//        acount.balance = -100000;
        System.out.println(acount);
        System.out.println("-----------");

        Person[] people = {
                new Person("Alex","Jackson1",22),
                new Person("Jax","Jackson2",25),
                new Person("Scorpion","Jackson3",29),
                new Person("Barraka","Jackson4",30),
                new Person("Johny","Jackson5",40),

        };
        PersonArray personArray = new PersonArray(people);

        System.out.println(personArray);

        System.out.println("Самый старый " + personArray.getOldest());

    }
}
