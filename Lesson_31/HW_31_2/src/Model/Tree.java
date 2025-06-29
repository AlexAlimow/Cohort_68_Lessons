package Model;

class Tree extends Plants {
    private final double maxHeight = 5.0;

    public Tree(){
        height = 1.5;
    }

    public void spring() {
        height = Math.min(height + 1.5, maxHeight);
    }

    public void summer() {
        height = Math.min(height + 1.5, maxHeight);
    }

    public void autumn() {
        height = Math.min(height + 0.5, maxHeight);
    }

    public void winter() {
        height = Math.min(height + 0.5, maxHeight);
    }
}