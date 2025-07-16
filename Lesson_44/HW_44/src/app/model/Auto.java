package app.model;

public class Auto {
    private int id;
    private String brand;
    private int year;
    private int price;
    private static int counter = 1;

    public Auto(String brand, int year, int price) {
        this.id = counter++;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + " | " + brand + " | " + year + " | €" + price;
    }
}
