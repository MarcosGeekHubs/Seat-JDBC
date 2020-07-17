package jdbc.accountingAdvice;

import jdbc.Entity.Employee;
import jdbc.dataBase.InsertDatabase;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SystemManagement {
    public SystemManagement(Connection conn) {

        Scanner reader = new Scanner(System.in);
        int numero = 0;

        System.out.println("Introduce números. El cero para salir");
        System.out.println(" 1 - Crear Employee.");
        System.out.println(" 2 - Introduce 2.");

        do {
            try {
                numero = reader.nextInt();

                System.out.println("Se ha insertado " + numero);

                switch (numero) {
                    case 1:
                        clearScreen();
                        Employee employee = new CreateEmployee().seeMenu();
                        new InsertDatabase(conn, employee);
                        break;
                    case 2:
                        clearScreen();
                        break;
                    default:
                        clearScreen();
                        System.out.println("No se ha introducido nada.");
                }


            } catch (InputMismatchException ime) {
                System.out.println("¡Cuidado! Solo puedes insertar números. ");
                reader.next();
            } catch (IOException $exception) {
                System.out.println("Error al limpiar la pantall. ");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } while (numero != 0);
    }


    private static void clearScreen() throws IOException {
        final String operatingSystem = System.getProperty("os.name");
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if (operatingSystem.contains("Windows")) {
            Runtime.getRuntime().exec("cls");
        } else {
            Runtime.getRuntime().exec("clear");
        }
    }
}
