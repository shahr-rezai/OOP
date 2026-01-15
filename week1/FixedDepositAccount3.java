public class FixedDepositAccount3 extends BankAccount3 {
    FixedDepositAccount3(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.08;
        balance += interest;
        System.out.println("Fixed Deposit Interest Added: $" + interest);
    }

    void withdraw(double amount) {
        System.out.println("Cannot withdraw before maturity.");
    }
}
