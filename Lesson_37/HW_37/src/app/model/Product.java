package app.model;

public class Product {
    private String name;
    private double price;
    private double rating;
    private int availableInStock;

    public Product(String name, double price, double rating, int availableInStock) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.availableInStock = availableInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getAvailableInStock() {
        return availableInStock;
    }

    @Override
    public String toString() {
        return name + " | Цена: " + price +
                " | Рейтинг: " + rating +
                " | На складе: " + availableInStock;
    }
}
