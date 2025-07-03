package app.model;

import app.interfaces.Vehicle;

public class Bike implements Vehicle {
    private String model;
    private String typeOfBike;

    public Bike(String model, String typeOfBike) {
        this.model = model;
        this.typeOfBike = typeOfBike;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfBike() {
        return typeOfBike;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", typeOfBike='" + typeOfBike + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println(getType() + " " + model + " Тип: " + typeOfBike + " Поехали кататься");
        System.out.println(getType() + " " + model + " Тип: " + typeOfBike + " Кручу педали и еду");
    }

    @Override
    public void stop() {
        System.out.println(getType() + " " + model + " Тип: " + typeOfBike + " Остановимся попьем водички");

    }

    @Override
    public String getType() {
        return "Велосипед";
    }
}
