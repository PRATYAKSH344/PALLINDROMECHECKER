/**
 * MAIN CLASS UseCase9PalindromeCheckerApp
 * Use Case 9: Recursive Palindrome Checker
 * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 * @author Developer
 * @version 9.0
 */
public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        // Hardcoded input string as per expected output
        String input = "madam";

        // Call the recursive check method starting at the first and last indices
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Display the output matching the requested format
        System.out.println("Input " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome.
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition 1: If the pointers meet or cross, all pairs matched
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If a mismatch is found, it is not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call: Move both pointers inward and check again
        return check(s, start + 1, end - 1);
    }
}