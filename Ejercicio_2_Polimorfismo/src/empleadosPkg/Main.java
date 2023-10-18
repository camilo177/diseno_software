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


        System.out.println("Jefe Zona: ");
        System.out.println(jefeZona1);

        // Cambiar secretario
        Secretario newSecretario = new Secretario("Despacho3", 67890);
        jefeZona1.cambiarSecretario(newSecretario);
        System.out.println("JefeZona con nuevo secretario:");
        System.out.println(jefeZona1);

        // Cambiar coche
        Coche newCoche = new Coche("XYZ789", "Honda", "Civic");
        jefeZona1.cambiarCoche(newCoche);
        System.out.println("JefeZona con cambio de carro:");
        System.out.println(jefeZona1);

        // Nuevo vendedor
        Vendedor newVendedor = new Vendedor(coche1, "67890", "Area2", 0.03, new Cliente[]{cliente2});
        jefeZona1.darDeAltaVendedor(newVendedor);
        System.out.println("JefeZona con nuevo vendedor:");
        System.out.println(jefeZona1);

        // Quitar a Vendedor
        jefeZona1.darDeBajaVendedor(vendedor1);
        System.out.println("JefeZona sin vendedor:");
        System.out.println(jefeZona1);
    }
}
