package exam;

public class BankApp {
  public static void main(String[] args) {
    SavingAccounts account = new SavingAccounts("2323", 2000);
    account.displayInfo();
    account.deposit(500);
    account.deposit(1000, 100);
    account.withdraw(300);
    account.displayInfo();
  }
}
