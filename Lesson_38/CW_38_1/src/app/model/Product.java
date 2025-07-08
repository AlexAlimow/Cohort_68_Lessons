package app.model;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int rating;
    private int stock;

    public Product(String name, double price, int rating, int stock) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return  name + ", price=" + price + ", rating=" + rating + ", stock=" + stock;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Product product = (Product) object;
        return Double.compare(price, product.price) == 0 && rating == product.rating && stock == product.stock && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + rating;
        result = 31 * result + stock;
        return result;
    }
}
