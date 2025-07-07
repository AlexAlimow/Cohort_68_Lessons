package app;

import app.model.Person;

public interface MyList {
    int size();

    void add(Person person);

    Person get(int index);

    Integer indexOf(Person person);

    void add(Person person, int index);
}
