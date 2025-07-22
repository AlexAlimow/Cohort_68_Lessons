package app;

import app.model.Account;
import app.model.Person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {

        Person jack = new Person("Jack", "Jackson", 22);
        Person anna = new Person("Anna", "Smith", 21);
        Person peter = new Person("Peter", "Jackson", 32);
        Person lucy = new Person("Lucy", "Lu", 25);
        Person tim = new Person("Tim", "Shaffer", 26);
        Person mark = new Person("Mark", "Johnson", 27);


        List<Person> personList = Arrays.asList(jack, anna, peter, lucy, tim, mark);

        List<Account> accounts = Arrays.asList(
                new Account("DE001", jack, 1200.50),
                new Account("DE002", jack, 300.25),
                new Account("DE003", anna, 5000.00),
                new Account("DE004", mark, 100.99),
                new Account("DE005", mark, 200.01),
                new Account("DE006", jack, 150.75)
        );

        Map<Person, Long> personLongMap = getTotalBalance(accounts);

        personLongMap.forEach((person, total) ->
                System.out.println(person + " -> " + total + " EUR"));


    }


    public static Map<Person, Long> getTotalBalance(List<Account> accounts) {
        return accounts.stream()
                .collect(Collectors.groupingBy(
                        Account::getOwner,
                        Collectors.summingLong(acc -> (long) acc.getBalance())
                ));
    }

}


/*
Дан список Account (String iban, Person owner, double balance).
У одного владельца может быть несколько счетов. Ваша задача получить Map<Person,Long> где ключ,
 владелец счета, значение сумма его вкладов.

 */