public class Specifier {
    public static void main(String[] args) {

    // Format Specifier & Their Conversion Applied
    // %d - decimal int
    // %f - float/double
    // %c - char
    // %s - string
    // %b - boolean
    // %% - inserts a literal "%"" sign

    // % [flags] [width] [.precision] [specifier-character]

    // Variables
    String name = "Peter Griffin";
    char firstLetter = 'P';
    int age = 42;
    double height = 60.7;
    boolean isSilly = true;

    // Printing the Variables
    System.out.printf("Hello %s\n", name);
    System.out.printf("The first letter of your name is %c\n", firstLetter);
    System.out.printf("You are %d years old\n", age);
    System.out.printf("Your height is %f\n", height);
    System.out.printf("Silly: %b\n", isSilly);
    System.out.printf("%s is %d years old\n", name, age);

    }
}