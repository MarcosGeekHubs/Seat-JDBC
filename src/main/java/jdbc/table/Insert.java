package jdbc.table;

import java.sql.Connection;
import java.sql.SQLException;

public class Insert {
    public Insert(Connection conn) {
        try {

            java.sql.Statement stmt = conn.createStatement();

            String SQL = "INSERT INTO Employees " +
                    "VALUES (108, 20, 'save', 'point')";
            stmt.executeUpdate(SQL);

        } catch (SQLException exception) {
            System.out.println("Error al rollback and save point" + exception);
        }
    }
}
