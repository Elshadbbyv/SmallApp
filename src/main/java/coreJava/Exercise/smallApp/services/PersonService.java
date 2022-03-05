package main.java.coreJava.Exercise.smallApp.services;

import main.java.coreJava.Exercise.smallApp.model.Person;

public class PersonService {

    public void savePerson(Person person){
        if (person.getName().length()<=3){
            System.out.println("Cant be Less than 3");
            return;
        }
        // All checks must be here
    }
}
