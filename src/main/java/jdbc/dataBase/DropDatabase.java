package jdbc.dataBase;

import java.sql.Connection;
import java.sql.SQLException;

public class DropDatabase {
    public DropDatabase(Connection conn) {
        try {
            System.out.println("Deleting database...");
            java.sql.Statement stmt = conn.createStatement();
            stmt.executeUpdate("DROP SCHEMA rdbms");
            System.out.println("Database REMOVE successfully...");
        }catch (SQLException exception){
            System.out.println("Error REMOVE DB " + exception);
        }
    }
}