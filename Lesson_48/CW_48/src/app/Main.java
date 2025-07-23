package app;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "John", "Ann", "Nick", "Jack", "Ann");

        Map<String, Boolean> result = list.stream().collect(Collectors.toMap(s -> s, s -> false, (v1, v2) -> true));
        System.out.println(result);
    }
}
/*Дан лист строк, нужно получить Map<String, Boolean>,
где ключ - строка, значение - true, если строка встретилась более одного раза, иначе false
*/