package week2;
import java.util.Scanner;
public class Test{
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the amount: ");
    int amount = input.nextInt();
    
    BankAccountP obj1= new BankAccountP("Ahmed", 2000);

    obj1.withdraw(amount);
    obj1.deposit(amount);

    input.close();
  }
}