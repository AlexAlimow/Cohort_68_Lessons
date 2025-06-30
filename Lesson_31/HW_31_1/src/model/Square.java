package model;

 class Square extends Figure {
     private double side;

     public Square(double side){
        this.side = side;
     }
     public double calcArea(){
         return side * side;

     }
     public String toString(){
         return "Square (side= " + side + ")";

     }
}
