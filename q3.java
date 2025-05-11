public class q3 {
    private double balance;


    public q3() {
        balance = 0.0;
    }


    public q3(double initialBalance) {
        if (initialBalance >= 0)
            balance = initialBalance;
        else
            balance = 0.0;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
