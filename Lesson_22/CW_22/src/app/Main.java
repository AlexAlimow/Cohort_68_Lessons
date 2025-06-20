package app;

public class Main {
    public static void main(String[] args) {

        double[] incomeArr = {10.0,10.0,10.0,
                15.0,10.0,10.0,
                12.0,13.0,14.0,
                10.0,25.3,12.0};
        double totalIncome = 0; // сумма дохода
        int indexMaxMonth = 0; // номер месяца с максимальным доходом пока по умолчанию
        String[] months = {"Январь","Февраль","Март",
                "Апрель","Май","Июнь",
                "Июль","Август","Сентябрь",
                "Октябрь","Ноябрь","Декабрь"};

        for (int i = 0; i < incomeArr.length; i++) {
            totalIncome += incomeArr[i];

            if(incomeArr[indexMaxMonth] < incomeArr[i]){
                indexMaxMonth = i;

            }
            System.out.println("Сумма дохода за год: " + totalIncome);
            System.out.println("Самый доходный месяц: " + (indexMaxMonth + " " + months[indexMaxMonth]));
            System.out.println("Доход в зтом месяце составил: " + incomeArr[indexMaxMonth]);


            }

        }


        }




