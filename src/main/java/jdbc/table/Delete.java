package jdbc.table;

import java.sql.Connection;
import java.sql.SQLException;

public class Delete {
    public Delete(Connection conn) {
        try {

            java.sql.Statement stmt = conn.createStatement();

            String SQL = "DELETE FROM employees";
            stmt.executeUpdate(SQL);

        } catch (SQLException exception) {
            System.out.println("Error al rollback and save point" + exception);
        }
    }
}
