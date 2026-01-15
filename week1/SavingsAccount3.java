public class SavingsAccount3 extends BankAccount3 {
    SavingsAccount3(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.04;
        balance += interest;
        System.out.println("Savings Interest Added: $" + interest);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}
