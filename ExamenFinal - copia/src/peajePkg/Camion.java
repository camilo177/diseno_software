package peajePkg;

public class Camion extends Vehiculo{
    private int ejes;

    public Camion(String placa, int ejes) {
        super(placa);
        this.ejes = ejes;
    }

    @Override
    public double calcularPrecio() {
        if (ejes > 0) {
            return ejes * 5000;
        }
        else{
            System.out.println("Error en número de ejes");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Camion placa='" + getPlaca() + "', ejes=" + ejes + "";
    }
}
