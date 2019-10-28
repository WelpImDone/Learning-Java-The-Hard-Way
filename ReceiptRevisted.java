import java.io.PrintWriter;

public class ReceiptRevisted {
    public static void main( String[] args) throws Exception {
        PrintWriter Fileout = new PrintWriter("Receipt.txt");

        Fileout.println( "+----------------------+");
        Fileout.println( "|                      |");
        Fileout.println( "|     CORNER STORE     |");
        Fileout.println( "|  2014-06-25 4:38PM   |");
        Fileout.println( "|                      |");
        Fileout.println( "| Gallons:      12.464 |");
        Fileout.println( "| Price/Gallon $ 3.459 |");
        Fileout.println( "|                      |");
        Fileout.println( "| Fuel Total:  $ 43.11 |");
        Fileout.println( "|                      |");
        Fileout.println( "+----------------------+");
        Fileout.close();
    }
}