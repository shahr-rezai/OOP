import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                sumEven += i;
            else
                sumOdd += i;
        }

        System.out.println("Sum of odd numbers = " + sumOdd);
        System.out.println("Sum of even numbers = " + sumEven);

        input.close();
    }
}

