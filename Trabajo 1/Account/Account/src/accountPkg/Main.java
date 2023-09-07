package accountPkg;

public class Main {
    public Main(){
    }

    public static void main(String[] args) {
        Account account1 = new Account("Daniela", 1000);

        // Información
        System.out.println(account1);

        // Depóstio $500 en account 1
        account1.ingresar(500);

        //Info Actualizada
        System.out.println(account1);

        // Retirar $200 de account 1
        account1.retirar(200);

        // Información
        System.out.println(account1);

        // Montos ilegales
        account1.retirar(1600);
        System.out.println(account1);
        account1.ingresar(-100);
        System.out.println(account1);
    }
}
