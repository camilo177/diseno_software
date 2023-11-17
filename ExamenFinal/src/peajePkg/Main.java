package peajePkg;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File fichero = new File("fichero.txt");
        EstacionPeaje estacionPeaje = new EstacionPeaje("Estación el Dorado", "Nariño");
        Camion camion = new Camion("DLV222", 2);
        Camion camion1 = new Camion("FAFASF", -1);
        Moto moto = new Moto("DVV233", 150);
        Moto moto1 = new Moto("FAF", -1);
        Carro carro = new Carro("FLV234");

        System.out.println(moto1.calcularPrecio());
        System.out.println(camion1.calcularPrecio());

        System.out.println("Peaje " + estacionPeaje);
        System.out.println("=======================================================================");

        System.out.println("Peaje para: " + carro);
        estacionPeaje.calcularValor(carro);
        System.out.println("=======================================================================");
        System.out.println("Peaje para: " + moto);
        estacionPeaje.calcularValor(moto);
        System.out.println("=======================================================================");
        System.out.println("Peaje para: " + camion);
        estacionPeaje.calcularValor(camion);

        System.out.println("=======================================================================");
        System.out.println("Cierre del día: ");
        estacionPeaje.calcularTotal();
    }
}
