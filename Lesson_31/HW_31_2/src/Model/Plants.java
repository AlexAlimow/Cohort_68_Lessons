package Model;


abstract class Plants {
    protected double height;

    public double getHeight() {
        return height;
    }

    public abstract void spring();

    public abstract void summer();

    public abstract void autumn();

    public abstract void winter();

    public void growYear() {
        spring();
        summer();
        autumn();
        winter();
    }





    public String toString() {
        return this.getClass().getSimpleName() + "Высота = " + height + ")";
    }


}


