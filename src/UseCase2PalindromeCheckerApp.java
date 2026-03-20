/**
 * MAIN CLASS UseCase2PalindromeCheckerApp
 * Use Case 2: Hardcoded Palindrome Validation
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 * This use case introduces fundamental comparison Logic
 * before using advanced data structures.
 * * @author Developer
 * @version 2.0
 */
public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        // Store the predefined string literal
        String input = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length to compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {
            // Conditional statement to evaluate the palindrome condition
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit the loop early if a mismatch is found
            }
        }

        // Display the result on the console
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}