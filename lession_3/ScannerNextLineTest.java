import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerNextLineTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string (with space):");
        String str = in.nextLine();
        System.out.printf("%s%n", str);
        in.close();
    }
}
