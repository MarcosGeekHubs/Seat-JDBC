package jdbc.table;

import java.sql.Connection;
import java.sql.SQLException;

public class Update {
    public Update(Connection conn) {
        try {

            java.sql.Statement stmt = conn.createStatement();

            String SQL = "UPDATE employees SET first = 'Marcos' WHERE (`id` = '1');";
            stmt.executeUpdate(SQL);

        } catch (SQLException exception) {
            System.out.println("Error al rollback and save point" + exception);
        }
    }
}
