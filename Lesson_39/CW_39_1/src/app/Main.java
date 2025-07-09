package app;

import app.model.*;

public class Main {
    public static void main(String[] args) {
        Manager<Programmer> manager = new Manager<>("John", 5000);
        manager.addToTeam(new Programmer("Oleg", 4500));
        manager.addToTeam(new BackendProgrammer("Georg", 6900));
        manager.addToTeam(new FrontendProgrammer("Jim", 6900));
        System.out.println(manager);
        System.out.println("_______________________________________________");

        Manager<QAEngineer> manager1 = new Manager<>("Lena",6000);
        manager1.addToTeam(new QAEngineer("Jack", 4800));
        manager1.addToTeam(new QAEngineer("Nick", 4800));
        manager1.addToTeam(new QAEngineer("Mike", 4800));
        System.out.println(manager1);





    }
}
/*
Допустим у нас в программе Programmer, QA Engineer, BackEndProgrammer,
FrontEndProgrammer.
Вам необходимо реализовать класс Manger, который должен содержать информацию о команде, которой
управляет Manger). Т.е. у Manager должен быть список (List) членов команды.

Важное ограничение: создавая менеджера мы определяем “специализацию менеджера”
т.е.командой каких специалистов он может руководить: например,
только специалистами тестирования, или только программистами, или только фронт-энд программистами.

Реализуйте метод добавления работника в команду.
Естественно, в команду  Programmer не должно быть возможным добавить QAEngineer

Класс Manager должен быть generic, и поле List в нем типа T

Можно сделать родительский класс Employee, и  его наследниками Programmer, QAEngineer.
У класса Programmer в свою очередь 2 наследника BackEnd Programmer и FrontEnd Programmer.
Или сделать интерфейс Employee
 */