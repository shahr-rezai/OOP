package exam;

public class SavingAccounts extends BankAccount {
  private AccountType type = AccountType.SAVING;

  SavingAccounts(String accountNumber, double balance) {
    super(accountNumber, balance);
  }

  public void deposit(double amount, double bonus) {
    setBalance(getBalance() + amount + bonus);
    System.out.println("Deposit successful.");
  }

  @Override
  public void displayInfo() {
    System.out.println("Balance for the account number: " + getAccountNumber() + " is " + getBalance() + " and account type is " + type);
  }
}
