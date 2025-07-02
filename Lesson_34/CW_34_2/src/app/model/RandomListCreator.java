package app.model;

import app.interfaces.ListCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListCreator implements ListCreator {
    private int size;



    public RandomListCreator(int size) {
        this.size = size;
    }

    @Override
    public List<Integer> create() {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <size; i++) {
            result.add(random.nextInt()); // получили случайное число и добавили его в лист

        }
        return result;
    }
}
