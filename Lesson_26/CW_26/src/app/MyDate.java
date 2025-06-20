package app;

public class MyDate {
    int day;
    int month;
    int year;


    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // static - не нужно !!!
    public  String dateToString(){
        return  day + "/" + month + "/" + year ;
    }
}

