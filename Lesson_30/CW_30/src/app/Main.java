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

public class Main {
    public static void main(String[] args) {
        List<Product> myProducts = new ArrayList<>();
        myProducts.add(new Product("Хлеб", 3.20));
        myProducts.add(new Product("Молоко", 1.20));
        myProducts.add(new Product("Йогурт", 2.70));
        myProducts.add(new Product("Масло", 1.15));
        myProducts.add(new Product("Рис", 0.90));
        myProducts.add(new Product("Колбаса", 5.50));
        myProducts.add(new Product("Пицца", 4.80));


        List<Product> cart = (myProducts);
        print(createCart(myProducts));
        System.out.println("...........корзина..........");
        print(cart);
        System.out.println("----------------------------");
        System.out.println("Колличество позиций: " + cart.size());
        System.out.println("Итого сумма заказа: " + calcSumOfOrded(cart));
    }

    public static void print(List<Product> list) {
        int i = 1;
        for (Product product : list) {
            System.out.println(i + ". " + product);
            i++;
        }
    }

    public static List<Product> createCart(List<Product> list) {
        List<Product> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------");
        print(list);
        System.out.println("---------------------------");
        while (true) {
            System.out.println("Выбирите товар или введите 0 для завершения:");
            int item = scanner.nextInt();
            if (item == 0) {
                break;
            } else {
                if (item >= 1 && item < list.size()) {
                    Product product = list.get(item -1);
                    cart.add(list.get(item - 1));
                    System.out.println("Вы добавили " + list.get(item -1));
                } else {
                    System.out.println("товар не найден");
                }
            }


        }
        return cart;
    }
    public static double calcSumOfOrded(List<Product> list){
        double sum = 0;
        for (Product product : list){
            sum += product.getPrice();
        }
        return sum;
    }



}





