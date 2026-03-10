import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

    /*  Switch is a statement that allows a variable to be
        tested for equality against a list of values. */

        // Turning on the scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        String day;

        // Menu (main)
        System.out.println("Write a week's day: ");
        day = scanner.nextLine();

        switch(day) {
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            default: System.out.println("That is not a day!");
        }

    }
}