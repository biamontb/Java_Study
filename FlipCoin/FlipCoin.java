import java.util.Random;

public class FlipCoin {
    public static void main (String[] args) {
        
        // Activate the random
        Random random = new Random();

        // Variables
        boolean isHeads;

        // Set random value to boolean isHeads
        isHeads = random.nextBoolean();

        // Prints the message if it is:
        if (isHeads) {
            System.out.println("Heads"); // True
        }
        else{
            System.out.println("Tails"); // False
        }
    }
}