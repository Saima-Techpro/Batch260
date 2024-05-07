package day07ternary_nestedstatements;

public class Ternary01 {
    public static void main(String[] args) {
        // on Mac => to increase / decrease font size  =>  cmd + mouse
        // on WINDOWS => to increase / decrease font size  =>  ctrl + mouse


        /*
        Ternary does the same as if-else statements => conditional statements
        BUt Ternary has simpler syntax

        condition ? part-for-true  : part-for false

         */

        // Example: If an integer is positive, print "The integer is positive". Otherwise, print "The integer is negative".


        // 1st way: if statements
        int a = 12;

        if (a>0){
            System.out.println("The integer is positive");
        } else {
            System.out.println("The integer is negative");
        }

        // 2nd way: using Ternary

//        System.out.println(a > 0 ? "The integer is positive" : "The integer is negative");

        String result = a > 0 ? "The integer is positive" : "The integer is negative";
        System.out.println("result = " + result);

        // If the condition is true, first part will be executed
        // If the condition is false, second part will be executed


        // Example: Type a code to print minimum of the values given (double data type).

        double b = 12 , c = 6;

        double minValue = b < c ? b : c;

        System.out.println("minValue = " + minValue);
        // In Java, Ternary is commonly used


        // Example: Check if the given number is a digit or not. Use ternary

         int d = 15;

        String result1 = d < 10 ? "Digit" : "Not a digit";
        System.out.println("result1 = " + result1);

        // The result of ternary operator should be stored in the same data type

    }
}
