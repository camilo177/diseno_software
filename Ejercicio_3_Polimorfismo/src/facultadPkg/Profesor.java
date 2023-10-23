package facultadPkg;

public class Profesor extends Empleado{
    private String departamento;

    public Profesor(String nombre, String apellido, double ID, String estadoCivil, int anoIncorporacion, double numeroDespacho, String departamento) {
        super(nombre, apellido, ID, estadoCivil, anoIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    //Getters y setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", ID=" + getID() +
                ", estadoCivil='" + getEstadoCivil() + '\'' +
                ", anoIncorporacion=" + getAnoIncorporacion() +
                ", numeroDespacho=" + getNumeroDespacho() +
                ", departamento='" + departamento + '\'' +
                '}';
    }

    //Cambio departamento
    public void cambioDepartamento(String nuevoDepartamento){
        this.departamento = nuevoDepartamento;
    }
}
