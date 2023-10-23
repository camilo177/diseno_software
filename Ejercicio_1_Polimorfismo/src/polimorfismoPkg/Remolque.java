package polimorfismoPkg;

public class Remolque {
    private double peso;

    //Constructor
    public Remolque() {
    }

    public Remolque(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "Remolque{" +
                "peso=" + peso +
                '}';
    }
}
