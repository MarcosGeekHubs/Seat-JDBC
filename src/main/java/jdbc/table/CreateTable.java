package jdbc.table;

import java.sql.Connection;
import java.sql.SQLException;

public class CreateTable {
    public CreateTable(Connection conn) throws SQLException {
        try {
            System.out.println("Creating table...");
            java.sql.Statement stmt = conn.createStatement();
            stmt.executeUpdate(" CREATE TABLE Employees (" +
                    " id INT NOT NULL AUTO_INCREMENT," +
                    " age INT NOT NULL," +
                    " first VARCHAR(255)," +
                    " last VARCHAR(255)," +
                    " PRIMARY KEY ( id ))");
            System.out.println("table Employees created successfully...");
        } catch (SQLException exception) {
            System.out.println("Error create table " + exception);
        }
    }
}
