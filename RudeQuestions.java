import java.util.Scanner;

public class RudeQuestions {

    public static void main( String[] args) {
        String Name;
        int Age;
        double Weight, Income;
        
        Scanner Keyboard = new Scanner(System.in);

        System.out.print( " Hello. What is your name? " );
        Name = Keyboard.next();

        System.out.print( "Hi, " + Name + "! How old are you? ");
        Age = Keyboard.nextInt();

        System.out.println( "So you're " + Age + ", eh ? That's not very old." );
        System.out.println( "How much do you weigh, " + Name + "? ");
        Weight = Keyboard.nextDouble();

        System.out.println( Weight + " ! Better keep that quiet!!" );
        System.out.println( "Finally, what's your income, " + Name + "? ");
        Income = Keyboard.nextDouble();

        
        System.out.print( "Hopefully that is " + Income + " per hour");
        System.out.println( " and not per year!" );
        System.out.print( "Well, thanks for answeing my rude questions, ");
        System.out.println( Name + ".");
        Keyboard.close();
}
}