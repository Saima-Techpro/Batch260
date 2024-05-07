package day07ternary_nestedstatements;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        condition ? part-for-true : part-for-false;   => Ternary syntax

        condition ? ( condition ? true : false ) : ( condition ? true : false ) ;  => Nested Ternary

         */

        // Find out if the given year is LEAP YEAR or not. Use Ternary.
        // divisible by 100; it must be divisible by 400
        // not divisible by 100; it must be divisible by 4

        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        String leapYear = (year%100 == 0) ? (year%400==0 ? "Leap Year" : "Not a Leap Year") : ( year%4 == 0 ? "Leap Year" : "Not a Leap Year");

        System.out.println("leapYear? " + leapYear);


    }
}
