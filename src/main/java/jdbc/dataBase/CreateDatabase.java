package jdbc.dataBase;

import java.sql.Connection;
import java.sql.SQLException;


public class CreateDatabase {
    public CreateDatabase(Connection conn) throws SQLException {
        try {
            System.out.println("Creating database...");
            java.sql.Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE SCHEMA RDBMS");
            System.out.println("Database created successfully...");
        }catch (SQLException exception){
            System.out.println("Error create DB " + exception);
        }
    }
}
