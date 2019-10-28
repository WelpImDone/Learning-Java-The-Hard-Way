import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] orderNumber = {12345, 54321, 101010, 8765309, 31415, 271828};
        int toFind;
        
        System.out.print( "There are " + orderNumber.length);
        System.out.println( " orders in the database.");

        System.out.print( "Orders: ");
        for ( int num : orderNumber) {
            System.out.print( num + " ");
        }
        System.out.println();

        System.out.print( "Whch order to find?");
        toFind = keyboard.nextInt();

        for ( int num : orderNumber ) {
            if ( num == toFind) {
                System.out.println( num + " found.");
            }
        }
        keyboard.close();
    }
}