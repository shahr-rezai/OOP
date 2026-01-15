package week2;
public class BankAccountP{

  private String accountHolder;
  private double balance;

  BankAccountP(String accountHolder, double balance){
    this.accountHolder = accountHolder;
    this.balance = balance;

  }
  public String getAccountHolder(){
    return accountHolder;
  }
  public void setAccountHolder(String accountHolder){
    this.accountHolder=accountHolder;

  }

  public double getBalance(){
    return balance;
  }
  public void setBalance(double balance){
    this.balance=balance;
  }

  public void withdraw(double amount){
      if (balance>=amount){
        balance=balance-amount;
        System.out.println("Successful withdrawal.");
        System.out.println("Your balance is "+balance+ " dallars.");
      }
      else{
      System.out.println("Insufficient Balance.");}


  }
  public void deposit(double amount){
    if(amount>0){
      balance=balance+amount;
      System.out.println("Your deposit is successful.");
      System.out.println("The balance for the account holder "+accountHolder+" is "+balance+" dallars.");
    }
    else{
      System.out.println("Insufficient Amount.");

    }
  }

}