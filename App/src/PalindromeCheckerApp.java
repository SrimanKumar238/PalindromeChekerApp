import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }

        scanner.close();
    }

    // Recursive method
    public static boolean isPalindrome(String str) {

        // Base case
        if (str.length() <= 1) {
            return true;
        }

        // Compare first and last character
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursive call (remove first and last character)
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}