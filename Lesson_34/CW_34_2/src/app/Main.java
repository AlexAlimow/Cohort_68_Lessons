package app;

import app.interfaces.ListCreator;
import app.model.ConstListCreator;
import app.model.RandomListCreator;
import app.model.ScannerListCreator;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 1. случайный лист; 2. Scanner 3. Cons");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        ListCreator listCreator = null;
        switch (i){
            case 1: listCreator = new RandomListCreator(10);break;
            case 2: listCreator = new ScannerListCreator();break;
            case 3: listCreator = new ConstListCreator();break;
            default:listCreator = new RandomListCreator(0);
        }

        List<Integer> list = listCreator.create();
        System.out.println(list);
    }
}
