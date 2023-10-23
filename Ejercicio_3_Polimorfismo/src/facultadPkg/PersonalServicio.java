package facultadPkg;

public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio(String nombre, String apellido, double ID, String estadoCivil, int anoIncorporacion, double numeroDespacho, String seccion) {
        super(nombre, apellido, ID, estadoCivil, anoIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    //Getters y setters

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalServicio{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", ID=" + getID() +
                ", estadoCivil='" + getEstadoCivil() + '\'' +
                ", anoIncorporacion=" + getAnoIncorporacion() +
                ", numeroDespacho=" + getNumeroDespacho() +
                ", seccion='" + seccion + '\'' +
                '}';
    }

    //Traslado sección
    public void trasladoSeccion(String nuevaSeccion){
        this.seccion = nuevaSeccion;
    }
}
