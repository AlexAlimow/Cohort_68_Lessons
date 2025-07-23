package app.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<String> list = List.of("Jack:1110.00", "Nick:220.50", "Jack:1300.20");
        Map<String, Double> map = list.stream()
                .map(s -> s.split(":"))
                .filter(arr -> arr.length > 1)
                .collect(Collectors.toMap(s -> s[0],
                        s -> Double.parseDouble(s[1]),
                        Double::sum));

        map.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}

/*
(По желанию) Дан список выплат в виде списка строк: "Jack:1110.00", "Nick:220.50", "Jack:1300.20"....
Необходимо получить Map<String, Double> где ключ это имя, а значение - сумма выплат.
Пример:
("Jack:1110.00", "Nick:220.50", "Jack:1300.20") -> {Nick=220.5, Jack=2410.2}
 */