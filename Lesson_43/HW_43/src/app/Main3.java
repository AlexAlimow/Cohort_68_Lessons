package app;

import app.model.Account;
import app.model.Person;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Person p1 = new Person("Alex","Alimow");
        Person p2 = new Person("Natalie","Johnson");
        Person p3 = new Person("John","Smith");
        Person p4 = new Person("Bob","Watcher");

        List<Account> accounts = Arrays.asList(
                new Account("DE1234567865",p1),
                new Account("DE2411255677",p2),
                new Account("DE1151367713",p1),
                new Account("DE6345772244",p3)
        );
        Map<Person, List<String>> map =  buildPersonToIbansMap(accounts);
        printMap(map);
    }

    public static Map<Person, List<String> > buildPersonToIbansMap(List<Account> accounts) {
        Map<Person, List<String>> result = new HashMap<>();
        for (Account account : accounts){
            Person owner = account.getOwner();
            result.computeIfAbsent(owner, k -> new ArrayList<>()).add(account.getIban());
        }
        return result;

    }
    public static void printMap(Map<Person, List<String>> map){
        for (Map.Entry<Person, List<String>> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

/*Предположим, у вас есть список объектов Account { String iban, Person owner}.
У каждого клиента может быть несколько счетов.
Ваша задача написать метод, который сформирует Map<Person,
List<String>>, где ключом будет владелец счета, а значением - список номеров (iban) счетов.
Подсказка: т.к. Person это ключ, система должна уметь определить равен ли один Person другому.
 Т.е. equals и hashCode
 */

