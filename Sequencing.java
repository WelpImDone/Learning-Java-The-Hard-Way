import java.util.Scanner;

public class Sequencing {
    public static void main( String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double Price, SalesTax, Total;

        System.out.print( "How much is the purchase price? ");
        Price = Keyboard.nextDouble();

        SalesTax = Price * 0.0825;
        Total = Price + SalesTax;

        System.out.println( "Item price:\t" + Price);
        System.out.println( "Sales tax:\t" + SalesTax );
        System.out.println( "Total cost:\t" +Total );
        Keyboard.close();
    }
}