package App;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Person> personArray = new ArrayList<>();
        personArray.add(new Person("Lara2", 15));
        personArray.add(new Person("Lara2", 15));
        personArray.add(new Person("Lara2", 15));
        personArray.add(new Person("Lara2", 15));

        System.out.println(personArray);
        System.out.println(personArray.get(0));
        System.out.println(personArray.size());


    }
}
