package app;



/*
Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст
 */
public class Pet1 {
    String type;
    String name;
    String color;
    int age;

    public Pet1(String type,String name,String color, int age){
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString(){
        return name + " (" + type + ") Возраст: " + age + " Цвет: " + color;

    }


}
