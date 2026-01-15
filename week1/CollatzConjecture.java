import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        long n = input.nextLong(); // input number

        int steps = 0;

        while (true) {
            System.out.print(n + " "); // print current number
            steps++;

            if (n == 1) break; // stop when n reaches 1

            if (n % 2 == 0)
                n = n / 2;     // even
            else
                n = 3 * n + 1; // odd
        }

        System.out.println("\nSteps = " + steps);
        input.close();
    }
}
