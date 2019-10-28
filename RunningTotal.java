import java.util.Scanner;

public class RunningTotal {
    public static void main ( String [] args){
    Scanner Keyboard = new Scanner(System.in);
    int Current, Total = 0;
    System.out.print( "Type in a bunch of vgaules and I'll add them up. ");
    System.out.println( "I'll stope when you type a zero.");

    do {
        System.out.print( "Values: ");
        Current = Keyboard.nextInt();
        Total += Current;
        System.out.println( "The total so far is: " + Total);
    } while ( Current != 0 );

    System.out.println( "The final total is : " + Total);
    Keyboard.close();
    }
}