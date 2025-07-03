package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String url = "jdbc:postgresql://localhost:5433/myDB";
        String username = "postgres";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established!!!");
            runQuery(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void runQuery(Connection connection) throws SQLException {
        String query = "select sname from student where sid=1";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        if (rs.next()) {
            System.out.println(rs.getString("sname"));
        }
        connection.close();
    }

}
