package week5;

public class SavingAccount extends BankAccount {
    private double interestRate;

    SavingAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Savings: Deposited TK" + amount + ". Balance: TK" + getBalance() + ".");
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Savings: Withdrew TK" + amount + ". Balance: TK" + getBalance() + ".");
        } else {
            System.out.println("Savings: Insufficient funds for withdrawal.");
        }
    }

    public void applyInterest() {
        double newBalance = getBalance() + getBalance() * (interestRate / 100);
        setBalance(newBalance);
        System.out.println("Savings: Interest applied. Balance: TK" + getBalance() + ".");
    }
}
