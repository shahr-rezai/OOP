public class CheckingAccount3 extends BankAccount3 {
    CheckingAccount3(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void calculateInterest() {
        System.out.println("No interest in the Checking Account.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Checking Account.");
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
    }
}
