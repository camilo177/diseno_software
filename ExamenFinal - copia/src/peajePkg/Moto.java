package peajePkg;

public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPrecio() {
        if (cilindraje > 0 && cilindraje < 200) {
            return 5000;
        }
        else if (cilindraje > 200){
            return 7000;
        }
        else{
            System.out.println("Cilindraje Inválido");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Moto placa='" + getPlaca() + "', cilindraje=" + cilindraje + "";
    }
}
