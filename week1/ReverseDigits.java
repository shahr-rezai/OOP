import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int reverse = 0;
        int sign = 1;

        // handle negative numbers
        if (n < 0) {
            sign = -1;
            n = -n; // work with positive only
        }

        // reverse digits
        while (n != 0) {
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }

        // apply the sign back
        reverse *= sign;

        System.out.println("Reversed number: " + reverse);

        input.close();
    }
}
