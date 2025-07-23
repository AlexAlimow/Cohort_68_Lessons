package app;

import app.model.Account;
import app.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {

        List<Account> list = List.of
                        (new Account("DE20202010", new Person("Jack", "Jackson", 30), 5800.43),
                        (new Account("DE20202011", new Person("Ann", "Brown", 32), 11000.00)),
                        (new Account("DE22202021", new Person("Ann", "Brown", 32), 12000.00)),
                        (new Account("DE20202012", new Person("Tim", "White", 31), 4200.42)),
                        (new Account("DE20202013", new Person("Nick", "Black", 32), 1100.20)),
                        (new Account("DE20202014", new Person("Rob", "Johnson", 33), 2010.45)),
                        (new Account("DE20202015", new Person("John", "Jackson", 34), 5500.55)),
                        (new Account("DE20202035", new Person("John", "Jackson", 34), 7000))
                );

        list.forEach(System.out::println);

        System.out.println("---------------------------------");

        Map<Person, Double> map = list.stream().collect(Collectors.groupingBy(Account::getOwner,
                Collectors.summingDouble(Account::getBalance)));
        map.forEach((k, v) -> System.out.println(k + ":" + v));

        System.out.println("----------------V2--------------------");

        Map<Person, Double> map2 = list.stream()
                .collect(Collectors.toMap(Account::getOwner,
                        Account::getBalance,
                        Double::sum));
        map2.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}

/*
Дан список Account (String iban, Person owner, double balance).
У одного владельца может быть несколько счетов. Ваша задача получить Map<Person,Double> где ключ,
 владелец счета, значение сумма его вкладов.

 */
