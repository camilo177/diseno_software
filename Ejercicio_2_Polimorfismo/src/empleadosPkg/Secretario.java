package empleadosPkg;

public class Secretario extends Empleado {
    private String despacho;
    private int numeroFax;

    //Constructor
    public Secretario() {
        super();
    }
    public Secretario(String despacho, int numeroFax) {
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    public Secretario(String nombre, String apellido, int DNI, String direccion, int telefono, double salario, String despacho, int numeroFax) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    //Getters y setters
    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getNumeroFax() {
        return numeroFax;
    }

    public void setNumeroFax(int numeroFax) {
        this.numeroFax = numeroFax;
    }

    //Métodos
    @Override
    public String toString() {
        return "Secretario{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", DNI=" + getDNI() +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono=" + getTelefono() +
                ", salario=" + getSalario() +
                ", despacho='" + despacho + '\'' +
                ", numeroFax=" + numeroFax +
                '}';
    }


    @Override
    public void incrementarSalario() {
      double aumentoAnual = getSalario() * 0.05;

        // Incrementar salario
        setSalario(getSalario() + aumentoAnual);
    }

}
