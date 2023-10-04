package polimorfismoPkg;

public class Camion extends Vehiculo{

    private Remolque remolque = new Remolque();

    //Constructor

    public Camion(String matricula, double velocidad, Remolque remolque) {
        super(matricula, velocidad);
        this.remolque = remolque;
    }

    public Camion(String matricula, double velocidad) {
        super(matricula, velocidad);
    }

    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + getMatricula() + '\'' +
                ", velocidad=" + getVelocidad() +
                ", remolque=" + remolque +
                '}';
    }

    @Override
    public String acelerar(double velocidad) {
        return "El camion acelera a: " + super.acelerar(velocidad);
    }
}
