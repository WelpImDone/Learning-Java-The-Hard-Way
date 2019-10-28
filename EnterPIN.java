import java.util.Scanner;

public class EnterPIN {
    public static void main( String[] args){
        Scanner Keyboard = new Scanner(System.in);
        int PIN, Entry;

        PIN = 12345;

        System.out.println( "Welcome to the Bank of Java.");
        System.out.print( "Enter your PIN: ");
        Entry = Keyboard.nextInt();

        while ( Entry != PIN) {
            System.out.println( "\nIncorrect PIN. Try again.");
            System.out.println( "Enter your PIN: ");
            Entry = Keyboard.nextInt();
        }


        System.out.println( "\nPIN Accepted. Your account balence is 425.17.");
        Keyboard.close();
    }
}