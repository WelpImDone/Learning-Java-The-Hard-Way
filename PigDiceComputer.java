public class PigDiceComputer {
    public static void main( String[] args) {
        int Roll, Total;
        Total = 0;

        do {
            Roll = 1 + (int)(Math.random()*6);
            System.out.println( "Computer rolled a " + Roll + ".");
            if (Roll == 1){
                System.out.println( "\tThat end its turn.");
                Total = 0;
            }
            else{
                Total += Roll;
                System.out.println( "\tComputer has total " + Total );
                System.out.print( " points so far this round. \n");
                if (Total < 20) {
                    System.out.println( "\tComputer wil roll agian.");
                }
            }
        } while ( Roll != 1 && Total < 20 );

        System.out.println( "Computer ends the round with " + Total + " points.");
    }
}