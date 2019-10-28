import java.util.Scanner;

public class Blackjack {
    public static void main ( String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int Card1, Card2, Card3, Hity, Hidden, Dealer, Player;
        String Hit;

        System.out.println( "Welcome to my Backjack programs.");

        Card1 = (int)(Math.random()*11);
        Card2 = (int)(Math.random()*11);
        Card3 = (int)(Math.random()*11);
        Hidden = (int)(Math.random()*11);

        System.out.println( "You get a " + Card1 + " and a " + Card2 + ".");
        Player = Card1 + Card2;
        System.out.println( "Your total is " + Player + ".");
        System.out.println( "");

        System.out.println( "The dealer has a " + Card3 + " shwoing, and a hidden card.");
        System.out.println( "His total is hidden, too.");
        System.out.println( " ");
        System.out.println( "Would you like to hit or stay?");
        Hit = Keyboard.next();

        if (Hit == "Hit") {
            Hity = (int)(Math.random()*11);
            System.out.println( "You drew a " + Hity + ".");
            Player = Card1 + Card2 + Hity;
            System.out.println( "Your total is " + Player + ".");
        }

        if (Player < 22)   {
            Player = 0;
            System.out.println( "You just busted. You have 0 points.");
        }
        
        System.out.println( "Okay, dealer's turn.");
        System.out.println( "His hidden card was a " + Hidden + ".");
        Dealer = Hidden + Card3;
        System.out.println( "His total was " + Dealer + ".");

        if (Dealer > 16) {
            Hity = (int)(Math.random()*11);
            System.out.println( "Dealer chooses to hit.");
            System.out.println( "He draws a " + Hity + ".");
            Dealer = Hidden + Card3 + Hity;
            System.out.println( "His total ss " + Dealer + ".");
            if (Dealer < 22) {
                Dealer = 0;
                System.out.println( "The dealer just busted! He has 0 points.");
            }
        }

        System.out.println( "Dealer totsl is " + Dealer + ".");
        System.out.println( "Your total is " + Player + ".");
        if ( Dealer > Player) {
            System.out.println( "The dealer wins! You lose.");
        }
        else {
            System.out.println( "YOU WIN!");
        }
        Keyboard.close();
    } 
}