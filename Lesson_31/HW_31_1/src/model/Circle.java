package model;

 class Circle extends Figure {
    private double radius;

     public Circle(double radius) {
         this.radius = radius;
     }
     public double calcArea(){
         return Math.PI * radius * radius;
     }
     public  String toString(){
         return "Circle (radius=" + radius + ")";

     }
 }
