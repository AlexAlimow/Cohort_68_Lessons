package app;

import app.comparator.ComparatorByAvailableInStock;
import app.comparator.ComparatorByPrice;
import app.comparator.ComparatorByRating;
import app.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Ноутбук", 1599.99, 4.6, 10));
        products.add(new Product("Смартфон", 899.99, 4.5, 47));
        products.add(new Product("Планшет", 699.99, 4.8, 25));
        products.add(new Product("Наушники", 99.99, 4.3, 15));

        Scanner scanner = new Scanner(System.in);


        System.out.println("Выберите способ сортировки товаров:");
        System.out.println("1. По цене (по возрастанию)");
        System.out.println("2. По цене (по убыванию)");
        System.out.println("3. По рейтингу");
        System.out.println("4. По наличию");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(products, new ComparatorByPrice());
                break;
            case 2:
                Collections.sort(products, new ComparatorByPrice().reversed());
                break;
            case 3:
                Collections.sort(products, new ComparatorByRating());
                break;
            case 4:
                Collections.sort(products, new ComparatorByAvailableInStock());
                break;
            default:
                System.out.println("Неверный ввод, ошибка!");
                return;
        }
        System.out.println("\nОтсортированный список товаров:");
        for (Product p : products) {
            System.out.println(p);
        }

    }
}

/*
Задача 1
Предположим, вы пишите программу для on-line магазина
У каждого товара есть наименование, цена, рейтинг, количество штук на складе и т.д.
Ваша программа должна предлагать пользователю выбрать,
как бы он хотел сортировать товары и, в зависимости от выбора пользователя,
выводить список товаров в нужном порядке (например, по цене по возрастанию,
по цене по убыванию, по рейтингу, по количеству на складе).
Для этого, очевидно, можно использовать метод Collection.sort
 и реализовать несколько Comparator<Person>
 */