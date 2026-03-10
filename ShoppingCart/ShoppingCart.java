import java.util.Scanner;

public class ShoppingCart {
    public static void main (String[] args) {
        
        // --------- SHOPPING CART PROGRAM --------- //
        // --------- Bro Code Java Tutorial -------- //
        // Turning on the Scanner
        Scanner scanner = new Scanner(System.in);

        // Setting Variables
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        // Scans item
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        // Scans price
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        // Scans quantity
        System.out.println("How many would you like?: ");
        quantity = scanner.nextInt();

        // Calculates the value of total
        total = price * quantity;

        // Tells the user the quantity and total value
        System.out.println("\nYou have bought " + quantity + " " + item + "s" );
        System.out.println("Your total is " + currency + total);

        // Turns off the scanner
        scanner.close();
    }
}