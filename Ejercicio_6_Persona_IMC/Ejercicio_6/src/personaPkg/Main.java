package personaPkg;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese sexo (H para hombre, M para mujer): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingrese peso (en kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese altura (en metros): ");
        double altura = scanner.nextDouble();

        // Crear objetos de la clase Persona
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        // Comprobar el estado de peso e indicar si es mayor de edad para cada objeto
        int estadoPeso1 = persona1.calcularIMC();
        boolean mayorEdad1 = persona1.esMayorDeEdad();


        // Mostrar la información de cada objeto
        System.out.println("\nInformación de la Persona 1:");
        System.out.println(persona1.toString());
        mostrarEstadoPeso(estadoPeso1);
        mostrarMayorEdad(mayorEdad1);

    }

    // Método para mostrar el estado de peso
    private static void mostrarEstadoPeso(int estadoPeso) {
        switch (estadoPeso) {
            case -1:
                System.out.println("Está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("Está en su peso ideal.");
                break;
            case 1:
                System.out.println("Tiene sobrepeso.");
                break;
            default:
                System.out.println("Estado de peso desconocido.");
        }
    }

    // Método para mostrar si es mayor de edad
    private static void mostrarMayorEdad(boolean mayorEdad) {
        if (mayorEdad) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }
}


