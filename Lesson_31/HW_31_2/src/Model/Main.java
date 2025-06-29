package Model;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plants> garten = new ArrayList<>();
        garten.add(new Flower());
        garten.add(new Flower());
        garten.add(new Bush());
        garten.add(new Tree());
        garten.add(new Tree());


        System.out.println("Начальный рост растений:");
        printGarden(garten);

        System.out.println("--------------------------");



        growInSpring(garten);
        growInSummer(garten);
        growInAutumn(garten);
        growInWinter(garten);

        System.out.println("----------------------------");

        growYear(garten);
        printGarden(garten);


    }

    public static void growYear(List<Plants> plants){
        for(Plants pl : plants){
            pl.growYear();
        }
        System.out.println("\n После одного года роста:");

    }

    public static void growInSpring(List<Plants> plants){
        System.out.println("\nВесна:");
        for (Plants pl : plants){
            pl.spring();
            System.out.println(pl);
        }

    }

    public static void growInSummer(List<Plants> plants){
        System.out.println("\nЛето:");
        for (Plants pl : plants){
            pl.summer();
            System.out.println(pl);
        }
    }

    public static void growInAutumn(List<Plants> plants){
        System.out.println("\nОсень:");
        for (Plants pl : plants){
            pl.autumn();
            System.out.println(pl);
        }
    }

    public static void growInWinter(List<Plants> plants){
        System.out.println("\nЗима:");
        for (Plants pl : plants){
            pl.winter();
            System.out.println(pl);
        }
    }

    public static void printGarden(List<Plants> plants) {
        for (Plants pl : plants) {
            System.out.println(pl);
        }
    }
}

/*
Задача 2
Допустим, у Вас есть несколько растений (деревья, кусты, цветы).
Необходимо реализовать программу, которая моделирует рост растений.
Все растения растут по-разному, некоторые, растут круглый год,
некоторые только весной и летом. Необходимо учесть, что высаживают растения тоже по-разному,
цветы в виде луковиц (т.е. начальный рост 0), а деревья в виде саженцев (т.е. начальный рост 1,5 метра).
Кроме того, цветы зимой обрезают, чтобы они не замерзли, т.е. высота опять становится 0.

Подсказка: Ваши классы должны моделировать рост растений за каждый сезон,
т.е. должны быть методы spring(), summer(), autumn() и winter().
Затем, можно объединить вызов этих методов в один вызов, ну т.е. метод год.
Естественно, все растения должны быть помещены в массив\лист, и обрабатываться массово.
 */