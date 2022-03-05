package main.java.coreJava.Exercise.smallApp.model;

import java.util.Objects;

public class User {
    private Person person;
    private String username;
    private String pass;

    public User() {
    }

    public User(Person person, String username, String pass) {
        this.person = person;
        this.username = username;
        this.pass = pass;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(person, user.person) && Objects.equals(username, user.username) && Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, username, pass);
    }

    @Override
    public String toString() {
        return "User{" +
                "person=" + person +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
