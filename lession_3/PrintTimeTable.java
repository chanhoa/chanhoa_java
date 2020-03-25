package lession2;

import java.util.Scanner;

public class PrintTimeTable {
    public static void main(String[] args) {
        //Declare variables
        int size; //size of table to be input
        Scanner in = new Scanner(System.in);
        //Prompt for size and read input as "int"
        System.out.print("Enter the size:");
        size = in.nextInt();
        //Print header row
        System.out.print("* |");
        for (int col = 1; col <= size ; ++col) {
            System.out.printf("%4d", col);
        }
        System.out.println();//End row with newline
        //Print separator row
        System.out.print("----");
        for (int col = 1; col<=size; ++col){
            System.out.printf("%4s","----");
        }
        System.out.println();// End row with newline
        //Print body using nested-loop
        for (int row = 1; row <= size; ++row){// outer loop
            System.out.printf("%2d |",row);//print row header first
            for( int col = 1; col <= size; ++col) { //inner loop
                System.out.printf("%4d", row * col);
            }
            System.out.println();

        }

    }
}
