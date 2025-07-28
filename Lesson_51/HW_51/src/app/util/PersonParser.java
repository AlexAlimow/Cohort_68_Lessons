package app.util;

import app.model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonParser {
    private final List<String> errorLog = new ArrayList<>();

    public List<String> getErrorLog(){
        return errorLog;
    }

    public List<Person> parseFile(String fileName){
        List<Person> people = new ArrayList<>();
        int lineNumber = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                Optional<Person> person = parseLine(line, lineNumber);
                person.ifPresent(people::add);
            }
        }
        catch (IOException e){
            errorLog.add("Ошибка при чтении файла: " + e.getMessage());
        }
        return people;
    }

    private Optional<Person> parseLine(String line, int lineNumber) {
        String[] parts = line.trim().split(",");
        if(parts.length != 3){
            errorLog.add("Строка " + lineNumber + ": недостаточно полей " + line);
            return Optional.empty();
        }
        String name = parts[0].trim();
        String ageStr = parts[1].trim();
        String email = parts[2].trim();

        int age;
        try {
            age = Integer.parseInt(ageStr);
            if(age <= 0){
                errorLog.add("Строка " + lineNumber + ": возраст должен быть положительным " + line);
                return Optional.empty();
            }
        }
        catch (NumberFormatException e) {
            errorLog.add("Строка " + lineNumber + ": возраст не число " + line);
            return Optional.empty();
        }
        if (!isValidEmail(email)){
            errorLog.add("Строка " + lineNumber + ": не корректный email " + line);
            return Optional.empty();
        }
        return Optional.of(new Person(name, age, email));
    }


    private boolean isValidEmail(String email) {
        if (email == null || email.isBlank()) return false;
        if (email.startsWith("@") || email.endsWith("@")) return false;
        return email.chars().filter(ch -> ch == '@').count() == 1;
    }
}
