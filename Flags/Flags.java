public class Flags {
    public static void main(String[] args) {

    // [flags]

       // + = output a plus
       // , = comma grouping separator
       // ( = negative numbers are enclosed in ()
       // space = display a minus if negative, space if positive

    double price1 = 9.99;
    double price2 = 100.15;
    double price3 = -54.01;

    System.out.printf("%f\n", price1);
    System.out.printf("%f\n", price2);
    System.out.printf("%f\n", price3);       
    
    }
}