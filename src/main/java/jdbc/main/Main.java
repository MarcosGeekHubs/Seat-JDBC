package jdbc.main;

import jdbc.accountingAdvice.SystemManagement;
import jdbc.dataBase.SelectDatabase;
import jdbc.dataBase.Statement;
import jdbc.dataBase.Transaction;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        System.out.println("Hello World !!");

        SelectDatabase selectDatabase = new SelectDatabase();
        Connection conn2 = selectDatabase.getConnection();

        new SystemManagement(conn2);
        conn2.close();

        System.exit(1);

        /*JavaMySQLBasic javaMySQLBasic = new JavaMySQLBasic();
        Connection conn = javaMySQLBasic.connectDatabase();
        new CreateDatabase(conn);*/

        // new CreateTable(conn2);
        //new DropTable(conn2);

        //new DropDatabase(conn2);

        new Statement(conn2);
        Transaction transaction = new Transaction(conn2);
        transaction.normalTransaction();
        transaction.saveTransaction();
    //    conn.close();



    }
}
