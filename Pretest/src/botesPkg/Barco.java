package botesPkg;

public  class Barco {
    private String matricula;
    private double eslora;
    private int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public double calcularModulo() {
        // Implementa el cálculo del módulo para barcos comunes
        return eslora * 10 + 1200;
    }
}
