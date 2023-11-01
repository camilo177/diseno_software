package botesPkg;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Velero velero = new Velero("V123", 12, 2020, 3);
        Date fechaInicial = new Date(2014, 2, 11);
        Date fechaFinal = new Date(2014, 2, 15);

        Usuario usuario = new Usuario("Cliente1", "DNI123", fechaInicial, fechaFinal, 1, velero);
        double costoAlquiler = usuario.calcularCostoAlquiler();
        System.out.println("El costo del alquiler es: " + costoAlquiler );
        System.out.println("El modulo del velero es: " + velero.calcularModulo());
    }
}

