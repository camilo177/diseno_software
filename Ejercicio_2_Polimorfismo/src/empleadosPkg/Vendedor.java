package empleadosPkg;
import java.util.Arrays;

public class Vendedor extends Empleado{
    private Coche coche;
    private String movil;
    private String areaVenta;
    private double comision;
    private Cliente[] listaClientes;

    //Constructor
    public Vendedor(Coche coche, String movil, String areaVenta, double comision, Cliente[] listaClientes) {
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.comision = comision;
        this.listaClientes = listaClientes;
    }

    public Vendedor(String nombre, String apellido, int DNI, String direccion, int telefono, double salario, Coche coche, String movil, String areaVenta, double comision, Cliente[] listaClientes) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.comision = comision;
        this.listaClientes = listaClientes;
    }

    //Métodos
    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", DNI=" + getDNI() +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono=" + getTelefono() +
                ", salario=" + getSalario() +
                ", coche=" + coche +
                ", movil='" + movil + '\'' +
                ", areaVenta='" + areaVenta + '\'' +
                ", comision=" + comision +
                ", listaClientes=" + Arrays.toString(listaClientes) +
                '}';
    }

    @Override
    public void incrementarSalario() {
        double aumentoAnual = getSalario() * 0.1;

        // Incrementar salario
        setSalario(getSalario() + aumentoAnual);
    }


    // Añadir cliente
    public void darDeAltaCliente(Cliente cliente) {
        if (listaClientes == null) {
            listaClientes = new Cliente[1];
        } else {
            Cliente[] newListaClientes = new Cliente[listaClientes.length + 1];
            System.arraycopy(listaClientes, 0, newListaClientes, 0, listaClientes.length);
            listaClientes = newListaClientes;
        }
        listaClientes[listaClientes.length - 1] = cliente;
    }


    // Quitar cliente
    public void darDeBajaCliente(Cliente cliente) {
        if (listaClientes == null || listaClientes.length == 0) {
            return; // No clients to remove
        }

        int indexToRemove = -1;
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i].equals(cliente)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            if (listaClientes.length == 1) {
                listaClientes = null; // Remove the last client
            } else {
                Cliente[] newListaClientes = new Cliente[listaClientes.length - 1];
                if (indexToRemove > 0) {
                    System.arraycopy(listaClientes, 0, newListaClientes, 0, indexToRemove);
                }
                if (indexToRemove < listaClientes.length - 1) {
                    System.arraycopy(listaClientes, indexToRemove + 1, newListaClientes, indexToRemove, listaClientes.length - indexToRemove - 1);
                }
                listaClientes = newListaClientes;
            }
        }
    }

    // Cambiar carro
    public void cambiarCoche(Coche nuevoCoche) {
        coche = nuevoCoche;
    }
}

