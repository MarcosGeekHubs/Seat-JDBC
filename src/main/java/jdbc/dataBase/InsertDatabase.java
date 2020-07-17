package jdbc.dataBase;

import jdbc.Entity.Employee;

import java.sql.Connection;
import java.sql.SQLException;

public class InsertDatabase {
    public InsertDatabase(Connection conn, Employee employee) throws SQLException {

        java.sql.Statement stmt = conn.createStatement();

        try {
            conn.setAutoCommit(false);

            String SQL = "INSERT INTO Employees (age, first, last) " +
                    " VALUES (" + employee.getAge() + "," +
                    " '" + employee.getFirst() + "', " +
                    " '" + employee.getLast() + "'" +
                    ")";
            stmt.executeUpdate(SQL);
            conn.commit();

            stmt.close();
        } catch (SQLException exception) {
            conn.rollback();
            System.out.println("Error al rollback " + exception);

        }

        System.out.println("Employee create " );
    }


}
