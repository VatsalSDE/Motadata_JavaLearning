abstract class BankAccount {

    private int acctnumber;
    private String holdername;
    private double balance;

    BankAccount(int anum,
            String name,
            double balance) {

        this.acctnumber = anum;
        this.holdername = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    abstract void withdraw(double amt);
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int a,
            String n,
            double b) {

        super(a, n, b);
    }

    @Override
    void withdraw(double amt) {

        double bal = getBalance();

        if (bal - amt >= 1000) {
            setBalance(bal - amt);
        } else {
            System.out.println(
                    "Minimum balance violation");
        }
    }
}

class currentAcct extends BankAccount {
    private int acctnumber;
    private String holdername;
    private double balance;

    currentAcct(int anum, String name, double b) {
        super(anum, name, b);
    }

    @Override
    void withdraw(double amt) {
        if ((balance + 5000 - amt) > 1000) {
            balance -= amt;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

}

public class Bank {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount(1, "Vatsal", 100);
    }
}
