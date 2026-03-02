
import java.util.Scanner;

public class madamPalindromeCheckerApp {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is not a palindrome.");
        }

        // Close scanner
        scanner.close();
    }
}