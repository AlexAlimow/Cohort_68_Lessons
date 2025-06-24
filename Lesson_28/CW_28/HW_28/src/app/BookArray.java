package app;

public class BookArray {
    private Book[] arr;
    private int size = 0;
    private int capasity = 5;
public BookArray(){
    this.arr = new Book[capasity];
}
    private void enlarge(){
        /*
        1. создать новый массив большего размера
        2. скопировать все элементы из исходного массива в новый
        3. перекинуть указатель array на новый массив
         */
        Book[] newArray = new Book[arr.length * 2]; // 1
        for (int i = 0; i < arr.length; i++) {  // 2
            newArray[i] = arr[i];
        }
        arr = newArray;  //3


    }
    public void add(Book b){
        if(size >= arr.length) {  // используем метод по добавлению в массив новых элементов
            enlarge(); // используем метод в методе который увеличивает массив и создает новый и переносит предыдущие элементы
        }
        arr[size] = b;
        size ++;
    }
    public String toString(){
    String res = "";
        for (int i = 0; i < size; i++) {
            res += arr[i] + System.lineSeparator();
        }
        return res;
    }


    public int size(){
        return size;
    }
    public String toStringReal(){
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + System.lineSeparator();
        }
        return res;
    }
}



