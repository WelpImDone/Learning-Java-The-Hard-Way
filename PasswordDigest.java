import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class PasswordDigest {
    public static void main( String[] args) throws Exception {
        Scanner Keyboard = new Scanner(System.in);
        String PW, Hash;

        MessageDigest Digest = MessageDigest.getInstance( "SHA-256");

        System.out.print( "Password : ");
        PW = Keyboard.nextLine();

        Digest.update( PW.getBytes("UTF-8"));
        Hash = DatatypeConverter.printHexBinary( Digest.digest() );

        System.out.println( Hash);
        Keyboard.close();
    }
}