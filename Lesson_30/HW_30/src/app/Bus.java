package app;

public class Bus extends Vehicle{
    private int numberOfSeats;

    public Bus(int year, String brand, String number, int numberOfSeats) {
        super(year, brand, number);
        this.numberOfSeats = numberOfSeats;
    }
    public void numberOfSeats(){
        System.out.println("Количество мест: " + numberOfSeats);
    }
    public void drive(){
        System.out.println(getBrand() + " " + getNumber() + " Поехали! " + "Мы перевозим " + numberOfSeats + " пассажира(ов)");

    }
}
