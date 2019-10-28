import static java.lang.System.*;

public class OverlyComplexFlag {
    public static void main( String[] args) {
        PrintTopHalf();
        Print48Colons();
        Print48Ohs();
        Print48Colons();
        Print48Ohs();
        Print48Colons();
        Print48Ohs();
    }

    public static void Print48Colons() {
        out.println( "|:::::::::::::::::::::::::::::::::::::::::::|");
    }

    public static void Print48Ohs (){
        out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
    } 

    public static void Print29Colons() {
        out.println( "|::::::::::::::::::::::::::::|");
    }

    public static void PrintPledge() {
        out.println( "I pledge allegiance to the flag.");
    }

    public static void Print29Ohs() {
        out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOO|");
    }
    public static void Print6Stars() {
        out.print( "| * * * * * * ");
    }

    public static void Print5Stars() {
        out.print( "| * * * * * ");
    }

    public static void PrintSixStarLine() {
        Print5Stars();
        Print29Ohs();
    }
    
    public static void PrintFiveStarLine() {
        Print5Stars();
        Print29Colons();
    }


    public static void PrintTopHalf() {
        out.println( " ____________________________________________");
        PrintSixStarLine();
        PrintFiveStarLine();
        PrintSixStarLine();
        PrintFiveStarLine();
        PrintSixStarLine();
        PrintFiveStarLine();
        PrintSixStarLine();
    }
}