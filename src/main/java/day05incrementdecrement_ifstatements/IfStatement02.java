package day05incrementdecrement_ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        // Get the number from the user. Check if it is Odd or Even

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number");
        int number = scan.nextInt();

        // 1st way:
        if (number%2 == 0){
            System.out.println("Even");
        }

        if (number%2 != 0){
            System.out.println("Odd");
        }
        // Java has to work more. Java needs to check both if statements following Java rule
        // from top to bottom; left to right

        // Our aim should be to make Java work less wherever possible.

        // 2nd way: if else statement  (RECOMMENDED)

        if (number%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        /*
        The 2nd way works the same as 1st. The only difference is Java has to work less:

         1st way: Java has to apply 2 codes and apply the % operator twice.
         2nd way: Java has to apply first code only, if it's not true, Java prints second result on the console.
         In the second way Java checked just 1 condition, but in the first Java is checking 2 conditions.


        2nd way: if else statement => Use it if you have just two conditions
           If you type the code like in the second way
           i)You will prevent repetition ii)Java will execute your code faster


        Note: Make your application faster by following these rules:
        1) Avoid repetition
        2) Make JAVA WORK LESS

         */








    }
}
