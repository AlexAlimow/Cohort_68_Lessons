package app;

import app.model.Person;
import app.service.PersonService;
import app.util.PersonParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String inputFile = "./Lesson_51/HW_51/persons.txt";
        String outputFile = "./Lesson_51/HW_51/valid_persons.txt";

        PersonParser parser = new PersonParser();
        List<Person> rawList = parser.parseFile(inputFile);

        PersonService service = new PersonService();
        List<Person> cleanList = service.removeDuplicate(rawList);
        List<Person> sortedList = service.sort(cleanList);
        service.writeToFile(sortedList, outputFile);

        System.out.println("\nПротокол обработки: ");
        if (parser.getErrorLog().isEmpty()) {
            System.out.println("Ошибок не обнаружено.");
        } else {
            parser.getErrorLog().forEach(System.out::println);
        }
    }
}
