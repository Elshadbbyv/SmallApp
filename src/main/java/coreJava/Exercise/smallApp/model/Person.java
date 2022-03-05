package main.java.coreJava.Exercise.smallApp.model;

import java.util.Objects;

public class Person {
    private Long id;
    private String name;
    private String surname;
    private String fathername;
    private int age;
    private Gender gender;

    public Person() {
        this.id = id;
    }

    public Person(Long id,
                  String name,
                  String surname,
                  String fathername,
                  int age,
                  Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(fathername, person.fathername) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, fathername, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathername='" + fathername + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
