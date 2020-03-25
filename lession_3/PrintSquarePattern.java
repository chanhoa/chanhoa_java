package lession2;

import java.util.Scanner;

public class PrintSquarePattern {
    public static void main(String[] args) {
        //declare variables
        int size; // size of the pattern to be input
        Scanner in = new Scanner(System.in);
        //Prompt user for the size and read input as "int"
        System.out.println(" Enter the size: ");
        size = in.nextInt();
        // Use nested-loop to print a 2D pattern
        //Outer loop to print ALL the columns of EACH row
        for (int row = 1; row <= size; row++) {
            //Inner loop to print ALL the colums of EACH row
            for (int col = 1; col <= size; col++) {
                System.out.println("* ");

            }
            //Print a newline after all the columns
            System.out.println();
        }
        in.close();
    }
}