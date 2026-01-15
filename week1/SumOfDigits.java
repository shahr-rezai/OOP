import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user for a number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int sum = 0;
        int sign = 1;

        // handle negative numbers
        if (n < 0) {
            sign = -1;
            n = -n;
        }

        // loop to add each digit
        while (n != 0) {
            sum += n % 10;  // take last digit and add
            n /= 10;        // remove last digit
        }

        // apply sign if needed (though usually sum is positive)
        sum *= sign;

        // print result
        System.out.println("Sum of digits: " + sum);

        input.close();
    }
}
