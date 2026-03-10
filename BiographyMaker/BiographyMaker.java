import java.util.Scanner;

public class BiographyMaker {
    public static void main(String[] args) {
        // Variables
        String name;
        Integer age;
        Boolean hasPET;

        // Scanning
        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("Hello and welcome to BiographyMaker!");

        // Scanning Message: name
        System.out.println("What's your name?");
        name = scanner.next();

        // Scanning Message: age
        System.out.println("What's your age?");
        age = scanner.nextInt();

        // Scanning Message: hasPET
        System.out.println("Do you have a Pet?\n(write 'true' or 'false')");
        hasPET = scanner.nextBoolean();

        // Close the Scanning system
        scanner.close();

        // ProfileMaker Result
        System.out.println("Here's your Biography:");
        System.out.println("Hi! My name is " + name + " and I'm " + age + " years old."); // Mad Libs Game
        System.out.println("Has pet: " + hasPET + ".");

    }
}