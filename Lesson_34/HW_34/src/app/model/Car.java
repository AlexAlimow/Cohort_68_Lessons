package app.model;

import app.interfaces.Vehicle;

public class Car implements Vehicle {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println(getType() + ": " + brand + " " +  model + ": Заводим мотор");
        System.out.println(getType()  + ": " + brand + " " + model + " Поехали!");

    }

    @Override
    public void stop() {
        System.out.println(getType() + ": " + brand + " " + model + " Команда на остановку:");
        System.out.println(getType() + ": " + brand + " " + model + " Остановились и заглушили мотор");

    }

    @Override
    public String getType() {
        return "Авто";
    }
}
