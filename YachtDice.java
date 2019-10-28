public class YachtDice {
    public static void main( String[] args) {
        int R1, R2, R3, R4, R5;
        boolean AllSame;


        do {
            R1 = 1 + (int)(Math.random()*6);
            R2 = 1 + (int)(Math.random()*6);
            R3 = 1 + (int)(Math.random()*6);
            R4 = 1 + (int)(Math.random()*6);
            R5 = 1 + (int)(Math.random()*6);
            System.out.print( "\nYou rolled: " + R1 + " " + R2 + " ");
            System.out.println( R3 + " " + R4 + " " + R5 );
            ShowDice(R1);
            ShowDice(R2);
            ShowDice(R3);
            ShowDice(R4);
            ShowDice(R5);
            AllSame = ( R1 == R2 && R2 == R3 && R3 == R4 && R4 == R5);
        } while ( ! AllSame);
        System.out.println( "The Yacht!!");
    }
    public static void ShowDice( int roll){
        System.out.println( "+---+");
        if ( roll == 1) {
            System.out.println( "|   |");
            System.out.println( "| o |");
            System.out.println( "|   |");
        }
        else if ( roll == 2){
            System.out.println( "|o  |");
            System.out.println( "|   |");
            System.out.println( "|  o|");
        }
        else if ( roll == 3){
            System.out.println( "|o  |");
            System.out.println( "| o |");
            System.out.println( "|  o|");
        }
        else if ( roll == 4){
            System.out.println( "|o o|");
            System.out.println( "|   |");
            System.out.println( "|o o|");
        }
        else if ( roll == 5){
            System.out.println( "|o o|");
            System.out.println( "| o |");
            System.out.println( "|o o|");
        }
        else if ( roll == 6){
            System.out.println( "|o o|");
            System.out.println( "|o o|");
            System.out.println( "|o o|");
        }
        System.out.println( "+---+");
    }
}