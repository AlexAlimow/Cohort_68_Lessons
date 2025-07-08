package app.model;

import app.Employee;

public class BackEndProgrammer extends Programmer {
    public BackEndProgrammer(String name) {
        super(name);
    }
    @Override
    public String toString(){
        return "Back-End Programmer: " + getName();
    }
}
