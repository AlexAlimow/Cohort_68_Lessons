package app.model;

import app.Employee;

public class FrontendProgrammer extends Programmer {
    public FrontendProgrammer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "FrontendProgrammer: " + super.toString();
    }
}
