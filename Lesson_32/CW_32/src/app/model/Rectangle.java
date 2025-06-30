package app.model;

    public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Rectangle (sideA=" + sideA +
                ", sideB=" + sideB +
                ')';
    }

    public double calcArea(){
        return sideA + sideB;
    }
}
