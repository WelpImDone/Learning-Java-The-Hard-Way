import java.io.File;
import java.util.Scanner;

public class GettingWholeFile {
    public static void main( String[] args) throws Exception {
        int FourLetter = 0;
        int Caps = 0;

        String fn1 = "Some-Words.txt";
        String fn2 = "GettingWholeFile.java";

        Scanner WordReadr = new Scanner(new File(fn1));

        while ( WordReadr.hasNext() ) {
            String W = WordReadr.next();
            if (W.length() == 4) {
                FourLetter++;
            }
        }
        WordReadr.close();

        Scanner SelfInput = new Scanner( new File(fn2));
        while ( SelfInput.hasNext() ) {
            String Token = SelfInput.next();
            if ( Character.isUpperCase( Token.charAt(0))) {
                Caps++;
            }
        }
        SelfInput.close();

        System.out.println( FourLetter + " four-letter word in " + fn1);
        System.out.println( Caps + " words start with capitals in " + fn2);
    }
}