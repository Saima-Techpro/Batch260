package day12loops;

import java.util.Scanner;

public class NestedForLoop02 {
    public static void main(String[] args) {

        /*
        Draw the following pattern on the console:

        *
        * *
        * * *
        * * * *

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print!");
        int rows = scan.nextInt();

        for (int i = 1; i <=  rows; i++) {

            for (int j = 1; j <= i; j++) {   // NOTE: i in  j<=i; is used to control the number of repetition and keep it according to outer loop
                System.out.print("* ");

            }

            System.out.println();

        }



    }
}
