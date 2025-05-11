import java.util.Scanner;

public class q3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter initial balance (or 0 for default): ");
        double initialBalance = sc.nextDouble();
        q3 account = (initialBalance == 0) ? new q3() : new q3(initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayBalance();

        sc.close();
    }
}
