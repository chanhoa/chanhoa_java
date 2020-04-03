package src.ExceptionHandling;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class ScannerFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("test.txt"));
    }
}
