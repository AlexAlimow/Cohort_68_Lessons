package app;

/*
Задача 3 (сложнее, по желанию)
Напишите метод boolean checkDate(int day, int month, int year) который получает 3 значения int,
день, месяц и год и определяет, могут ли быть эти значения корректной датой.

checkDate(10,1,2008) - true
checkDate(10,15,2008) - false
checkDate(10,-1,2008) - false
 */
public class Main3 {
    public static void main(String[] args) {

        System.out.println(checkDate(10, 1, 2008));
        System.out.println(checkDate(29, 2, 2025));

    }


    public static boolean checkDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (day < 1 || day > daysInMonth[month - 1]) {
            return false;
        }
        return true;
    }


}
