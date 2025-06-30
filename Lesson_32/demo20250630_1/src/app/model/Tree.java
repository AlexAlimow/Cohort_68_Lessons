package app.model;

public class Tree {
    private int number;
    private double height;
    private double maxHeight = 500; // См

    public Tree(int number, double height) {
        this.number = number;
        this.height = height;

    }

    public int getNumber() {
        return number;
    }

    public double getHeight() {
        return height;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "number=" + number +
                ", height=" + height +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
