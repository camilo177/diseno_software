package empleadosPkg;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Create instances of your classes
        Coche coche1 = new Coche("ABC123", "Toyota", "Fortuner");
        Cliente cliente1 = new Cliente("John Doe");
        Cliente cliente2 = new Cliente("Jane Smith");

        Vendedor vendedor1 = new Vendedor("John", "Doe", 1234, "Address1", 67890, 5000, coche1, "12345",
                "Area1", 0.05, new Cliente[]{cliente1, cliente2});

        Secretario secretario1 = new Secretario("John", "Smith", 5678, "Address2", 12345, 6000, "Despacho1", 12345);


        JefeZona jefeZona1 = new JefeZona("Andres", "Lopez", 1234, "Calle 12", 12345, 10000, "Despacho 1", secretario1,
                new Vendedor[]{vendedor1}, coche1);


        //Jefe de zona inicial
        System.out.println(jefeZona1);
        // Cambiar secretario
        Secretario newSecretario = new Secretario("Despacho3", 67890);
        jefeZona1.cambiarSecretario(newSecretario);


        // Cambiar coche
        Coche newCoche = new Coche("XYZ789", "Honda", "Civic");
        jefeZona1.cambiarCoche(newCoche);


        // Nuevo vendedor
        Vendedor newVendedor = new Vendedor(coche1, "67890", "Area2", 0.03, new Cliente[]{cliente2});
        jefeZona1.darDeAltaVendedor(newVendedor);


        // Quitar a Vendedor
        jefeZona1.darDeBajaVendedor(vendedor1);
        System.out.println("JefeZona con cambios:");
        System.out.println(jefeZona1);

        //Aumentar salario
        System.out.println("Salario inicial vendedor: " +vendedor1.getSalario());
        vendedor1.incrementarSalario();
        System.out.println("Salario final vendedor: " + vendedor1.getSalario());
        System.out.println("Salario inicial secretario: " +secretario1.getSalario());
        secretario1.incrementarSalario();
        System.out.println("Salario final secretario: " + secretario1.getSalario());
        System.out.println("Salario inicial jefe de zona: " +jefeZona1.getSalario());
        jefeZona1.incrementarSalario();
        System.out.println("Salario final jefe de zona: " + jefeZona1.getSalario());
    }
}
