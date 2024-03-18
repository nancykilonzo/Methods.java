import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.getInputAndCalculateArea();
    }

    // enter the base and height of a triangle
    public void getInputAndCalculateArea() {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // enter the base and height of the triangle
        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = calculateArea(base, height);

        // Output the calculated area of the triangle
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to compute the area of a triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
