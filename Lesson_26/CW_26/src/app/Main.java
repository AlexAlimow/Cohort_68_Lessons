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



        account1.printBankAccount();

    }



}
