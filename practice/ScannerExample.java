package practice;
import java.util.Scanner;
public class ScannerExample{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    
    int number = in.nextInt();
    double cgpa = in.nextDouble();
    String name= in.next();
    String moreName= in.nextLine();

    System.out.println(number + " " + cgpa + " " + name + " ?" + moreName);

    in.close();
  
  }
}