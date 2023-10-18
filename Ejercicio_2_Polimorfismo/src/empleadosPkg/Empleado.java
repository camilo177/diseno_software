package empleadosPkg;

public class Empleado {
    private String nombre;
    private String apellido;
    private int DNI;
    private String direccion;
    private int anosAntiguedad;
    private int telefono;
    private double salario;
    private Empleado supervisor;

    //Constructor
    public Empleado()
    { }

    public Empleado(String nombre, String apellido, int DNI,
                    String direccion, int telefono, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnosAntiguedad() {
        return anosAntiguedad;
    }

    public void setAnosAntiguedad(int anosAntiguedad) {
        this.anosAntiguedad = anosAntiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    //to String
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI=" + DNI +
                ", direccion='" + direccion + '\'' +
                ", anosAntiguedad=" + anosAntiguedad +
                ", telefono=" + telefono +
                ", salario=" + salario +
                ", supervisor=" + supervisor +
                '}';
    }

    // Métodos
    public void cambiarSupervisor(Empleado nuevoSupervisor) {
        this.supervisor = nuevoSupervisor;
    }

    public void incrementarSalario(double aumentoPorcentaje) {
        if (aumentoPorcentaje > 0) {
            double aumento = salario * (aumentoPorcentaje / 100.0);
            salario += aumento;
        } else {
            System.out.println("El aumento porcentaje debe ser mayor que 0.");
        }
    }

}
