package gatoPkg;
public class Main {
        public static void main(String[]args) {
            Gato miGato=new Gato();
            miGato.setNombre("Jefferson");

            System.out.println("Gato maullando: ");
            miGato.maullar();
            miGato.dormir(2);
            miGato.correr("el estadio");
            miGato.comer("Raton");

            System.out.println("El nombre del gato es: " + miGato.getNombre());

        }
}

