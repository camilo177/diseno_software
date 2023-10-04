package polimorfismoPkg;

public class Coche extends Vehiculo {
    private int numPuertas;

    //Constructor
    public Coche(String matricula, double velocidad, int numPuertas) {
        super(matricula, velocidad);
        this.numPuertas = numPuertas;
    }

    //Getters and setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + getMatricula() + '\'' +
                ", velocidad=" + getVelocidad() +
                ", numPuertas=" + numPuertas +
                '}';
    }

    @Override
    public String acelerar(double velocidad) {
        return "El coche acelera a: " + super.acelerar(velocidad);
    }
}
