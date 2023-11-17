package peajePkg;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main {

    public static void main(String[] args) {
        String[] lineas = new String[8]; // Ajustar a número de vehículos

        // Código existente EstacionPeaje, Camion, Moto, Carro, etc.

        EstacionPeaje estacionPeaje = new EstacionPeaje("Estación el Dorado", "Nariño");
        Camion camion = new Camion("ABC212", 2);
        Moto moto = new Moto("CCC233", 150);
        Carro carro = new Carro("TTT234");

        // Almacenar el output en el array
        lineas[0] = "Peaje " + estacionPeaje;
        lineas[1] = "=======================================================================";
        lineas[2] = "Peaje para: " + carro;
        lineas[3] = "=======================================================================";
        lineas[4] = "Peaje para: " + moto;
        lineas[5] = "=======================================================================";
        lineas[6] = "Peaje para: " + camion;
        lineas[7] = "=======================================================================";

        // Usando la segunda forma de escritura con UTF-8
        try (Writer out = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream("fichero.txt"), "UTF-8"))) {

            // Escribimos linea a linea en el fichero
            for (String linea : lineas) {
                try {
                    out.write(linea + "\n");
                } catch (IOException ex) {
                    System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
                }
            }
        } catch (IOException ex2) {
            System.out.println("Mensaje error 2: " + ex2.getMessage());
        }
    }
}
