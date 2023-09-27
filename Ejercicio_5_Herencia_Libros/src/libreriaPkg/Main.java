package libreriaPkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Libro
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Precio: ");
        double precioLibro = scanner.nextDouble();
        System.out.print("Número de Páginas: ");
        int numeroPaginas = scanner.nextInt();
        System.out.print("Año de Publicación: ");
        int anoPublicacionLibro = scanner.nextInt();

        Libro libro = new Libro(tituloLibro, precioLibro, numeroPaginas, anoPublicacionLibro);

        // Input for Disco
        System.out.println("\nIngrese los datos del disco:");
        scanner.nextLine();  // Consume the newline character
        System.out.print("Título: ");
        String tituloDisco = scanner.nextLine();
        System.out.print("Precio: ");
        double precioDisco = scanner.nextDouble();
        System.out.print("Duración en minutos: ");
        float duracionDisco = scanner.nextFloat();

        Disco disco = new Disco(tituloDisco, precioDisco, duracionDisco);

        // Display the information
        System.out.println("\nInformación del Libro:");
        System.out.println(libro);

        System.out.println("\nInformación del Disco:");
        System.out.println(disco);

        scanner.close();
    }
}


