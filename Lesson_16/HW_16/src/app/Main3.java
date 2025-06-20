package app;

public class Main3 {

    /*
        Задача 3
Дано три переменные:

isQuietHours — сейчас тихое время (ночь, например)
hasNeighborsComplaint — жалуются ли соседи
isHoliday — сейчас праздник Музыку можно включить,
если не тихое время и соседи не жалуются.
В праздник музыку можно включать даже если соседи жалуются или тихое время.
Запишите условие для переменной isMusicAllowed: можно ли включать музыку
         */

    public static void main(String[] args) {

        boolean isQuietHours = false;
        boolean hasNeighborsComplaint = true;
        boolean isHoliday = false;
        boolean isMusicAllowed = isHoliday || (!isQuietHours && !hasNeighborsComplaint);
        if (isMusicAllowed) {
            System.out.println("музыку можно включать");
        } else {
            System.out.println("музыку включать нельзя");
        }

    }




}
