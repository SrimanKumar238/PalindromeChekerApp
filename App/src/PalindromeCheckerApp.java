public interface PalindromeStrategy {
    boolean isPalindrome(String input);
}
public class ReversePalindromeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
import java.util.Stack;

public class StackPalindromeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
public class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.isPalindrome(input);
    }
}
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker App");
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Choose strategy
        PalindromeStrategy strategy = new ReversePalindromeStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }

        scanner.close();
    }
}