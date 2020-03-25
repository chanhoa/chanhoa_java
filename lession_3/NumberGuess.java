import java.sql.SQLOutput;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
        int seretnumber;
        int numberIn;
        int trialNumber = 0;
        boolean done = false;
        Scanner in =  new Scanner(System.in);
        seretnumber = (int)(Math.random()*100);
                while (!done) {
                    ++trialNumber;
                    System.out.println("Enter your guess (between 0 and 99):");
                    numberIn = in.nextInt();
                    if (numberIn == seretnumber){
                        System.out.println("Congratulation");
                        done = true;
                    } else if (numberIn < seretnumber) {
                        System.out.println("Congratulation");
                        done = true;
                    }else if (numberIn < seretnumber){
                        System.out.println("Try higher");
                    }else {
                        System.out.println("Try lower");
                    }
                }
        System.out.println("You got in " + trialNumber + "trials");
                in.close();
    }
}
