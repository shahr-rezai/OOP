package practice;
import java.util.Scanner;
public class MonthsPractice{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = input.nextInt();

    switch(number){
      case 1: System.out.println("January");
      break;
      case 2: System.out.println("Feb");
      break;
      case 3: System.out.println("March");
      case 4: System.out.println("Shahr Bano");
      case 5: System.out.println("Kabul");
      default: System.out.println("N/A");
    }
    input.close();
  }
}