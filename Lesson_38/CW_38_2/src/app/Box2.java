package app;

public class Box2 <T> {
private  T value;

    public Box2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Box2{" +
                "value=" + value +
                '}';
    }
}
