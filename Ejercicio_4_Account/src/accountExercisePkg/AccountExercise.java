package accountExercisePkg;

public class AccountExercise {
    public AccountExercise(){
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setId("001");
        account1.setName("Daniel");
        account1.credit(1000);

        Account account2 = new Account();
        account2.setId("002");
        account2.setName("Paula");
        account2.credit(500);


        // Transactions
        account1.debit(200);
        account2.credit(300);
        account1.transferTo(00312, 150);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
