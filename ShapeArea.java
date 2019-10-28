import java.util.Scanner;

public class ShapeArea {
    public static void main( String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int Choice;
        double Area = 0;

        System.out.println( "Shape Area Calculator version 0.1");
        System.out.println( " (c) 2015 LJtHW Sample Output, Inc.");

        do {
            System.out.println( "\n-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            System.out.println( "1) Triangle");
            System.out.println( "2) Circle");
            System.out.println( "3) Rectangle");
            System.out.println( "4) Quit");
            System.out.print( "> ");
            Choice = Keyboard.nextInt();

            if ( Choice == 1) {
                System.out.print( "\nBase: ");
                int B = Keyboard.nextInt();
                System.out.print( "Height: ");
                int H = Keyboard.nextInt();
                Area = ComputerTriangleArea(B, H);
                System.out.println( "The area is " + Area);
            }
            else if ( Choice == 2) {
                System.out.print( "\nRadius: ");
                int Radius = Keyboard.nextInt();
                Area = ComputerCircleArea(Radius);
                System.out.println( "The area is " + Area);
            }
            else if (Choice == 3) {
                System.out.print( "\nLength: ");
                int Q = Keyboard.nextInt();
                System.out.print( "width: ");
                int W = Keyboard.nextInt();
                System.out.println( "The area is " + ComputerRectangleArea(Q, W));
            }
            else if ( Choice != 4) {
                System.out.println( "ERROR.");
            }
        } while ( Choice != 4);
        Keyboard.close();
    }

    public static double ComputerTriangleArea( int Base, int Height) {
        double A;
        A = 0.5* Base * Height;
        return A;
    }

    public static double ComputerCircleArea( int Radius ) {
        double A;
        A = Math.PI * Radius * Radius;
        return A;
    }

    public static double ComputerRectangleArea( int Length, int Width) {
        return (Length * Width);
    }
}