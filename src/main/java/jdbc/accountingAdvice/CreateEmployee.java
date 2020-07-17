package jdbc.accountingAdvice;

import jdbc.Entity.Employee;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateEmployee {
    private final Employee employee;

    public CreateEmployee() {

        this.employee = new Employee();

    }

    public Employee seeMenu() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Datos del Employee");

        try {
            System.out.println("Nombre de usuario");
            this.employee.setFirst(reader.nextLine());

            System.out.println("Apellido de usuario");
            this.employee.setLast(reader.nextLine());

            System.out.println("Años de usuario");
            this.employee.setAge(reader.nextInt());

        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. ");
            reader.next();
        }
        return this.employee;

    }
}
