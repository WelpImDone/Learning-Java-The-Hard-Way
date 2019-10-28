import java.util.Scanner;


public class ThirtyDaysFunctions {
    public static void main ( String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.print( "Which month (1-12 ");
        int Month = Keyboard.nextInt();

        System.out.println( MonthDays(Month) + " days hath " + MonthName(Month));
        Keyboard.close();
    }

    public static String MonthName( int Month) {
        String MonthName = "Error";

        if ( Month == 1) {
            MonthName = "January";
        }
        else if ( Month == 2) {
            MonthName = "February";
        }
        else if ( Month == 3) {
            MonthName = "March";
        }
        else if ( Month == 4 ) {
            MonthName = "April";
        }
        else if ( Month == 5) {
            MonthName = "May";
        }
        else if ( Month == 6) {
            MonthName = "June";
        }
        else if ( Month == 7) {
            MonthName = "July";
        }
        else if ( Month == 8 ) {
            MonthName = "August";
        }
        else if ( Month == 9) {
            MonthName = "September";
        }
        else if ( Month == 10) {
            MonthName = "October";
        }
        else if ( Month == 11) {
            MonthName = "November";
        }
        else if ( Month == 12) {
            MonthName = "December";
        }

        return MonthName;
    }

    public static int MonthDays ( int Month) {
        int Days;

        switch( Month){
            case 9:
            case 4:
            case 6:
            case 11: Days = 30;
                    break;
            case 2: Days = 28;
                    break;
            default: Days = 31;
        }

        return Days;
    }
}