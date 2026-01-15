import java.util.Scanner;

public class Numberpattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {          // each row
            for (int j = 1; j <= i; j++) {      // numbers in the row
                System.out.print(j + " ");
            }
            System.out.println();                // move to next row
        }

        input.close();
    }
}
