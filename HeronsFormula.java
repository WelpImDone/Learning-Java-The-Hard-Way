public class HeronsFormula {
    public static void main( String[] args ){
        double A, G;
        String TWS = "A tringle with sides ";

        A = TriangleArea( 3, 3 ,3);
        System.out.println( "A triangle with sides 3, 3, 3 has area " + A);

        A = TriangleArea( 3, 4, 5);
        System.out.println( "A triangle with sides 3, 4, 5 has area " + A);
        G = TriangleArea( 7, 8, 9);
        System.out.println( TWS + "7,8,9 has area " + G);

        System.out.println( TWS + "5,12,13 has area " + TriangleArea(5, 12, 13) );
        System.out.println( TWS + "10,9,11 has area " + TriangleArea(10, 9, 13) );
        System.out.println( TWS + "8,15,17 has area " + TriangleArea(8, 15, 17) );
    }

    public static double TriangleArea ( int A, int B, int C) {
        double S, D;


        S = (A+B+C) / 2;
        D = Math.sqrt(S*(S-C)*(S-B)*(S-C));

        return D;
    }
}