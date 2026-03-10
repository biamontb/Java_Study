// Code reference: Bro Code (https://www.youtube.com/watch?v=-tt98ICTHtQ)

import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // Setting Variables
        int number;

        // Setting value to the Variables
        number = random.nextInt(1,7);

        // Print the number
        System.out.println(number);
    }
}