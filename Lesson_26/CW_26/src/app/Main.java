package app;

 /*
    Задача 3 (чуть сложнее)
Создайте классы MyData и Person по примеру того, как это было на занятие.
Создайте класс BankAccount (банковский счет) со следующими полями

String iban - номер счета
double balance - баланс счета
Person owner - владелец счета
MyDate open - дата открытия Вам необходимо создать конструктор и затем
создать в программе несколько объектов банковских счетов Необходимо написать метод,
который формирует строку с информацией о счете, например, такого вида:
"DE123412341234  Н.Петров (19/10/1987) Счет открыт: 1/2/2025  Баланс 10345.10"
   */

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("DE12341123314",
                new Person("Jack","Jones",new MyDate(10,2,2008)),
                new MyDate(20,06,2024),1000);

        BankAccount account2 = new BankAccount("DE12442223311",
                new Person("Oleg","Olegov",new MyDate(12,11,1975)),
                new MyDate(20,06,2024),200000);


        BankAccount[] accountsArr = {account1, account2,
                new BankAccount("DE12334123345",
                        new Person("Stiven","Rogers", new MyDate(19,4,1918)),
                        new MyDate(14,12,2023),15000)};


        for (int i = 0; i <accountsArr.length; i++) {
            System.out.println(accountsArr[i]);

        }





    }



}
