package app;

public class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(int year, String brand, String number, int loadCapacity) {
        super(year, brand, number);
        this.loadCapacity = loadCapacity;
    }

    public void loadCapacity(){
        System.out.println("Грузоподъемность: " + loadCapacity);
    }
    public void drive(){
        System.out.println(getBrand() + " " + getNumber() + " Поехали! " + "Мы перевозим " + loadCapacity + " тонн груза");

    }

}
