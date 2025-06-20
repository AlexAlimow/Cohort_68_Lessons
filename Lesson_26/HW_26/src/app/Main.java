package app;

import java.util.Scanner;

import static app.Pet.printAnimalStat;

/*
Задача 1
Давайте представим, что мы пишем программу для ветеринарной клиники.
Создайте класс Pet(Домашнее животное)
Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст
Реализуйте конструктор, toString() Реализуйте метод,
который позволяет создать объект Pet используя Scanner
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Pet pet = Pet.createPetFromInput(scanner);
//        System.out.println("вы добавили новое животное: " + pet);

        /*
    Задача 2
Используя написанные в задаче 1 классы и методы напишите программу,
которая позволяет ввести несколько домашних животных и формирует из них массив.
Выведите этот массив на экран.
     */

        System.out.print("Сколько животных вы хотите ввести? ");
        int count = Integer.parseInt(scanner.nextLine());

        Pet[] pets = new Pet[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nВвод животного №" + (i + 1));
            pets[i] = Pet.createPetFromInput(scanner);
        }

        System.out.println("\nСписок животных:");

        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i]);
        }

        System.out.print("\nВведите тип животного для получения статистики: ");
        String searchType = scanner.nextLine();
        printAnimalStat(pets, searchType);

/*
Задача 3 (по желанию)
реализуйте метод (или методы),
которые позволят получить статистику по базе животных:
пользователь вводит тип животного, например "собака",
программа должна вывести количество собак в массиве и их средний возраст.
 */

    }



}
