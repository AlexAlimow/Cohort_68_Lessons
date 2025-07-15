package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MySet<E> {
    private Map<E, Object> map = new HashMap<>();
    private String obj = "";

    public void add(E value) {
        map.put(value, obj);
    }

    public boolean contains(E value) {
        return map.containsKey(value);
    }

}
