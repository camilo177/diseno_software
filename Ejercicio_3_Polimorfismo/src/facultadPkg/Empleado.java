package facultadPkg;

public class Empleado extends Persona{
    private int anoIncorporacion;
    private double numeroDespacho;

    public Empleado(String nombre, String apellido, double ID, String estadoCivil, int anoIncorporacion, double numeroDespacho) {
        super(nombre, apellido, ID, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    //Getters y setters

    public int getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public void setAnoIncorporacion(int anoIncorporacion) {
        this.anoIncorporacion = anoIncorporacion;
    }

    public double getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(double numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", ID=" + getID() +
                ", estadoCivil='" + getEstadoCivil() + '\'' +
                ", anoIncorporacion=" + anoIncorporacion +
                ", numeroDespacho=" + numeroDespacho +
                '}';
    }

    //Metodo para reasignación de despacho
    public void reasignacionDespacho(double nuevoNumeroDespacho) {
        this.numeroDespacho = nuevoNumeroDespacho;
    }
}
