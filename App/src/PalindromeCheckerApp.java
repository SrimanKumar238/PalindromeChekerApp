import java.util.Scanner;

public class StrategyPalindromeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker - Strategy Pattern");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeContext context = new PalindromeContext();

        System.out.println("Choose Algorithm:");
        System.out.println("1. Reverse String Method");
        System.out.println("2. Two Pointer Method");

        int choice = scanner.nextInt();

        if (choice == 1) {
            context.setStrategy(new ReverseStringStrategy());
        } else if (choice == 2) {
            context.setStrategy(new TwoPointerStrategy());
        } else {
            System.out.println("Invalid choice");
            return;
        }

        boolean result = context.checkPalindrome(input);

        if (result) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }

        scanner.close();
    }
}