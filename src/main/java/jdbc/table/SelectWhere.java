package jdbc.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectWhere {
    public SelectWhere(Connection conn) {
        try {

            Statement stmt = conn.createStatement();

            String SQL = "SELECT * FROM Employees WHERE first LIKE 'Mar%' ";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");
                System.out.print("ID: " + id + ", Age: " + age + ", First: " + first + ", Last: " + last);
            }

        } catch (SQLException exception) {
            System.out.println("Error al rollback and save point" + exception);
        }
    }
}
