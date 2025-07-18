package app;

import app.model.BankAccount;
import app.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = List.of(
                new BankAccount(new Person("John", "Lennon", 40, "lennon@gmail.com"), "DE199988643", 150000),
                new BankAccount(new Person("Paul", "McCartney", 78, "paul@gmail.com"), "DE123456789", 9500),
                new BankAccount(new Person("George", "Harrison", 20, "george@gmail.com"), "DE111122223", 75),
                new BankAccount(new Person("Ringo", "Starr", 18, "ringo@gmail.com"), "DE333344445", 500),
                new BankAccount(new Person("Yoko", "Ono", 45, "yoko@gmail.com"), "DE555566667", 120000)
        );

        List<BankAccount> lowBalance = accounts.stream()
                .filter(acc -> acc.getBalance() < 100)
                .collect(Collectors.toList());
        System.out.println("Баланс у людей < 100:");
        lowBalance.forEach(System.out::println);

        List<Person> richOwners = accounts.stream()
                .filter(acc -> acc.getBalance() > 1000_000)
                .map(BankAccount::getOwner)
                .collect(Collectors.toList());
        System.out.println("\nВладельцы с счетом > 1000_000:");
        richOwners.forEach(System.out::println);

        List<BankAccount> youngOwnersAccounts = accounts.stream()
                .filter(acc -> acc.getOwner().getAge() < 21)
                .collect(Collectors.toList());
        System.out.println("\nВладельцы с возрастом < 21");
        youngOwnersAccounts.forEach(System.out::println);




    }


}
/*
1  Использование Stream

Дан список  BankAccount {Person owner, String IBAN, double balance).
Класс Person состоит из {String fName, String lName, int age, String email)

Используя stream необходимо получить List всех аккаунтов, баланс которых составляет менее 100.

Используя stream необходимо получить List<Person> всех владельцев счетов, баланс которых больше 10000

Используя stream необходимо получить List<BankAccount> владельцы которых младше 21

Используя stream,  сформировать лист строк вида “Lennon J.;IBAN: DE199988643;lennon@gmail.com”
 (т.е. ФИО; счет, email)  для всех клиентов, чей баланс более 100000


2. По желанию (обобщенный метод)
Напишите обобщенный метод (пока без stream),
который принимает список каких то объектов,
например Person или строк, и формирует Map< … , Integer > - где ключем является объект,
значением, сколько раз этот объект встречается в изначальном списке.
Например: есть список Person, метод должен сформировать Map<Person, Integer>,
где ключ person, значение сколько раз встретился данный человек в списке.
Или есть список BankAccount, метод должен сформировать Map<BankAccount, Integer>,
где ключ account, значение сколько раз встретился данный счет в списке.

 */
