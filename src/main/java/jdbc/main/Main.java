package jdbc.main;

import jdbc.dataBase.*;
import jdbc.table.*;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World !!");

        JavaMySQLBasic javaMySQLBasic = new JavaMySQLBasic();
        Connection conn = javaMySQLBasic.connectDatabase();
        new CreateDatabase(conn);
        conn.close();

        SelectDatabase selectDatabase = new SelectDatabase();
        Connection conn2 = selectDatabase.getConnection();

        new CreateTable(conn2);
        new DropTable(conn2);

        System.exit(1);
        new DropDatabase(conn2);

        new Statement(conn2);
        Transaction transaction = new Transaction(conn2);
        transaction.normalTransaction();
        transaction.saveTransaction();


        conn2.close();
    }
}
