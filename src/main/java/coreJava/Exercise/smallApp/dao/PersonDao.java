package main.java.coreJava.Exercise.smallApp.dao;

import main.java.coreJava.Exercise.smallApp.model.Person;
import main.java.coreJava.Exercise.smallApp.util.Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDao {
    private final String url  = "jdbc:postgresql://localhost:5432/group-j4";
    private final String user = "postgres";
    private final String pass = "00000000";
    public boolean save(Person person){
        try {
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement stmt = con.createStatement();
            stmt.execute(Sql.inserPerson(person));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
