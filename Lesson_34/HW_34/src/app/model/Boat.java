package app.model;

import app.interfaces.Vehicle;

public class Boat implements Vehicle {
    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", capasity=" + capacity +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Лодка не плавает а ходит!!!");
        System.out.println(name + ": полный вперед!");
        System.out.println(name + ": на борту " + capacity + " пассажиров");

    }

    @Override
    public void stop() {
        System.out.println(getType() + " " + name + ": Команда на остановку получена:");
        System.out.println("Стоп машина!");
        System.out.println("Бросить якорь!");

    }

    @Override
    public String getType() {
        return "Лодка";
    }
}
