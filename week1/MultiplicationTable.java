import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask the user to enter a number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // loop from 1 to 10 to print the table
        for (int i = 1; i <= 10; i++) {
            // print each line of the multiplication table
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        input.close(); // close the scanner
    }
}
