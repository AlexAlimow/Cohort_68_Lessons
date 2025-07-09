package app.model;

public class FrontEndProgrammer extends Programmer {
    public FrontEndProgrammer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Front-End Programmer:" + getName();
    }
}
