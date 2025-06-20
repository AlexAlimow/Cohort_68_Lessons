package app;

import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {

        /*
Задание 1
Исходные данные программы:

.имя
отчество
фамилия
Создайте переменные для этих данных. После чего сформируйте строке вида:

Николай Иванович Петров (Н.И. Петров)
Copy
Подсказка: что бы получить инициалы, используйте charAt как мы делали на занятие
 */

        String firstName = "Николай";
        String surName = "Иванович";
        String lastName = "Петров";
        String fullName = firstName + " " + surName + " " + lastName
                + " (" + firstName.charAt(0) + "." + surName.charAt(0) + ". " + lastName + ")";

        System.out.println(fullName);
        System.out.println("======");


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

//        String myFullName = "Николай Иванович Петров";
//        int firstSpace = myFullName.indexOf(' '), lastSpace = myFullName.lastIndexOf(' ');
//        String myFirstName = myFullName.substring(0,firstSpace);
//        String mySurName = myFullName.substring(firstSpace + 1, lastSpace);
//        String myLastName = myFullName.substring(lastSpace + 1);
//
//        System.out.println(myFirstName + " " + mySurName + " " + myLastName);
//        System.out.println(myFirstName);
//        System.out.println(mySurName);
//        System.out.println(myLastName);

        String fullNameStr = "Николай Иванович Петров";
        int firstSpace = fullNameStr.indexOf(" "); // Нашли индекс первого пробела
        int lastSpace = fullNameStr.lastIndexOf(" "); // Нашли индекс последнего пробела
        String name1 = fullNameStr.substring(0,firstSpace);
        String name2 = fullNameStr.substring(firstSpace + 1, lastSpace);
        String name3 = fullNameStr.substring(lastSpace + 1);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        String nN = "Alex";
        String nN2 = nN.substring(0,2);
        System.out.println(nN2);







    }
}
