package app;

import app.model.*;

public class Main {
    public static void main(String[] args) {
        Manager<Programmer> programmerManager = new Manager<>("Alex");
        programmerManager.addTeamMember(new BackEndProgrammer("Jack"));
        programmerManager.addTeamMember(new FrontEndProgrammer("John"));

        Manager<QAEngineer> qaManager = new Manager<>("Bob");
        qaManager.addTeamMember(new QAEngineer("Nick"));

        programmerManager.showTeam();
        qaManager.showTeam();
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