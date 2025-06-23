package app;

import java.util.Arrays;

public class PersonArray {
    private Person[] arr;

    public PersonArray(Person[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + "\n";
        }
        return res;
    }

    public Person getOldest() {
        Person oldest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (oldest.getAge() < arr[i].getAge()) {
                oldest = arr[i];
            }
        }
        return oldest;
    }
}




