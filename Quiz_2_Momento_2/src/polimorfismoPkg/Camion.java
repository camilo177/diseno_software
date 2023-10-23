package polimorfismoPkg;

public class Camion extends Vehiculo{

    private Remolque remolque = new Remolque();

    //Constructor

    public Camion(String matricula, double velocidad, Remolque remolque) {
        super(matricula, velocidad);
        this.remolque = null;
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

    public void ponerRemolque(Remolque remolque){
        this.remolque = remolque;
    }

    public void quitarRemolque(Remolque remolque){
        this.remolque = null;
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
        if(this.remolque != null){
            if(this.getVelocidad()+velocidad > 100){
                System.out.println("Va demasiado rápido");
            }
        }
        super.acelerar(velocidad);
        return "Camion acelerando a: " + super.acelerar(velocidad);
    }
}
