package app;

public class Programmer extends Employee{


    public Programmer(String name, int salary) {
       super(name, salary);
    }



    public void work() {
        System.out.println("Я программист, " + getName() + ". Я пишу программы");
    }


}
