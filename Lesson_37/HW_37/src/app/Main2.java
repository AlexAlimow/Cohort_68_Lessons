package app;

import app.model.Person;

public class Main2 {
    public static void main(String[] args) {

        MyList list = new MyLinkedList();
        list.add(new Person("Jack", 33));
        list.add(new Person("John", 31));
        list.add(new Person("Nick", 37));
        list.add(new Person("Mike", 23));
        list.add(new Person("Sveta", 39));
        list.add(new Person("Ann", 44),1);// добавляем Ann с индексом 1
        list.add(new Person("Lena", 44),3);// добавляем Ann с индексом 5


        System.out.println("Cписок:");
        System.out.println(list);

        Person search1 = new Person("Nick", 37);
        Person search2 = new Person("Frank", 37);

        System.out.println("Индекс Nick " + list.indexOf(search1));
        System.out.println("Индекс Frank " + list.indexOf(search2));// ищем того кого нет

        list.add(new Person("В начало", 22), 0);
        list.add(new Person("В конец", 99), 100);
        System.out.println("---------------------------------");
        System.out.println(list);
        System.out.println("---------------------------------");
        System.out.println("Человек по индексу 1: " + list.get(1)); // вызвали конкретный элемент по индексу
        System.out.println("Размер списка: " + list.size());


    }
}
/*
Задание 2
Добавить в код написанный в классе метод indexOf(Person person),
который возвращает индекс заданного person в нашем списке.
Если такого person нет - возвращаем null

Задание 3 (сложнее, по желанию)
Добавить в код написанный в классе метод add(Person person, int index),
который добавляет person в заданную позицию index. Если index >= size,
добавляем в конец списка, если index <= 0 добавляем в начало списка
 */
