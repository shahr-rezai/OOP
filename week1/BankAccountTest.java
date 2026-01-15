import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        BankAccount account1 = new BankAccount("123456", "Ali", 1000);
        BankAccount account2 = new BankAccount("654321", "Sara", 2000);

        
        System.out.print("Enter amount to deposit into first account: $");
        double deposit1 = sc.nextDouble();
        account1.deposit(deposit1);

        System.out.print("Enter amount to deposit into second account: $");
        double deposit2 = sc.nextDouble();
        account2.deposit(deposit2);

       
        System.out.print("Enter amount to withdraw from first account: $");
        double withdraw1 = sc.nextDouble();
        account1.withdraw(withdraw1);

        System.out.print("Enter amount to withdraw from second account: $");
        double withdraw2 = sc.nextDouble();
        account2.withdraw(withdraw2);

        
        System.out.println("\nFinal Account Details:");
        account1.displayAccount();
        account2.displayAccount();

        sc.close();
    }
}
