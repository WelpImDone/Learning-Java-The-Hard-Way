import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main( String[] args) {
        int Answer, Dom;

        Scanner Keyboard = new Scanner(System.in);
        Random Ran = new Random();

        System.out.println( "You slide up to fast Eddie's card table and plop down your cash");
        System.out.println( "He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println( "He lays down three cards.");
        System.out.println( "");
        System.out.println( "Which one is the ace?");
        System.out.println( "");
        System.out.println( "        ##  ##  ##");
        System.out.println( "        ##  ##  ##");
        System.out.println( "        1   2   3");
        System.out.println( "");
        System.out.println( "");
        Answer = Keyboard.nextInt();
        Dom = 1 + Ran.nextInt(10);

        if (Answer == Dom) {
            System.out.println( "You nailed it! Fast Eddie hands over your winnings, scowling.");
        }
        else {
            System.out.println( "Ha! Fast Eddie wins agian!");
        }

        System.out.println( "");

        if (Dom == 1){
            System.out.println( "        AA  ##  ##");
            System.out.println( "        AA  ##  ##");
            System.out.println( "        1   2   3");
        }
        if (Dom == 2){
            System.out.println( "        ##  AA  ##");
            System.out.println( "        ##  AA  ##");
            System.out.println( "        1   2   3");
        }
        else{
            System.out.println( "        ##  ##  AA");
            System.out.println( "        ##  ##  AA");
            System.out.println( "        1   2   3");
        }
        Keyboard.close();
    }
}

