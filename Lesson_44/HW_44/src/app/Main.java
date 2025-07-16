package app;

import app.model.Auto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto("BMW", 2025, 50000));
        autos.add(new Auto("BMW", 2022, 33000));
        autos.add(new Auto("BMW", 2023, 22000));
        autos.add(new Auto("Opel", 2024, 35000));
        autos.add(new Auto("VW", 2023, 40000));
        autos.add(new Auto("Mercedes-Benz", 2023, 52000));
        autos.add(new Auto("Tesla", 2025, 55000));
        autos.add(new Auto("Tesla", 2024, 45000));

        sortedById(autos);
        sortedByPriceAsc(autos);
        sortedByPriceDesc(autos);
        sortedByYearAsc(autos);
        sortedByYearDesc(autos);
        sortedByBrand(autos);

    }

    private static void sortedByBrand(List<Auto> autos) {
        System.out.println("Сортировка по году бренду:");
        autos.sort(Comparator.comparing(s-> s.getBrand()));
        autos.forEach(System.out::println);
        System.out.println("-------------------------------");
    }

    private static void sortedByYearAsc(List<Auto> autos) {
        System.out.println("Сортировка по году выпуска по возрастанию:");
        autos.sort(Comparator.comparingInt(s-> s.getYear()));
        autos.forEach(System.out::println);
        System.out.println("-------------------------------");
    }

    private static void sortedByYearDesc(List<Auto> autos) {
        System.out.println("Сортировка по году выпуска по убыванию:");
        autos.sort(Comparator.comparingInt(Auto:: getYear).reversed());
        autos.forEach(System.out::println);
        System.out.println("-------------------------------");
    }


    private static void sortedByPriceAsc(List<Auto> autos) {
        System.out.println("Сортировка по цене по возрастанию:");
        autos.sort(Comparator.comparingInt(s -> s.getPrice()));
        autos.forEach(System.out::println);
        System.out.println("-------------------------------");
    }

    private static void sortedByPriceDesc(List<Auto> autos) {
        System.out.println("Сортировка по цене по убыванию:");
        autos.sort(Comparator.comparingInt(Auto:: getPrice).reversed());
        autos.forEach(System.out::println);
        System.out.println("-------------------------------");
    }



    public static void sortedById(List<Auto> autoList){
        System.out.println("Сортировка по ID:");
        autoList.sort(Comparator.comparingInt(s -> s.getId()));
        autoList.forEach(System.out::println);
        System.out.println("-------------------------------");
    }


}

/*
Допустим вы продаете автомобили. Т.е. есть класс Auto.
У каждой машины есть номер (id), бренд, год выпуска, цена.
У вас есть список автомобилей.
Ваша программа должна уметь получать список автомобилей отсортированный по:
номеру
цене
году выпуска
бренду
Естественно, вам придется реализовать соответствующие компараторы.
Естественно, реализовывать нужно лямбда-выражением.
 */

