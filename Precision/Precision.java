public class Precision {
    public static void main(String[] args) {
    
       // [.precision] is the total number of significant digits
       // a numerical data type can accurately represent

       double price1 = 9.99;
       double price2 = 100.15;
       double price3 = -54.01;

       System.out.printf("%.3f\n", price1);
       System.out.printf("%.3f\n", price2);
       System.out.printf("%.3f\n", price3);
    }
}