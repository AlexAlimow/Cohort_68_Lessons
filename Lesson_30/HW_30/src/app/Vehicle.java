package app;

public class Vehicle {
    String number;
    String brand;
    int year;

    public Vehicle(int year, String brand, String number) {
        this.year = year;
        this.brand = brand;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return number + " " + brand + " " + year;
    }

    public void drive(){}

}
