package app;

import app.comparator.ComparatorByName;
import app.comparator.ComparatorByPrice;
import app.comparator.ComparatorByRating;
import app.comparator.ComparatorByStock;
import app.model.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = getSampleProducts();

        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите цифру для выбора сортировки");
            System.out.println("цифра 1 - по цене (возрастание)");
            System.out.println("цифра 2 - по цене (убывание)");
            System.out.println("цифра 3 - по рейтингу");
            System.out.println("цифра 4 - по наличию на складе");
            System.out.println("цифра 5 - по имени");
            System.out.println("цифра 0 - для выхода из программы");

            System.out.println("Ваш выбор:");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Выход из программы");
                break;
            }

            String sortType = null;

            switch (choice) {
                case 1:
                    products.sort(new ComparatorByPrice());
                    sortType = "по возрастанию";
                    break;
                case 2:
                    products.sort(new ComparatorByPrice().reversed());
                    sortType = "по убыванию";
                    break;
                case 3:
                    products.sort(new ComparatorByRating().reversed());
                    sortType = "по рейтингу";
                    break;
                case 4:
                    products.sort(new ComparatorByStock().reversed());
                    sortType = "по наличию на складе";
                    break;
                case 5:
                    products.sort(new ComparatorByName());
                    sortType = "по имени";
                    break;
                default:
                    System.out.println("Неверный ввод, ошибка, повторите еще раз");
                    continue;

            }
            System.out.println("\nОтсортированные товары " + sortType);
            for (Product p : products) {
                System.out.println(p);
            }

        }
        scanner.close();
    }

    private static List<Product> getSampleProducts() {
        List<Product> list = new LinkedList<>();
        list.add(new Product("Телефон", 299.99, 4.5, 152));
        list.add(new Product("Телефон", 499.99, 4.5, 112));
        list.add(new Product("Телефон", 599.99, 4.5, 122));
        list.add(new Product("Ноутбук", 899.99, 4.8, 15));
        list.add(new Product("Ноутбук", 1199.99, 5, 52));
        list.add(new Product("Ноутбук", 1299.99, 4.8, 235));
        list.add(new Product("Наушники", 59.99, 4.2, 31));
        list.add(new Product("Наушники", 55.99, 4.4, 32));
        list.add(new Product("Наушники", 58.99, 4.3, 35));
        list.add(new Product("Монитор", 299.99, 4.7, 50));
        list.add(new Product("Монитор", 179.99, 4.5, 40));
        list.add(new Product("Монитор", 189.99, 4.3, 25));
        return list;
    }
}
/*
Задание 1
Осознать код, написанный на занятие.
На занятие завтра мы продолжим его дорабатывать.
По образу и подобию (можно смотреть в код написанный на занятие)
написать свою реализацию листов которая позволяет хранить Product (из задачи про магазин)
*/

