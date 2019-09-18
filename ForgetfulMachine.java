import java.util.Scanner;

public class ForgetfulMachine {
    public static void main( String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println( "What city is the capital of France?" );
        Keyboard.next();

        System.out.println( "What is 6 muttiplied by 7?" );
        Keyboard.nextInt();

        System.out.println( "Enter a number betweeen 0.0 and 1.0." );
        Keyboard.nextDouble();

        System.out.println( "Is there anything else you would like to say?" );
        Keyboard.next();

        Keyboard.close();
    }
}