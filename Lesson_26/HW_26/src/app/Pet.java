package app;

import java.util.Scanner;

public class Pet {

    String type;
    String name;
    String color;
    int age;

    public Pet(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return "Ваш питомец: " + type + ", Имя: " + name + ", Цвет: " + color + ", Возраст: " + age;
    }

    public static Pet createPetFromInput(Scanner scanner) {
        scanner = new Scanner(System.in);

        System.out.println("Введите тип животного: ");
        String type = scanner.nextLine();

        System.out.println("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.println("Введите цвет животного: ");
        String color = scanner.next();

        System.out.println("Введите возраст животного: ");
        int age = scanner.nextInt();

        return new Pet(type, name, color, age);


    }

    public static void printAnimalStat(Pet[] pets, String searchType) {
        int count = 0;
        int totalAge = 0;
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].type.equalsIgnoreCase(searchType)) {
                count++;
                totalAge += pets[i].age;
            }
        }
        if (count > 0) {
            double averageAge = (double) totalAge / count;
            System.out.println("Найдено животных типа \"" + searchType + "\": " + count);
            System.out.printf("Средний возраст: %.2f лет\n", averageAge);
        } else {
            System.out.println("Животные типа \"" + searchType + "\" не найдены.");
        }
    }
}


