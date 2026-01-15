import java.util.Scanner;

public class OddEvenSum2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: "); // prompt user
        System.out.flush();

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int totalSum = num * (num + 1) / 2; // sum of all numbers from 1 to num
        int k = num / 2;                    
        int sumEven = k * (k + 1);          // sum of all even numbers
        int sumOdd = totalSum - sumEven;    // sum of all odd numbers

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        in.close();
    }
}
