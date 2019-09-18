public class MathOperations {
    public static void main( String[] args ) {
        int A, B, C, D, E, F, G;
        double X, Y, Z;
        String One, Two, Both;

        A = 10;
        B = 27;
        System.out.println( "A is " + A + ", B is " + B );

        C = A + B;
        System.out.println( "A+B is " + C );
        D = A - B;
        System.out.println( "A-B is " + D );
        E = A + B * 3;
        System.out.println( "A+B*3 " + E );
        F = B / 2;
        System.out.println( "B/2 is" + F );
        G = B % 10; 
        System.out.println( "B510 is " + G );

        X = 1.1;
        System.out.println( "\nX is " +X);
        Y = X * X;
        System.out.println( "X*X is " + Y );
        Z = B / 2;
        System.out.println( "B/2 is " + Z);
        System.out.println();

        One = "Dog";
        Two = "House.";
        Both = One + Two;
        System.out.println( Both );

    }
}