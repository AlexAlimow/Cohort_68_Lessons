package app;
/*
Задача 2
Создайте класс Auto (машина) Поля: брэнд, цвет, год выпуска, цена
Создайте несколько объектов этого класса. Напишите метод, который выводит на экран данные машины.
 */
public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car("BMW","Black",2024,55000);
        Car myCar2 = new Car("Audi","Red",2022,33000);

        printObject(myCar2);
        printObject(myCar1);
        System.out.println("--------------------------------------");

        BankAccount myBankAccount = new BankAccount("DE123567761",
                new Person("Stiven","Rogers",
                        new MyDate(4,7,1918)),
                new MyDate(12,12,1980),150000);

        printBankAccount(myBankAccount);


    }
    public static void printObject(Car car) {
        System.out.println("Бренд: " + car.brandName + " Цвет: "
                + car.color + " Год выпуска: " + car.year + " Цена: " + car.price);
    }

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
    public static void printBankAccount(BankAccount myBankAccount){
        System.out.println(myBankAccount.iban + " " + myBankAccount.owner.firstName.charAt(0) + "."
                + myBankAccount.owner.lastName + "(" + myBankAccount.owner.birthday.day + "/"
                + myBankAccount.owner.birthday.month + "/" + myBankAccount.owner.birthday.year
                + ")" + " Счет открыт: " + myBankAccount.open.day + "/" + myBankAccount.open.month + "/"
                + myBankAccount.open.year + " Баланс: " + myBankAccount.balance);
    }

}
