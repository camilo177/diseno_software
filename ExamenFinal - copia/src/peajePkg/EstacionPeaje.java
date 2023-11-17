package peajePkg;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String departamento;
    private double valor;
    private List<Vehiculo> vehiculos = new ArrayList<>();


    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.valor = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void calcularValor(Vehiculo vehiculo) {
        double precioPeaje = vehiculo.calcularPrecio();
        valor = valor + precioPeaje;
        vehiculos.add(vehiculo);
        System.out.println("El precio del peaje para su vehículo es: " + vehiculo.calcularPrecio());
    }

    public void calcularTotal() {
        System.out.println("Listado de vehículos en la estación de peaje:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }
        System.out.println("Total de peajes recolectados: $" + valor);
    }
    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'';
    }
}
