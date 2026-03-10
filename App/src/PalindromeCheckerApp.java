import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker - Strategy Pattern");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        char[] characters = word.toLowerCase().toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println("Invalid choice");
            return;
        }

        scanner.close();
    }
}