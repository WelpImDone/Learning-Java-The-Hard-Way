import java.util.Scanner;

public class ALittleQuiz{
    public static void main( String[] args) {
        String Start;
        int Right, RightCa, RightCT, RightMa, Cap, Cat, Math;
        Scanner Keyboard = new Scanner(System.in);

        RightCa = 0;
        RightCT = 0;
        RightMa = 0;
        System.out.println( "Are you ready for a quiz?");
        Start = Keyboard.next();
        if (Start == "Yes"){
            System.out.println( "Okay here it comes!");
            System.out.println( " ");

            System.out.println( "Q1: What is the captial of Alaska?");
            System.out.println( "        1. Melbourne");
            System.out.println( "        2. Anchorage");
            System.out.println( "        3. Juneau");
            Cap = Keyboard.nextInt();

            if ( Cap == 3) {
                RightCa = RightCa + 1 ;
                System.out.println( "Thats right!");
            }
            else {
                System.out.println("Thats wrong. The correct answer is Juneau");
            }
            System.out.println( " ");

            System.out.println( "Can you store the value cat in a variable of type int?");
            System.out.println( "    1. Yes");
            System.out.println( "    2. No");
            Cat = Keyboard.nextInt();

            if ( Cat == 2){
                RightCT = RightCa + 1;
                System.out.println( "Thats right!");
            }
            else{
                System.out.println( "Sorry, cat is a string. Ints can only store numbers.");
            }
            System.out.println( " ");

            System.out.println( "Q3: What is the result of 9+6/3?");
            System.out.println( "        1. 5");
            System.out.println( "        2. 11");
            System.out.println( "        3. 15/3");
            Math = Keyboard.nextInt();

            if ( Math == 2){
                RightMa = RightCT + 1;
                System.out.println( "Thats correct!");
            }
            else{
                System.out.println( "Sorry. You can figure out why its wrong.");
            }
            System.out.println( " ");

            Right = RightMa + 1;
            System.out.println( "Overall, you got " + Right + " out of 3 correct");
            System.out.println( "Thanks for playing!");
            Keyboard.close();
        }
        else {
            System.out.println( "Welp then leave then.");
            Keyboard.close();
        }
    }
}
