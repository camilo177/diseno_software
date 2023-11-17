package peajePkg;

public class Carro extends Vehiculo {

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public double calcularPrecio() {
        return 10000;
    }

    @Override
    public String toString() {
        return "Carro placa='" + getPlaca() + "'";
    }
}
