package app;

public class QAEngineer extends Employee {


    public QAEngineer(String name, int salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("Я тестировщик, " + getName() + ". Я проверяю программы");
    }





}
