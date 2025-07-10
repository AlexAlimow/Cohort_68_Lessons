package app;

import app.model.Product;

import java.util.Arrays;
import java.util.Iterator;

public class  MyArrayList<E> implements MyList {
    private int size = 0;
    private Product[] array = new Product[5];

    public Iterator<E> iterator() {
        return new Iterator<E>() {
           private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                return (E)array[currentIndex++];
            }
        };

    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Product product) {
        if (size >= array.length) {
            enlarge();
        }
        array[size++] = product;
    }

    private void enlarge() {
        array = Arrays.copyOf(array, array.length * 2);
    }


    @Override
    public Product get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return array[index];
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += array[i] + System.lineSeparator();
        }
        return res;
    }

    @Override
    public int indexOf(Product product) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(product)){
                return i;
            }
        }
        return -1;
    }
}