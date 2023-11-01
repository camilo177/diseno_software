package botesPkg;

import java.util.Date;

public class EmbarcacionDeportiva extends Barco {
    private int potenciaCV;

    public EmbarcacionDeportiva(String matricula, double eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }
}