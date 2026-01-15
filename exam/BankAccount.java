package exam;

enum AccountType {
  SAVING, CURRENT, FIXED
}

public class BankAccount {
  private String accountNumber;
  private double balance;

  BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit is done.");
    } else {
      System.out.println("The amount is not suitable for deposit.");
    }
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      System.out.println("Withdraw is successful.");
    } else {
      System.out.println("Not sufficient balance.");
    }
  }

  public void displayInfo() {
    System.out.println("Balance for the account number: " + accountNumber + " is " + balance);
  }
}
