package accountExercisePkg;

public class Account {
    private String id;
    private String name;
    private int balance;

    //Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Methods
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        balance = this.balance + amount;
        return  balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            balance = this.balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    //In this case there aren´t more accounts, thus, it only prints message (not operational)
    public int transferTo(int anotherAccount, int amount) {
        if (amount < this.balance){
            System.out.println("Money was transfered to: " + anotherAccount);
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
