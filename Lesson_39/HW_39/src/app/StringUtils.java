package app;

import java.util.Iterator;
import java.util.List;

public class StringUtils {
    public static String join(List<String> list) {
        Iterator<String> iterator = list.iterator();
        StringBuilder result = new StringBuilder();

        while (iterator.hasNext()) {
            result.append(iterator.next());
            if (iterator.hasNext()) {
                result.append(",");
            }
        }
        return result.toString();
    }

    public static void removeShortString(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() < 3) {
                iterator.remove();
            }
        }

    }
}

