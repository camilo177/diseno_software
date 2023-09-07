package accountPkg;

public class AccountExercise {
    public AccountExercise(){
    }

    public static void main(String[] args) {
        //Instancia de Account
        Account account1 = new Account("001", "Daniel", 100);
        Account account2 = new Account("002","Paula",200);


        // Transacciones
        account1.debit(100);
        account2.credit(300);
        account1.credit(-800);
        account2.transferTo("006xy", 150);

        System.out.println(account1);
        System.out.println(account2);
    }
}
