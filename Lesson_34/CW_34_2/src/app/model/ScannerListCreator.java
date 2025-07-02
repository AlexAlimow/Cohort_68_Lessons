package app.model;

import app.interfaces.ListCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerListCreator implements ListCreator {


    @Override
    public List<Integer> create() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        while (true){
            System.out.println("Введите очередное число или 0 для завершения");
            int i = scanner.nextInt();
            if ((i == 0)){
                break;
            }
            result.add(i);
        }
        return result;
    }
}
