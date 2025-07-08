package app.model;

import app.Employee;

import java.util.ArrayList;
import java.util.List;

public class Manager <T extends Employee> {
    private String name;
    private List<T> team;

    public Manager(String name) {
        this.name = name;
        this.team = new ArrayList<>();
    }

    public void addTeamMember(T member){
        team.add(member);
        System.out.println("Добавлен в команду: " + member.getName());
    }
    public void showTeam(){
        System.out.println("Команда менеджера " + name + ":");
        for (T member : team){
            System.out.println("- " + member.getName());
        }
    }
}
