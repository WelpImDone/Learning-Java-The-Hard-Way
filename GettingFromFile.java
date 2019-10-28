import java.io.File;
import java.util.Scanner;

public class GettingFromFile {
    public static void main( String[] args) throws Exception {
        String Name;
        int A, B, C, Sum;

        System.out.print( "Getting name and three numbers from file...");
        Scanner FileIn = new Scanner(new File("Name-And-Numbers.txt"));
            Name = FileIn.nextLine();
            A = FileIn.nextInt();
            B = FileIn.nextInt();
            C = FileIn.nextInt();
            FileIn.close();

            System.out.println( "Done.");
            System.out.println( "Your name is " + Name);
            Sum = A + B + C;
            System.out.println( A + "+" + B + "+" + C + " = " + Sum);
    }
}