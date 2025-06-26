package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Programmer p1 = new Programmer("Jack",5000);
//        System.out.println(p1);
//        p1.work();
//        p1.paySalary();
//
//        QAEngineer qa1 = new QAEngineer("Alex",6000);
//
//        Manager manager1 = new Manager("Natalie",4500,1500);
//        System.out.println(manager1);
//        manager1.work();
//        manager1.paySalary();

        List<Employee> employees = new ArrayList<>();
        employees.add(new Programmer("Jack",5000));
        employees.add(new Programmer("Lena",5000));
        employees.add(new QAEngineer("Nik",5000));
        employees.add(new Manager("Jack",5000,1000));

        for (Employee employee : employees) {

            employee.work();
            employee.paySalary();
        }



    }
}
