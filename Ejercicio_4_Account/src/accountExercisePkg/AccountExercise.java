package accountExercisePkg;

public class AccountExercise {
    public AccountExercise(){
    }

    public static void main(String[] args) {
        Account account1 = new Account("10", "Daniel", 120000);
        account1.getName();
        account1.getId();
        account1.credit(1000);
        account1.debit(200);
        account1.transferTo(202, 1500);
        account1.transferTo(10, 12020);

        System.out.println(account1);
    }
}
