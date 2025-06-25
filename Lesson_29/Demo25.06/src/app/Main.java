package app;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = null;

        temp(list2);


    }
    public static void temp(ArrayList<String> list) {
        if (list != null) {
            System.out.println(list.size());
        }
    }
}
