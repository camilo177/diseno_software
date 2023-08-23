package accountExercisePkg;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(){
        //Constructor
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
        balance = balance + amount;
        return  balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(int anotherAccount, int amount) {
        if (amount < balance){
            System.out.println("Money was transfered to: " + anotherAccount);
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString(){
        return "ID: " + getId() + ", name: " + getName() + ", balance: "
                + getBalance();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
