import java.util.Scanner;

public class PrimeCheck {

    // method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;           // 0 and 1 are not prime
        if (n <= 3) return true;            // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return false; // divisible by 2 or 3

        // check for divisors from 5 onwards, skipping multiples of 2 and 3
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // print result
        if (isPrime(num)) 
            System.out.println(num + " is prime");
        else 
            System.out.println(num + " is not prime");

        in.close();
    }
}
