import java.util.Scanner;

public class BooleanExpressions {
    public static void main( String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        boolean A, B, C , D, E, F;
        double X, Y;

        System.out.println( "Give me two numbers. First: " );
        X = Keyboard.nextDouble();
        System.out.println( "Second: ");
        Y = Keyboard.nextDouble();

        A = (X < Y);
        B = (X <= Y);
        C = (X == Y);
        D = (X != Y);
        E = (X > Y);
        F = (X >= Y);

        System.out.println( X + " is LESS THAN " + Y + " : " + A);
        System.out.println( X + " is LESS THAN / EQUAL TO " + Y + " : " + B);
        System.out.println( X + " is EQUAL TO " + Y + " : " + C);
        System.out.println( X + " is NOT EQUAL TO " + Y + " : " + D);
        System.out.println( X + " is GREATER THAN " + Y + " : " + E);
        System.out.println( X + " is GREATER THAN / EQUAL TO " + Y + " : " + F);
        System.out.println();

        System.out.println( !(X < Y) + " " + (X >= Y) );
        System.out.println( !(X <= Y) + " " + (X > Y) );
        System.out.println( !(X == Y) + " " + (X != Y) );
        System.out.println( !(X != Y) + " " + (X == Y) );
        System.out.println( !(X > Y) + " " + (X <= Y));
        System.out.println( !(X >= Y) + " " + (X < Y) );
        Keyboard.close();
    }

}