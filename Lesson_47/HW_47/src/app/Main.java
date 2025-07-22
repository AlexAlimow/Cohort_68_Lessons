package app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Jack","John","Jack","Jack","John","Ann"
                );

        Map<String, Boolean> result = getDublicatesMap(strings);

        result.forEach((k,v) ->System.out.println(k + " " + v ));



    }

    private static Map<String, Boolean> getDublicatesMap(List<String> strings) {
        Map<String, Long> counts = strings.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        return counts.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue() > 1
                ));
    }

}
/*Дан лист строк, нужно получить Map<String, Boolean>,
где ключ - строка, значение - true, если строка встретилась более одного раза, иначе false

Естественно, решить используя Stream.
[поиск однофамильцев] Дан лист Person(firstName,lastName, age)
 ваша задача получить Map<String, List<Person>> где ключ lastName,
 значение список Person с соответствующим lastName



Дан список Account (String iban, Person owner, double balance).
У одного владельца может быть несколько счетов. Ваша задача получить Map<Person,Long> где ключ,
 владелец счета, значение сумма его вкладов.



(По желанию) Дан список выплат в виде списка строк: "Jack:1110.00", "Nick:220.50", "Jack:1300.20"....
Необходимо получить Map<String, Double> где ключ это имя, а значение - сумма выплат.
Пример:
("Jack:1110.00", "Nick:220.50", "Jack:1300.20") -> {Nick=220.5, Jack=2410.2}


 */
