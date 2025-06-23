package app;
/*
Задача 1
        Давайте представим, что мы пишем программу для ветеринарной клиники.
Создайте класс Pet(Домашнее животное)
Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст
        Реализуйте конструктор, toString() Реализуйте метод,
который позволяет создать объект Pet используя Scanner
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        Pet1[]  petArray = createPetArray(2);
//        printPetArray(petArray);
        infoByType(petArray, "Собака");
    }

    public static Pet1 inputPet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип животного: ");
        String type = scanner.nextLine();
        System.out.println("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.println("Введите цвет животного: ");
        String color = scanner.nextLine();
        System.out.println("Введите возраст животного: ");
        int age = scanner.nextInt();

        return new Pet1(type,name,color,age);
    }

    /*
    Задача 2
Используя написанные в задаче 1 классы и методы напишите программу,
которая позволяет ввести несколько домашних животных и формирует из них массив.
Выведите этот массив на экран.
     */
    public static Pet1[] createPetArray(int size){
        Pet1[] petArray = new Pet1[size];
        for (int i = 0; i < petArray.length; i++) {
            System.out.println("Вводим питомца номер " + (i +1));
            petArray[i] = inputPet();
            System.out.println("Pet: " + petArray[i]);
            System.out.println("---------------------------");
        }

        return petArray;
    }
    public static void printPetArray(Pet1[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    /*
Задача 3 (по желанию)
реализуйте метод (или методы),
которые позволят получить статистику по базе животных:
пользователь вводит тип животного, например "собака",
программа должна вывести количество собак в массиве и их средний возраст.
 */
    public static void infoByType(Pet1[] arr, String type){
        int count = 0;
        int sumAges = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].type.equalsIgnoreCase(type)){
            count++;
            sumAges+= arr[i].age;

            }

        }
        if (count == 0){
            System.out.println("Животных с типом " + type + " нет в базе");
        } else {
            System.out.println("Животных с типом " + type + ": " + count);
            System.out.println("средний возраст " + ((double)sumAges/count));
        }
    }

}
