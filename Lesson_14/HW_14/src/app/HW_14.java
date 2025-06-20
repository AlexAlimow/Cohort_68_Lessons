package app;

public class HW_14 {
    public static void main(String[] args) {
/*
Задание 1
Исходные данные программы:

имя
отчество
фамилия
Создайте переменные для этих данных. После чего сформируйте строке вида:

Николай Иванович Петров (Н.И. Петров)
Copy
Подсказка: что бы получить инициалы, используйте charAt как мы делали на занятие
 */
        String name = "Николай";
        String surName = "Иванович";
        String lastName = "Петров";

        System.out.println("Привет " + name + " " + surName + " " + lastName);
        System.out.println("(" + name.charAt(0)+ "." + surName.charAt(0) + ". " + lastName + ")");
        System.out.println("=======================");

        String nameString = name + " " + surName + " " + lastName
                + " (" + name.charAt(0) + "." + surName.charAt(0) + "." + lastName + ")";

        System.out.println("=========");
        System.out.println(nameString);


        /*
        Задание 2
Обратные задача. Исходные данные программы: строка вида

Николай Иванович Петров

Написать программу, которая разбирает строку на три переменные:

имя
отчество
фамилия
Подсказка: Вам понадобятся методы строки indexOf(), lastIndexOf и substring()
         */
        String fullName = "Николай Иванович Петров";


        System.out.println(fullName.substring(0,7));
        System.out.println(fullName.substring(8,16));
        System.out.println(fullName.substring(17,23));
        System.out.println("=======");

        System.out.println(fullName.substring(0,7) +" " + fullName.substring(8,16) + " " + fullName.substring(17));
    }
}
