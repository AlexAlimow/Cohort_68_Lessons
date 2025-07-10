package app;

import app.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyLinkedList();
        list.add(new Product("Notebook", 2490.99, 8, 25));
        list.add(new Product("Phone", 490.99, 9, 12));
        list.add(new Product("Notebook", 1250, 6, 250));
        list.add(new Product("Tablet", 540.99, 8, 120));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите критерий сортировки:");
        System.out.println("1 - Цена");
        System.out.println("2 - Рейтинг");
        System.out.println("3 - Название");
        int criterion = scanner.nextInt();

        System.out.println("Выберите направление сортировки:");
        System.out.println("1 - По возрастанию");
        System.out.println("2 - По убыванию");
        int order = scanner.nextInt();

        Comparator<Product> comparator;

        switch (criterion) {
            case 1:
                comparator = Comparator.comparing(Product::getPrice);
                break;
            case 2:
                comparator = Comparator.comparing(Product::getRating);
                break;
            case 3:
                comparator = Comparator.comparing(Product::getName);
                break;
            default:
                System.out.println("Некорректный выбор, сортировка по цене");
                comparator = Comparator.comparing(Product::getPrice);
        }

        if (order == 2) {
            comparator = comparator.reversed();
        }

        sortList(list, comparator);

        System.out.println("\nОтсортированный список:");
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public static void sortList(MyList list, Comparator<Product> comparator) {
        List<Product> tempList = new ArrayList<>();
        for (Product p : list) {
            tempList.add(p);
        }
        tempList.sort(comparator);

        if (list instanceof MyLinkedList) {
            ((MyLinkedList) list).clear();
            for (Product p : tempList) {
                list.add(p);
            }
        }
    }
}
