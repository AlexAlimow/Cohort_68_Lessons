package app;

public class Main {
    public static void main(String[] args) {


         boolean isMorning = false;
         boolean isEvening = true;
         boolean isSummer = true;
         boolean isWinter = false;

         boolean isSummerOrWinterEvening = (isWinter && isEvening) || (isSummer && isMorning);


         if (!isSummerOrWinterEvening) {

             System.out.println("Сейчас зимний или летний вечер");

         } else {
             System.out.println("Сейчас не зимний или не летний вечер");

         }
    }
}
