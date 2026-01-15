package week5;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Current: Deposited TK" + amount + ". Balance: TK" + getBalance() + ".");
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Current: Withdrew TK" + amount + ". Balance: TK" + getBalance() + ".");
        } else {
            System.out.println("Current: Exceeds overdraft limit.");
        }
    }
}
