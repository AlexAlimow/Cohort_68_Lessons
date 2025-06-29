package Model;

class Bush extends Plants {
    private final double maxHeight = 150;

    public Bush() {
        height = 40;
    }

    public void spring() {
        height = Math.min(height + 10, maxHeight);
    }

    public void summer() {
        height = Math.min(height + 10, maxHeight);
    }

    public void autumn() {
        height = Math.min(height + 3, maxHeight);
    }

    public void winter() {
    }




}





