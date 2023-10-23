package polimorfismoPkg;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("abc123", -120);
        Coche coche = new Coche(vehiculo.getMatricula(), vehiculo.getVelocidad(), 4);
        Remolque remolque = new Remolque(1200);
        Camion camion = new Camion("abd123", 210, remolque);
        camion.ponerRemolque(remolque);

        System.out.println("Coche: " + coche.acelerar(coche.getVelocidad()));
        System.out.println(coche);
        System.out.println("/////////////////////////////////////////////////////////////////////////////");
        System.out.println("Camion: " + camion.acelerar(camion.getVelocidad()));
        System.out.println(camion);
    }
}
