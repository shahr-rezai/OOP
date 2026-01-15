import java.util.Scanner;

public class Palindrom {

    static boolean checkPalindrom(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "");

        if (checkPalindrom(cleaned)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        in.close();
    }
}

