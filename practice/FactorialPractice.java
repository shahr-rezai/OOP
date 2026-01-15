package practice;
import java.util.Scanner;
public class FactorialPractice{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int number = input.nextInt();
    int fact = 1;

    for(int i=1; i<=number; i++){

      fact=fact*i;

    }
    System.out.println("Factorial of "+number+ " is "+ fact);
    input.close();
  }
}