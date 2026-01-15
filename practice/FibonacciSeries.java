package practice;
import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter how many terms: ");
    int n = in.nextInt();

    int first = 0, second = 1, fibo;

    System.out.print("Fibonacci Series: " + first + " " + second);

    for (int i = 3; i <= n; i++) {
      fibo = first + second;
      System.out.print(" " + fibo);
      first = second;
      second = fibo;
    }
  }
}
