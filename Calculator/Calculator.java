import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        // Turning on the scanner
        Scanner scanner = new Scanner(System.in);

        // Setting Variables
        String selector;
        double x;
        double y;
        double z;

        // Menu (main)
        System.out.println("--------------- Calculator ---------------");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
        System.out.println("Write the number of the desired section.\n-------------------------------------------");
        selector = scanner.nextLine();

        switch(selector) {
            case "1":
                System.out.println("You chose Addition!\nWrite your first number:");
                x = scanner.nextDouble();
                System.out.println("Write your second number:");
                y = scanner.nextDouble();

                // Calculating
                z = x + y;

                // Printing the result:
                System.out.println("The result is " + z);
            break;
            
            case "2":
                System.out.println("You chose Subtraction!\nWrite your first number:");
                x = scanner.nextDouble();
                System.out.println("Write your second number:");
                y = scanner.nextDouble();

                // Calculating
                z = x - y;

                // Printing the result
                System.out.println("The result is " + z);
            break;

            case "3":
                System.out.println("You chose Multiplication\nWrite your first number:");
                x = scanner.nextDouble();
                System.out.println("Write your second number:");
                y = scanner.nextDouble();

                // Calculating
                z = x * y;

                // Printing the result
                System.out.println("The result is " + z);
            break;

            case "4":
                System.out.println("You chose Division\nWrite your first number:");
                x = scanner.nextDouble();
                System.out.println("Write your second number:");
                y = scanner.nextDouble();

                // Calculating
                z = x / y;

                // Printing the result
                System.out.println("The result is " + z);
            break;

            default:
                System.out.println("Please, write one of the numbers presented.");
        }
    }
}