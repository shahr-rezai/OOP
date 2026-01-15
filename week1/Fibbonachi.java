import java.util.Scanner;

public class Fibbonachi {
    public static void main(String[] args) {
        int firstNum = 1;
        int secondNum = 1;
        int thirdNum;

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                System.out.println(firstNum);
            } else if (i == 2) {
                System.out.println(secondNum);
            } else {
                thirdNum = firstNum + secondNum;
                System.out.println(thirdNum);
                firstNum = secondNum;
                secondNum = thirdNum;
            }
        }

        in.close();
    }
}
