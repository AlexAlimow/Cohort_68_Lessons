package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Jack", "Nick", "Mike", "Mary", "Mark", "Ann"));
        list.add("Stan");
        System.out.println(list);

        System.out.println("----------Iterator----------");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) { // пока есть элементы в моем списке
           String element = iterator.next(); //  говорим дай следующий
            System.out.println(element);
            if (element.equals("Stan")){
                iterator.remove();
            }

        }

        System.out.println("----------Remove with Iterator----------");


// ---------------
        System.out.println("--------------Iterate by for..i--------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------------Iterate by for..each--------------");
        for (String st : list) {
            System.out.println(st);
        }

//*ConcurrentModificationException - Error !
//        System.out.println("--------------delete by for..each--------------");
//        for (String st : list) {
//            if (st.equals("Mark")){
//                list.remove("Mark");
//            }
//            System.out.println(st);
//        }


    }
}
