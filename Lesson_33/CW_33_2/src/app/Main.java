package app;

public class Main {
    public static void main(String[] args) {
        Outer.Inner obj1 = new Outer.Inner();
        obj1.run(); // запускаем статический метод из внутреннего статического класса
        System.out.println("-----------------------------");  // тут класс статик

        Outer2 outer2 = new Outer2(); /// нужен инстанс внешнего класса
        Outer2.Inner obj2 = outer2.new Inner(); // создаем переменную instans это объект класса (экземпляр)
        obj2.run();  // Так мы добираемся до метода и запускаем его уже из объекта (т.к класс не статик)


    }
}
