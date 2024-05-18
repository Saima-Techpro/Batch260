package day13loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "You won! You can continue!".
        Otherwise, tell user "You lost!"
         */

        Scanner scan = new Scanner(System.in);

        int num = 0;

        do {
             System.out.println("Enter a number please!");
            num = scan.nextInt();

            if(num > 0 && num < 100){
                System.out.println("You won! You can continue!");
            }
            else if (num < 0){
                System.out.println("Number cannot be negative");
                break;
            }

        } while (num < 100);
        System.out.println("You lost! No more tries!");


    }
}
