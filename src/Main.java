import java.util.Scanner;

/**
 * MAIN CLASS Main
 * Description:
 * This class acts as the central menu and driver for the
 * Palindrome Checker Management System. It allows the user
 * to select and run any of the 9 use cases implemented.
 * * @author Developer
 * @version 10.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.println("=================================================");
        System.out.println(" Welcome to the Palindrome Checker Management System ");
        System.out.println(" Version: Final Integration");
        System.out.println(" System initialized successfully.");
        System.out.println("=================================================");

        while (choice != 0) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. UC1: Welcome Message (Dummy Start)");
            System.out.println("2. UC2: Hardcoded Palindrome Validation");
            System.out.println("3. UC3: Reverse String Based Check");
            System.out.println("4. UC4: Character Array (Two-Pointer) Check");
            System.out.println("5. UC5: Stack-Based Check");
            System.out.println("6. UC6: Queue + Stack Fairness Check");
            System.out.println("7. UC7: Deque-Based Optimized Check");
            System.out.println("8. UC8: Linked List Based Check");
            System.out.println("9. UC9: Recursive Check");
            System.out.println("0. Exit Application");
            System.out.print("Enter your choice (0-9): ");

            // Read user input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                System.out.println("\n--- EXECUTING USE CASE " + choice + " ---");
                // Call the main method of the respective Use Case classes
                switch (choice) {
                    case 1:
                        UseCase1PalindromeCheckerApp.main(new String[]{});
                        break;
                    case 2:
                        UseCase2PalindromeCheckerApp.main(new String[]{});
                        break;
                    case 3:
                        UseCase3PalindromeCheckerApp.main(new String[]{});
                        break;
                    case 4:
                        UseCase4PalindromeCheckerApp.main(new String[]{});
                        break;
                    case 5:
                        UseCase5PalindromeCheckerApp.main(new String[]{});
                        break;
                    case 6:
                        UseCase6PalindromeCheckerApp.main(new String[]{});
                        break;
                    case 7:
                        UseCase7PalindromeCheckerApp.main(new String[]{});
                        break;
                    case 8:
                        UseCase8PalindromeCheckerApp.main(new String[]{});
                        break;
                    case 9:
                        UseCase9PalindromeCheckerApp.main(new String[]{});
                        break;
                    case 0:
                        System.out.println("Exiting Application. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 0 and 9.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear the bad input
            }
        }

        scanner.close();
    }
}
