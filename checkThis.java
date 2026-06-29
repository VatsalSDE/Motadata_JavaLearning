class Account{
    String owner;

    void print(){
        System.out.println(this);
    }

    int balance = 100;

    void deposit() {
        this.balance += 50;
    }
}

public class checkThis{
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();


        a1.deposit();
        a1.deposit();
        a2.deposit();
        a1.deposit();

        System.out.println("The balance of the account one is "+a1.balance);
        System.out.println("The balance of the account two is "+a2.balance);
    }
}