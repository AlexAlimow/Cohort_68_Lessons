package App;

public class PersonArray
{   private Person[] array; // размер внутреннего массива
    private int capacity = 5; // сколько в нем реально элементов
    private int size = 0;

    public PersonArray() {
        this.array = new Person[capacity];
    }
    public void add(Person p){
        if(size >= array.length) {  // используем метод по добавлению в массив новых элементов
            enlarge(); // используем метод в методе который увеличивает массив и создает новый и переносит предыдущие элементы
        }
        array[size] = p;
        size ++;
    }
    private void enlarge(){
        /*
        1. создать новый массив большего размера
        2. скопировать все элементы из исходного массива в новый
        3. перекинуть указатель array на новый массив
         */
        Person[] newArray = new Person[array.length * 2]; // 1
        for (int i = 0; i < array.length; i++) {  // 2
            newArray[i] = array[i];
        }
        array = newArray;  //3


    }
    public Person get(int index){
        if (index >= 0 && index < size){
            return array[index];
        }
        return null;
    }

    public String toStringReal(){
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res += array[i] + System.lineSeparator();
        }
        return res;
    }
    public String toString(){
        String res = "";
        for (int i = 0; i < size; i++) {
            res += array[i] + System.lineSeparator();
        }
        return res;
    }
    public int size(){
        return size;
    }

}
