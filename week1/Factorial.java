import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask the user for a number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // factorial starts from 1 (because multiplying by 0 would always give 0)
        long fact = 1;

        // loop from 1 to n and multiply each number
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        // print the result
        System.out.println("Factorial of " + n + " is: " + fact);

        input.close(); // close scanner
    }
}
