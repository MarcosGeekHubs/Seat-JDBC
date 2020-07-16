package jdbc.table;

import java.sql.Connection;
import java.sql.SQLException;

public class DropTable {
    public DropTable(Connection conn) {
        try {
            System.out.println("Deleting table...");
            java.sql.Statement stmt = conn.createStatement();
            stmt.executeUpdate("DROP TABLE Employees");
            System.out.println("Table REMOVE successfully...");
        }catch (SQLException exception){
            System.out.println("Error REMOVE DB " + exception);
        }

    }
}
