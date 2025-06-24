package App;

public class Main {
    public static void main(String[] args) {

        PersonArray personArray = new PersonArray();
        personArray.add(new Person("Jack", 11));
        personArray.add(new Person("Jim", 12));
        personArray.add(new Person("John", 15));
        System.out.println("Добавили 3 элемента");
        System.out.println(personArray.toStringReal());
        personArray.add(new Person("Lara", 15));
        personArray.add(new Person("Lara2", 15));
        personArray.add(new Person("Lara3", 15));


        System.out.println(personArray.size());
        System.out.println(personArray);





        System.out.println(personArray);

        System.out.println("===================");
        System.out.println(personArray.get(0)); // вызвали конкретный элемент по индексу
        System.out.println("===================");


        for (int i = 0; i < personArray.size(); i++) {   // перебираем элементы с подписанием индекса элемемента и
                                                        // выводим на экран
            System.out.println(i + ". " + personArray.get(i));
            System.out.println("============================");
            System.out.println(personArray.toStringReal());
        }



    }


}
