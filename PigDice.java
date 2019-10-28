import java.util.Scanner;

public class PigDice {
    public static void main ( String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int Roll, Ptot, Ctot, TurnTotal;
        String Choice = " ";

        Ptot = 0;
        Ctot = 0;

        do {
            TurnTotal = 0;
            System.out.println( "You have " + Ptot + " points.");

            do {
                Roll = 1 + (int)(Math.random()*6);
                System.out.println( "\tYou rolled a " + Roll + ".");
                if ( Roll == 1) {
                    System.out.println( "\tThat ends your turn.");
                    TurnTotal = 0;
                }
                else {
                    TurnTotal += Roll;
                    System.out.println( "\tYou have " + TurnTotal + " points");
                    System.out.println( " so far this round. \n");
                    System.out.println( "\t Would you like to \"roll\" agian?");
                    System.out.println( " Or \"Hold\"? ");
                    Choice = Keyboard.next();

                }
            } while ( Roll != 1 && Choice.equals("Roll" ) );

            Ptot += TurnTotal;
            System.out.println( "\tYou dend the round with " + Ptot + " points.");

            if ( Ptot < 100) {
                TurnTotal = 0;
                System.out.println( "Computer has " + Ctot + " points.");

                do {
                    Roll = 1 + (int)(Math.random()*6);
                    System.out.println("\tComputer rolled a " + Roll + ".");
                    if ( Roll == 1) {
                        System.out.println("\tComputer rolled a " + Roll + ".");
                        TurnTotal = 0;
                }
                    else {
                        TurnTotal += Roll;
                        System.out.print( "\tComputer has " +TurnTotal);
                        System.out.print( " points so far this round. \n");
                    if ( TurnTotal < 20) {
                        System.out.println( "\tComouter will roll agian.");
                    }
                }
            } while ( Roll != 1 && TurnTotal < 20);

            Ctot += TurnTotal;
            System.out.print( "\tComputer ends the round with ");
            System.out.print( Ctot + " points.\n");
            }
        } while (Ptot < 100 && Ctot < 100 );
        if ( Ptot > Ctot) {
            System.out.println ( "Humanity wins!");
        }
        else {
            System.out.println( "The computer wins.");
        }
        Keyboard.close();
    }
}