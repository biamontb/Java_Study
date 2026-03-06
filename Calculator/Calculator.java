import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        double x; // Number 1
        double y; // Number 2
        double z; // Result

        // Menu (Main)
        System.out.println("----------- Calculator -----------");
        System.out.println("1. Addiction\n2. Subtraction\n3. Multiplicator\n4. Divisor");
        System.out.println("\nSelect by writting the number.\n----------------------------------");
        int selector = scanner.nextInt();

        // Other Menus (1, 2, 3 & 4)
        switch (selector) {
            
            // Menu (1. Addiction)
            case 1:
                System.out.println("------ You chose Addiction! ------\nWrite your first number: ");
                x = scanner.nextDouble();
                System.out.println("Write your second number: ");
                y = scanner.nextDouble();

                z = x + y;

                System.out.println("The total is: " + z);
                break;

            // Menu (2. Substraction)
            case 2:
                System.out.println("---- You chose Substraction! ----\nWrite your first number: ");
                x = scanner.nextDouble();
                System.out.println("Write your second number: ");
                y = scanner.nextDouble();

                z = x - y;

                System.out.println("The total is: " + z);
                break;

            // Menu (3. Multiplicator)
            case 3:
                System.out.println("---- You chose Multiplicator! ----\nWrite your first number: ");
                x = scanner.nextDouble();
                System.out.println("Write your second number: ");
                y = scanner.nextDouble();

                z = x * y;

                System.out.println("The total is: " + z);
                break;

            // Menu (4. Divisor)
            case 4:
                System.out.println("------- You chose Divisor! -------\n Write your first number: ");
                x = scanner.nextDouble();
                System.out.println("Write your second number: ");
                y = scanner.nextDouble();

                z = x / y;
                
                System.out.println("The total is: " + z);
                break;

            // Menu (Default)
            default: System.out.println("We don't have that option.");
    }
    }
}