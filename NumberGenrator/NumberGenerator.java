import java.util.Random;

public class NumberGenerator {
    public static void main (String[] args) {
        
        // Activate the Random
        Random random = new Random();
        
        // Variables
        int number1;
        int number2;
        int number3;
        
        // Adds the random value to int number + range of generation
        number1 = random.nextInt(1, 9);
        number2 = random.nextInt(10, 99);
        number3 = random.nextInt(100, 999);

        // Prints number
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}