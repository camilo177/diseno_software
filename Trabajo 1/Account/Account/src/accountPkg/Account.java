package accountPkg;

public class Account {
    private String titular;
    private double cantidad;

    //Constructors
    public Account(String titular) {
        this.titular = titular;
    }
    public Account(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    //Methods
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Account{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    // Método para ingresar una cantidad a la cuenta (si es positiva)
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        }
        else{
            throw new IllegalArgumentException("Cantidad inválida");
        }
    }

    // Método para retirar una cantidad de la cuenta (si es positiva y no supera el saldo)
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad = this.cantidad - cantidad;
        } else if (cantidad > 0 && cantidad > this.cantidad ) {
            this.cantidad = 0;
        }
        else{
            throw new IllegalArgumentException("Cantidad inválida");
        }
    }
}
