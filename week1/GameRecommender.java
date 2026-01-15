import java.util.Scanner;

public class GameRecommender {
    public static void main(String[] args) {
        System.out.println("Choose your favorite game genre: 1: Action 2: Comedy");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num == 1) {
            System.out.println("Grand Theft Auto");
        } else if (num == 2) {
            System.out.println("Mr. Bean");
        } else {
            System.out.println("Invalid Input");
        }

        in.close();
    }
}
