import java.util.Scanner;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to linked list
        for (char ch : word.toCharArray()) {
            list.add(ch);
        }

        boolean isPalindrome = true;

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }

        scanner.close();
    }
}