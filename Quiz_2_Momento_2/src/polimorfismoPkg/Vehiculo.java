package polimorfismoPkg;

public class Vehiculo {
    private String matricula;
    private double velocidad;

    //Constructor
    public Vehiculo() {
    }

    public Vehiculo(String matricula, double velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    //Getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    //Method
    public String acelerar(double velocidad) {
        if (velocidad > 0) {
            return "Estoy acelerando a " + velocidad;
        } else{
            return "Error";
        }
    };
}
