public class VariableChangesShortcuts {
    public static void main( String[] args) {
        int I, J, K;

        I = 5;
        J = 5;
        K = 5;
        System.out.println( "I; " + I + "\tJ: ");
        I = I + 3;
        J = J - 3;
        K = K * 3;
        System.out.println( "I: " + I + "\tJ: " + J + "\tK: " + K + "\n" );

        I = 5;
        J = 5;
        K = 5;
        System.out.println( "I: " + I + "\tJ: " + J + "\tK: " + K );
        I += 3;
        J -= 3;
        K *= 3;
        System.out.println( "I: " + I + "\tJ:" + J + "\tK: " + K + "\n" );

        I = J = K = 5;
        System.out.println( "I: " + I + "\tJ: " + J + "\tK: " + K );
        I += 1;
        J -= 2;
        K *= 3;
        System.out.println( "I: " + I + "\tJ: " + J + "\tK: " + K + "\n" );

        I = J = 5;
        System.out.println( "I: " + I + "\tJ: " + J  );
        I += 1;
        J -= 2;
        System.out.println( "I: " + I + "\tJ: " + J + "\n");

        I = J = 5;
        System.out.println( "I: " + I + "\tJ; " + J);
        I++;
        J--;
        System.out.println( "I: " + I + "\tJ; " + J);

    }
}