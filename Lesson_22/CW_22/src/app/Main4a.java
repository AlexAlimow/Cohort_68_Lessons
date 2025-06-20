package app;

public class Main4a {
    public static void main(String[] args) {
        System.out.println("Первый поход:");
        goShop("Молоко", 2, "Lidl");
        System.out.println("сходили");
        System.out.println("Второй поход:");
        goShop("Хлеб", 3,"Penny");
        System.out.println("сходили");
        goShop("Чай",1, "Лидл");
        goShop("Пицца",2, "Альди");

    }

    public static void goShop(String product, int quantity, String shopName){
        System.out.println("1. Одеваюсь");
        System.out.println("2. выхожу на улицу");
        System.out.println("3. иду в магазин: " + shopName);
        System.out.println("4. покупаю " + product + " (" + quantity + ") " + "шт." );
        System.out.println("5. возвращаюсь");
        System.out.println("-----------------------------------------------");
    }
}
