import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the year
        System.out.println("Enter the year:");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = checkLeapYear(year);

        // Display the result
        if (isLeapYear) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
