package main.java.coreJava.Exercise.smallApp.contoller;

import main.java.coreJava.Exercise.smallApp.model.Person;
import main.java.coreJava.Exercise.smallApp.services.PersonService;

import java.util.Scanner;

public class personController {
    private final Scanner sc = new Scanner(System.in);
    private final PersonService service;

    public personController(PersonService service) {
        this.service = service;
    }

    private void savePerson(){
        Person person = new Person();
        System.out.println("Enter name: ");
        String name = sc.next();
        person.setName(name);
        service.savePerson(person);

    }
}
