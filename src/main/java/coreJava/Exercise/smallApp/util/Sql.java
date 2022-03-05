package main.java.coreJava.Exercise.smallApp.util;

import main.java.coreJava.Exercise.smallApp.model.Person;

public class Sql {
    public static String inserPerson(Person person){
        return String.format("Insert into Person(Name, Surname) Values(%&)");
    }
}
