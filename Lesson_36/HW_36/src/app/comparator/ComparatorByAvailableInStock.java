package app.comparator;

import app.model.Product;

import java.util.Comparator;

public class ComparatorByAvailableInStock implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getAvailableInStock(), o2.getAvailableInStock());
    }
}
