package markscalculator;

import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the lecturer to enter marks for three units
        System.out.println("Enter marks for Java Programming:");
        double javaMarks = scanner.nextDouble();

        System.out.println("Enter marks for Networking:");
        double networkingMarks = scanner.nextDouble();

        System.out.println("Enter marks for Maths:");
        double mathsMarks = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Compute the average marks
        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3;

        // Display the results
        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);
    }
}
