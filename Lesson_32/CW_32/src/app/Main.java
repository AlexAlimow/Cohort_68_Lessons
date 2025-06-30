package app;


import app.model.Circle;
import app.model.Rectangle;
import app.model.Shape;
import app.model.Square;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Square(6));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(5, 8));

        totalArea(shapes);
        System.out.println("Площадь всех фигур: " + totalArea(shapes));
        System.out.println("-----------------------------------------");
        System.out.println("Самая большая фигура: " + largestShape(shapes));

        System.out.println("-----------------------------------------");

        double minArea = 10;
        System.out.println("Заданное вами значение: " + minArea);
        System.out.println("Лист из фигур больше заданного значения: \n" + findShapesMoreThanMinArea(shapes, minArea) );
        System.out.println("-----------------------------------------");

        System.out.println("Лист из фигур больше заданного значения: \n");
        print(findShapesMoreThanMinArea(shapes,minArea));

    }

    public static void print(List<Shape> list) {
        for (Shape shape : list) {
            System.out.println(shape);
        }
    }

    public static double totalArea(List<Shape> list) {
        double sum = 0;
        for (Shape shape : list) {
            sum += shape.calcArea();
        }
        return sum;
    }

    public static Shape largestShape(List<Shape> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        Shape max = list.getFirst();
        for (Shape shape : list) {
            if (shape.calcArea() > max.calcArea()) {
                max = shape;
            }
        }
        return max;
    }

    public static List<Shape> findShapesMoreThanMinArea(List<Shape> shapes, double minArea){
        List<Shape> res = new ArrayList<>();
        for (Shape shape : shapes){
            if(shape.calcArea() > minArea){
                res.add(shape);
            }
        }
        return res;
    }

}


/*

Задача 1
Круг определяется радиусом, квадрат и прямоугольник своими сторонами.
В каждом классе должен быть метод расчета площади фигуры calcArea().
В main создать List из нескольких разных фигур и посчитать суммарную площадь всех фигур в List
Написать метод, который находит фигуру с самой большой площадью
Написать метод, который формирует List из фигур, с площадью больше, чем заданное значение

 */
