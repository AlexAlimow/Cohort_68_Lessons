package app;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public String toString() {
        return getName() + " (зарплата: " + getSalary() + " бонус " + bonus + ")";
    }

    public void work() {
        System.out.println("Я менеджер, " + getName() + ". Я всех заставляю работать");
    }
    public void paySalary(){
        System.out.println(getName() + ": Получил " + (getSalary() + bonus));
    }





}
