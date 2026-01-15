package week5;
abstract class BankAccount implements AccountOperations{
  private String accountNumber;
  private double balance;

  BankAccount(String accountNumber, double initialBalance){
    this.accountNumber=accountNumber;
    this.balance=initialBalance;
  }
  public String getAccountNumber(){
    return accountNumber;
  }
  @Override
  public double getBalance(){
    return balance;
  }
  public void setBalance(double balance){
    this.balance=balance;
  }

  @Override
  public abstract void deposit(double amount);
  

  @Override
  public abstract void withdraw(double amount);
}
