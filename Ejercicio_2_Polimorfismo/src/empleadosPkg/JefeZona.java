package empleadosPkg;
import java.util.Arrays;

public class JefeZona extends Empleado{
    private String despacho;
    private Secretario secretario;
    private Vendedor[] listaVendedores;
    private Coche coche;

    //Constructor
    public JefeZona(String nombre, String apellido, int DNI, String direccion, int telefono, double salario, String despacho, Secretario secretario, Vendedor[] listaVendedores, Coche coche) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.listaVendedores = listaVendedores;
        this.coche = coche;
    }

    //Getters y setters

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Vendedor[] getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(Vendedor[] listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    //Métodos
    @Override
    public String toString() {
        return "JefeZona{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", DNI=" + getDNI() +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono=" + getTelefono() +
                ", salario=" + getSalario() +
                ", despacho='" + despacho + '\'' +
                ", secretario=" + secretario +
                ", listaVendedores=" + Arrays.toString(listaVendedores) +
                ", coche=" + coche +
                '}';
    }

    @Override
    public void incrementarSalario() {
        double aumentoAnual = getSalario() * 0.2;

        // Incrementar salario
        setSalario(getSalario() + aumentoAnual);
    }

    //Cambiar secretario
    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }
    //Cambiar coche
    public void cambiarCoche(Coche nuevoCoche) {
        this.coche = nuevoCoche;
    }
    //Nuevo vendedor
    public void darDeAltaVendedor(Vendedor nuevoVendedor) {
        if (listaVendedores == null) {
            listaVendedores = new Vendedor[1];
        } else {
            listaVendedores = Arrays.copyOf(listaVendedores, listaVendedores.length + 1);
        }
        listaVendedores[listaVendedores.length - 1] = nuevoVendedor;
    }
    //Quitar vendedor
    public void darDeBajaVendedor(Vendedor vendedor) {
        if (listaVendedores == null || listaVendedores.length == 0) {
            return; // No Vendedores to remove
        }

        int indexToRemove = -1;
        for (int i = 0; i < listaVendedores.length; i++) {
            if (listaVendedores[i].equals(vendedor)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            if (listaVendedores.length == 1) {
                listaVendedores = null; // Remove the last Vendedor
            } else {
                Vendedor[] newListaVendedores = new Vendedor[listaVendedores.length - 1];
                if (indexToRemove > 0) {
                    System.arraycopy(listaVendedores, 0, newListaVendedores, 0, indexToRemove);
                }
                if (indexToRemove < listaVendedores.length - 1) {
                    System.arraycopy(listaVendedores, indexToRemove + 1, newListaVendedores, indexToRemove, listaVendedores.length - indexToRemove - 1);
                }
                listaVendedores = newListaVendedores;
            }
        }
    }
}
