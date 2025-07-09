package app.model;

public class BackendProgrammer extends Programmer {
    public BackendProgrammer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "BackendProgrammer: " + super.toString();
    }
}
