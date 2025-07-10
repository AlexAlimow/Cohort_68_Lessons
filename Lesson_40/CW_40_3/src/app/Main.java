package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "Lena", "Nick", "Mike", "Ann", "Joe");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите способ обработки:");
            System.out.println("1. добавить круглые скобки");
            System.out.println("2. добавить квадратные скобки");
            System.out.println("3. toUpperCase");
            System.out.println("Иначе завершение");

            int selectedItem = scanner.nextInt();
            List<String> result = new ArrayList<>();




            switch (selectedItem) {
                case 1:
                    result = listHandler(list, new StringTransformer() {
                        @Override
                        public String transform(String str) {
                            return "(" + str + ")";
                        }
                    });
                    break;
                case 2:
                    result = listHandler(list, new StringTransformer() {
                        @Override
                        public String transform(String str) {
                            return "[" + str + "]";
                        }
                    });
                    break;
                case 3:
                    result = listHandler(list, new StringTransformer() {
                        @Override
                        public String transform(String str) {
                            return str.toUpperCase();
                        }
                    });
                    break;
                default:
                    return;
            }
            System.out.println(result);


        }
    }

    public static List<String> listHandler(List<String> list, StringTransformer transformer) {
        List<String> res = new ArrayList<>();
        for (String str : list) {
            res.add(transformer.transform(str));

        }
        return res;

    }
}
