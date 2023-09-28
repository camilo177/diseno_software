package datosPkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Direccion
        System.out.println("Ingrese los datos de la dirección:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Primer Apellido: ");
        String primerApellido = scanner.nextLine();
        System.out.print("Segundo Apellido: ");
        String segundoApellido = scanner.nextLine();
        System.out.print("Calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Provincia: ");
        String provincia = scanner.nextLine();
        System.out.print("Código Postal: ");
        String codigoPostal = scanner.nextLine();

        // Create an instance of Direccion
        Direccion direccion = new Direccion(nombre, primerApellido, segundoApellido, calle, ciudad, provincia, codigoPostal);

        // Methods
        direccion.nuevaDireccion(ciudad, calle, provincia, codigoPostal);
        direccion.nuevoNombre(nombre, primerApellido, segundoApellido);

        // Display the details of the direccion
        System.out.println("\nDetalles de la Dirección:");
        System.out.println(direccion);

        scanner.close();
    }
}

