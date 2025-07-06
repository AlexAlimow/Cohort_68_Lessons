package app.comparator;

import app.model.Product;

import java.util.Comparator;

public class ComparatorByRating implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
