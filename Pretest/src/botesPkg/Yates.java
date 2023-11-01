package botesPkg;

import java.util.Date;

public class Yates extends Barco {
    private int potenciaCV;
    private int numeroCamarotes;

    public Yates(String matricula, double eslora, int anioFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public Yates(String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
    }

    @Override
    public double calcularModulo() {
        // Implementa el cálculo del módulo para yates de lujo
        return super.calcularModulo() + potenciaCV + numeroCamarotes;
    }
}