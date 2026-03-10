import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Performance Comparison");
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Reverse Strategy
        PalindromeStrategy reverseStrategy = new ReversePalindromeStrategy();
        long start1 = System.nanoTime();
        boolean result1 = reverseStrategy.isPalindrome(input);
        long end1 = System.nanoTime();

        // Stack Strategy
        PalindromeStrategy stackStrategy = new StackPalindromeStrategy();
        long start2 = System.nanoTime();
        boolean result2 = stackStrategy.isPalindrome(input);
        long end2 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Reverse Strategy Result: " + result1);
        System.out.println("Time taken: " + (end1 - start1) + " ns");

        System.out.println("Stack Strategy Result: " + result2);
        System.out.println("Time taken: " + (end2 - start2) + " ns");

        scanner.close();
    }
}