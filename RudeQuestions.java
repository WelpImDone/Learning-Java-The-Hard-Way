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

        System.out.println( "");
}
}