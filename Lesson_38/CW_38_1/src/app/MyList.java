package app;

import app.model.Product;

public interface MyList {
    int size();

    void add(Product person);

    Product get(int index);

    default int indexOf(Product product) {
        return -1;
    }

    default void add(Product product, int index) {
        System.out.println("Метод не реализован");
    }

}