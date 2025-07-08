package app;

public class Main {

    Box1 b1 = new Box1("Hello");
    Box1 b2 = new Box1(10);
    Box1 b3 = new Box1(new Person("Jack",10));

    Object value = b2.getValue();


}
