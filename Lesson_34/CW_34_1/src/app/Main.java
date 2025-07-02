package app;

import app.model.Boat;
import app.model.Duck;
import app.model.Person;
import app.myInterfaces.Flyable;
import app.myInterfaces.Swimmable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vasya",33);
        Boat boat = new Boat("Pobeda",20);
        Duck duck = new Duck("Donald","black");


        temp(person);
        temp(duck);
        temp(boat);
        System.out.println("------------------------");
        List<Swimmable> swimmables = new ArrayList<>();
        swimmables.add(person);
        swimmables.add(boat);
        swimmables.add(duck);
        swimmables.add(new Boat("Titanic",5000));
        swimmables.add(new Duck("Scrooge","White"));
        swimmables.add(new Duck("Mc'Duck","White"));
        swimAll(swimmables);

        System.out.println("---------------------------------");

        letsFly(person);

        List<Flyable> flyables = new ArrayList<>();
        flyables.add(person);
        flyables.add(person);
        flyables.add(person);
        flyables.add(duck);
        flyables.add(duck);
        flyables.add(duck);


        flyAll(flyables);




    }    // класс обещает реализовать методы интерфейса
    public static void temp(Swimmable s){  // я передаю объект класса который реализует "интерфейс" Swimmable
        s.swim();
    }

    public static void swimAll(List<Swimmable> list){
        System.out.println("----------Все в плавание----------");
        for (Swimmable s : list){
            System.out.println("---------" + s.getType().toUpperCase() + "---------");
            s.swim();
        }
    }

    public static void letsFly(Flyable flyable){
        flyable.fly();
    }

    public static void flyAll(List<Flyable> list){
        System.out.println("----------Все в полет----------");
        for (Flyable f : list){
            System.out.println("---------" + f.getType().toUpperCase() + "---------");
            f.fly();
        }
    }

}
