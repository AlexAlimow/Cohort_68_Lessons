package model;

 class Rectangle extends Figure {
     private double width;
     private double height;

     public Rectangle(double width, double height) {
         this.width = width;
         this.height = height;
     }
     public double calcArea(){
         return width * height;
     }
     public String toString(){
         return "Rectangle (width= " + width + " ,height=" + height + ")";

     }

 }

