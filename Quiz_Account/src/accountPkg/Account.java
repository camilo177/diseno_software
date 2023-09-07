package accountPkg;

public class Account {
    private String id;
    private String name;
    private int balance;

    //Constructor
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //Constructor 2
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance = balance + amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(String id, int amount) {
        if (amount <= this.balance){
            this.balance = balance - amount;
            System.out.println("Money was transfered to: " + id);
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public String toString(){
        return "ID: " + getId() + ", name: " + getName() + ", balance: "
                + getBalance();
    }
}
