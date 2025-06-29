package Model;

 class Flower extends Plants {
     private final double maxHeight = 100;


     public Flower() {
         height = 0;
     }

     public void spring() {
         height = Math.min(height + 7, maxHeight);
     }

     public void summer() {
         height = Math.min(height + 10, maxHeight);
     }

     public void autumn() {

     }

     public void winter() {
         height = 0;
     }
}
