import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args) {

        // Calculate area of a rectangle
        double width;
        double height;
        double area;

        // Create the scanner
        Scanner scanner = new Scanner(System.in);

        // Print Strings (Witdth)
        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        // Print Strings (Height)
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        // Area Calculation
        area = width * height;

        // Output total of area
        System.out.println("The area is: " + area); 

        // Turning off the Scanner
        scanner.close();
    }
}
