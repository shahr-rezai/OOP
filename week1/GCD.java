import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        // make copies to work with
        int x = a;
        int y = b;

        // loop to find GCD using Euclidean method
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("GCD = " + x);
        input.close();
    }
}
