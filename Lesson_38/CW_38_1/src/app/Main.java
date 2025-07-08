package app;

import app.model.Product;

public class Main {
    public static void main(String[] args) {
    MyList list = new MyArrayList();
    list.add(new Product("Phone",699.0,8,101));
    list.add(new Product("Phone1",630.0,9,20));
    list.add(new Product("Phone2",290.0,7,29));
    list.add(new Product("Phone3",301.0,5,89));
    list.add(new Product("Phone4",3586.0,5,89));
    list.add(new Product("Phone5",300.0,5,89));
    list.add(new Product("Iphone",300.0,5,89));
        System.out.println(list);
        System.out.println("Первый элемент: " + list.get(0));
        System.out.println("Последний элемент: " + list.get(list.size()-1));

        System.out.println();
        Product product1 = new  Product("Iphone",300.0,5,89);
        Product product2 = new  Product("Iphone2",300.0,5,89);

        System.out.println("Найдем продукт: " + product1);
        System.out.println("Индекс " + list.indexOf(product1));
        System.out.println("Индекс " + list.indexOf(product2));

        MyList list2 = new MyLinkedList();

        list2.add(new Product("Phone",699.0,8,101));
        list2.add(new Product("Phone1",630.0,9,20));
        list2.add(new Product("Phone2",290.0,7,29));
        list2.add(new Product("Phone3",301.0,5,89));
        list2.add(new Product("Phone4",3586.0,5,89));
        list2.add(new Product("Phone5",300.0,5,89));
        list2.add(new Product("Iphone",300.0,5,89));

        System.out.println("===============================================");

        System.out.println(list2);
        System.out.println("Первый элемент: " + list2.get(0));
        System.out.println("Последний элемент: " + list2.get(list2.size()-1));

        System.out.println();
        Product product3 = new  Product("Iphone",300.0,5,89);
        Product product4 = new  Product("Iphone2",300.0,5,89);

        System.out.println("Найдем продукт: " + product3);
        System.out.println("Индекс " + list2.indexOf(product3));
        System.out.println("Индекс " + list2.indexOf(product4));

        System.out.println("-------------Добавили add в MyLinkedList-------------");

        list2.add(new Product("Macboock",2009,10,200),2);




    }
}
