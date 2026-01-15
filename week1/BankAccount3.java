public class BankAccount3 {
    String accountNumber;
    double balance;

    BankAccount3(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("No specific interest calculation.");
    }

    void withdraw(double amount) {
        System.out.println("Withdrawal not defined for base account.");
    }

    void showBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}
