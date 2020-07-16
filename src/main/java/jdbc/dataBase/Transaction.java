package jdbc.dataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;

public class Transaction {
    private final Connection conn;
    private final java.sql.Statement stmt;
    private Savepoint savepoint1;

    public Transaction(Connection conn) throws SQLException {

        this.conn = conn;
        this.stmt = this.conn.createStatement();

    }

    public void normalTransaction() throws SQLException {
        try {
            this.conn.setAutoCommit(false);

            String SQL = "INSERT INTO Employees  " +
                    "VALUES (106, 20, 'Rita', 'Pascual')";
            this.stmt.executeUpdate(SQL);

             String SQL2 = "INSERTED IN Employees  " +
             "VALUES (107, 22, 'Marta', 'Molto')";
            stmt.executeUpdate(SQL2);

            this.conn.commit();

            this.stmt.close();
        } catch (SQLException exception) {
            this.conn.rollback();
            System.out.println("Error al rollback " + exception);

        }
    }

    public void saveTransaction() throws SQLException {
        try {
            this.conn.setAutoCommit(false);

            String SQL = "INSERT INTO Employees " +
                    "VALUES (108, 20, 'save', 'point')";
            this.stmt.executeUpdate(SQL);
            this.savepoint1 = this.conn.setSavepoint();

            String SQL2 = "INSERTED IN Employees " +
                    "VALUES (109, 22, 'Sita', 'Tez')";
            this.stmt.executeUpdate(SQL2);
            conn.commit();

        } catch (SQLException exception) {
            this.conn.rollback(this.savepoint1);
            conn.commit();
            System.out.println("Error al rollback and save point" + exception);
        }

    }
}
