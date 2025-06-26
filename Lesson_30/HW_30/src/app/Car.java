package app;

public class Car extends Vehicle{

    public Car(int year, String brand, String number) {
        super(year, brand, number);
    }

    public void drive(){
        System.out.println(getBrand() + " " + getNumber() + " Поехали!");

    }



}
