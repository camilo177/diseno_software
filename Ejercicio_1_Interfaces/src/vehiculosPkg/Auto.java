package vehiculosPkg;

public class Auto implements IVehiculo {
    private int cantGasolina;

    public Auto() {
    }

    public Auto(int cantGasolina) {
        this.cantGasolina = cantGasolina;
    }

    //Getters and setters
    public int getCantGasolina() {
        return cantGasolina;
    }

    public void setCantGasolina(int cantGasolina) {
        this.cantGasolina = cantGasolina;
    }

    //Implementación de métodos
    @Override
    public void conducir() {
        System.out.println("Conduciendo un auto");
    }

    @Override
    public boolean retanquear(int cantidad) {
        if (cantidad > 0) {
            int totalGasolina = this.cantGasolina + cantidad;

            if (totalGasolina <= 20) {
                this.cantGasolina = totalGasolina;
                System.out.println("Retanqueando: " + cantidad + " galones");
                System.out.println("Cantidad total de gasolina: " + getCantGasolina() + " galones");
                return true;
            } else if (cantidad > 20) {
                System.out.println("Demasiados galones, capacidad insuficiente");
                return false;
            } else {
                System.out.println("No es posible retanquear");
                return false;
            }
        } else {
            System.out.println("No es posible retanquear");
            return false;
        }
    }
}

