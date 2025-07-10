package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Ann");
        names.add("Jo");
        names.add("Jim");
        names.add("Jerry");
        names.add("Bo");

        System.out.println("До удаления строки: " + names);
        StringUtils.removeShortString(names);
        System.out.println("После удаления: " + names);

        String result = StringUtils.join(names);
        System.out.println("результат объединения: " + result );

    }
}
