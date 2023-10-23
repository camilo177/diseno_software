package facultadPkg;

public class Persona {
    private String nombre;
    private String apellido;
    private double ID;
    private String estadoCivil;

    public Persona(String nombre, String apellido, double ID, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.estadoCivil = estadoCivil;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ID=" + ID +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }

    // Método para cambiar el estado civil
    public void cambioEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }
}
