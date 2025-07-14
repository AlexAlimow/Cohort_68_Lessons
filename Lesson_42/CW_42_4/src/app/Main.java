package app;

import app.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Jack", 3000),
                new Employee("Lena", 4000));


        for (var element : employees){

        }
        // c - объект класса (анонимный класс) который имплементирует Comparator<Employee>
        Comparator<Employee> c = new Comparator<Employee>(){
            public void temp(){
                System.out.println("Привет");
            }

            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        };

        // Тип переменной анонимный класс Comparator<Employee>
        var c1 = new Comparator<Employee>(){
            public void temp(){
                System.out.println("Привет");
            }
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        };




    }
}
