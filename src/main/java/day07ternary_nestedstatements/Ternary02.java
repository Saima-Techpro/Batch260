package day07ternary_nestedstatements;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        // Create a ternary to print the absolute value of a given number

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number to find its absolute value");

        int number = scan.nextInt();

        int absValue= number<0 ? (-1*number)  : number;
        System.out.println("absValue = " + absValue);

        // Example: If two numbers have same sign, multiply them. Otherwise, print "I can't multiply these numbers"

        int a = 7 , b = 9;

         Object result = (a<0 && b < 0)  || ( a>0 && b>0) ? a*b : "I can't multiply these numbers" ;
        System.out.println("result = " + result);
         /*
         Object data type is the father of all data types.
         Object data type is like Adam to whole human race.
         Generally, we create the variables in the same data type as the result is.
         But in some cases, it's unavoidable to use Object data type ( specially when we have to take of different data types at the same time)
         Object data tpe uses lots of memory. So we use it only when it's absolute necessary.

          */


        // Example: Check the given number if it has 3 digits or not

        int x = -150;

        x = Math.abs(x);

        String  result1 = (x > 99 && x < 1000) ?  "It has 3 digits" : "It doesn't have 3 digits";
        System.out.println("result1 = " + result1);











    }

}
