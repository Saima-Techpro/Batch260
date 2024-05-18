package day13loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {

        // Example: Ask user to enter a number. Find the sum of the digits of the given number.
        // 123 => 1+2+3 => 6
        // HINT: % and division operation

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number please");

        int number = scan.nextInt(); // starting value

        int sum = 0; // to store the result of addition

        while (number > 0){
             sum = sum + number%10;
           number  = number / 10;
        }
        System.out.println("sum = " + sum);


    }
}
