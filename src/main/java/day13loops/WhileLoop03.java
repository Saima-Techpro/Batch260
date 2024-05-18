package day13loops;

import java.util.Scanner;

public class WhileLoop03 {
    public static void main(String[] args) {

         /*
        Create a multiplication table using the number given by user.
        4 x 1 = 4
        4 x 2 = 8
        4 x 3 = 12
        4 x 4 = 16
        ....
        4 x 10 = 40

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to get its multiplication table");
        int num = scan.nextInt();

        int i = 1; // starting value

        while (i < 11){
            if (num < 0 || num > 10){
                System.out.println("Please provide number between 1 - 10 ");
                break;
            }
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

    }
}
