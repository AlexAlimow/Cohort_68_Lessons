package app.comparator;

import app.model.Person;

import java.util.Comparator;

public class ComparatorByAge implements Comparator <Person> {


    @Override
    /*
    Нужно написать метод таким образом, что если
    - o1 > o2 тогда метод должен вернуть положительное число
    - o1 < o2 тогда метод должен вернуть отрицательное число
    - o1 == o2 тогда метод должен вернуть 0
     */
    public int compare(Person o1, Person o2) {// примерный вид написания
        if (o1.getAge()> o2.getAge()){
            return 1097;
        } else if(o1.getAge()< o2.getAge()){
            return -987;
        } else {
            return 0;
        }
    }
}
