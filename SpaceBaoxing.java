import java.util.Scanner;

public class SpaceBaoxing {
    public static void main ( String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int Weight, Input;
        double Total;
        System.out.println( "Please enter your curent Earth Wieght: " );
        Weight = Keyboard.nextInt();

        System.out.println( "I have information for the following planets ; ");
        System.out.println( "   1. Venus   2. Mars    3. Jupiter ");
        System.out.println( "   4. Saturn  5. Uranus  6. Neptune ");
        System.out.println("");
        System.out.println( "Which planet are you visting? ");
        Input = Keyboard.nextInt();

        if ( Input == 1 ){
            Total = Weight * 0.78;
            System.out.println( "Your weight would be " + Total + " on that planet.");

        }
        if ( Input == 2){
            Total = Weight * 0.39;
            System.out.println( "Your weight would be " + Total + " on that planet.");
        }
        if ( Input == 3){
            Total = Weight * 2.65;
            System.out.println( "Your weight would be " + Total + " on that planet.");
        }
        if ( Input == 4){
            Total = Weight * 1.17;
            System.out.println( "Your weight would be " + Total + " on that planet.");
        }
        if ( Input == 5){
            Total = Weight * 1.05;
            System.out.println( "Your weight would be " + Total + " on that planet.");
        }
        if ( Input == 6){
            Total = Weight * 1.23;
            System.out.println( "Your weight would be " + Total + " on that planet.");
        }
        Keyboard.close();
    }

}