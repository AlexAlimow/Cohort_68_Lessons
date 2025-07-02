package app.model;

import app.interfaces.ListCreator;

import java.util.ArrayList;
import java.util.List;

public class ConstListCreator implements ListCreator {
    @Override
    public List<Integer> create() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);

        return result;
    }
}
