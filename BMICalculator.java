import java.util.Scanner;

public class BMICalculator {
    public static void main ( String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double M, KG, BMI;

        System.out.print( "Your hieght in M: ");
        M = Keyboard.nextDouble();

        System.out.print( "Your qeight in KG: ");
        KG = Keyboard.nextDouble();

        BMI = KG / (M*M);

        System.out.println( "Your BMI is " + BMI);
        Keyboard.close();
    }
}