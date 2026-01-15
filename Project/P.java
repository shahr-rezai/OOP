import java.util.Scanner;

public class P {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        try {
            System.out.print("Enter a: ");
            a = sc.nextDouble();

            System.out.print("Enter b: ");
            b = sc.nextDouble();

            System.out.print("Enter c: ");
            c = sc.nextDouble();

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
            return; // stop program if input is wrong
        }

        double discriminant = (b * b) - (4 * a * c);

        if (a == 0) {
            System.out.println("a cannot be zero. This is not a quadratic equation.");
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("One real root:");
            System.out.println("x = " + x);
        } else {
            System.out.println("No real roots (discriminant is negative).");
        }
    }
}
