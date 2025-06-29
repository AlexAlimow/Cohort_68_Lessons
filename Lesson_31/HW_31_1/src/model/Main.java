package model;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(3));
        figures.add(new Square(4));
        figures.add(new Rectangle(3, 5));
        figures.add(new Circle(7));
        figures.add(new Square(12));


        double totalArea = calcTotalArea(figures);
        System.out.println("Total area: " + totalArea);

        Figure largest = findLargestArea(figures);
        System.out.println("Figures with largest area: " + largest + ", area = " + largest.calcArea());

        double threshold = 20;
        List<Figure> filtered = filterFiguresByArea(figures, threshold);
        System.out.println("Figures with area biger than: " + threshold + ":");
        for (Figure f : filtered){
            System.out.println(f + ", area = " + f.calcArea());
        }

    }


    public static double calcTotalArea(List<Figure> figures) {
        double sum = 0;
        for (Figure f : figures) {
            sum += f.calcArea();
        }
        return sum;
    }

    public static Figure findLargestArea(List<Figure> figures) {
        if (figures.isEmpty()) return null;
        Figure maxFigure = figures.get(0);
        for (Figure f : figures) {
            if (f.calcArea() > maxFigure.calcArea()) {
                maxFigure = f;
            }
        }
        return maxFigure;
    }

    public static List<Figure> filterFiguresByArea(List<Figure> figures, double minArea) {
        List<Figure> result = new ArrayList<>();
        for (Figure f : figures) {
            if (f.calcArea() > minArea) {
                result.add(f);
            }
        }
        return result;
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