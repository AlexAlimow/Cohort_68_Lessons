package app;


import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("mike");
        list.add("lena");
        list.add("nik");
        System.out.println(list);
        System.out.println("=======");

        for (String element : list) {
            System.out.println(element);
        }
        System.out.println("=============== for...each");
        // перебор через цикл for...each
        for (String element : list){
            System.out.println(element);
        }

        System.out.println("-----------for...each---------------");
        int[] ints = {1,0,6,10};
        int sum = 0;
        for (int num : ints){
             sum += num;
        }
        System.out.println(sum);


    }
}
