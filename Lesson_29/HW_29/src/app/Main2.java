package app;
/*
Задача 2
Давайте создадим класс Product.
Пусть у нашего продукта будет название и цена.
Создайте в программе список из Product,
и выведите его на экран, например так:
1. Хлеб 1.79
2. Молоко 1.05
3. Масло 2.39
4. Колбаса 2.99
5. Рис 0.99

Реализуйте возможность для пользователя указывать номер позиции,
тем самым добавлять продукт в корзину.
Один и тот же продукт может несколько раз быть добавленным в корзину.
Если пользователь ввел '0' считаем что ввод закончен.
Система должна распечатать все продукты в корзине и количество и сумму заказа.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        List<Product> myProducts = new ArrayList<>();
        myProducts.add(new Product("Хлеб", 3.20));
        myProducts.add(new Product("Молоко", 1.20));
        myProducts.add(new Product("Йогурт", 2.70));
        myProducts.add(new Product("Масло", 1.15));
        myProducts.add(new Product("Рис", 4.20));
        myProducts.add(new Product("Колбаса", 5.50));
        myProducts.add(new Product("Пицца", 4.80));

        printProductsList(myProducts);
        List<Product> cart = buyProducts(myProducts);
        printCart(cart);


    }

    public static void printProductsList(List<Product> products) {
        int index = 1;
        for (Product p : products) {
            System.out.println(index + ". " + p.getName() + " " + p.getPrice());
            index++;
        }
    }

    public static List<Product> buyProducts(List<Product> products) {
        Scanner scanner = new Scanner(System.in);
        List<Product> cart = new ArrayList<>();

        System.out.println("Введите номер товара чтобы добавить в корзину (нажмите 0 чтобы завершить ввод):");
        while (true) {
            System.out.println("Ваш выбор: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }
            if (choice >= 1 && choice <= products.size()) {
                Product selected = products.get(choice - 1);
                cart.add(selected);
                System.out.println("Вы добавили " + selected.getName());
            } else {
                System.out.println("Не корректный номер попробуйте еще раз");
            }
        }

        return cart;
    }

    public static void printCart(List<Product> cart) {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }
        System.out.println("\nКорзина:");

        List<String> printed = new ArrayList<>();
        double total = 0;

        for (Product p : cart) {
            if (!printed.contains(p.getName())) {
                int count = 0;
                double sum = 0;

                for (Product item : cart) {
                    if (item.getName().equals(p.getName())) {
                        count++;
                        sum += item.getPrice();
                    }
                }
                System.out.println(p.getName() + " x" + count + " = " + sum);
                total += sum;
                printed.add(p.getName());
            }
        }
        System.out.println("Итого: " + total);

    }
}
