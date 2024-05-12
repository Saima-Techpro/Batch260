package day10string_manipulations;

import com.sun.source.tree.ClassTree;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
        Example: Convert all the digits into "*" in a card number except last 4 digits.
                //  1234 6789 1234 6789 ==> **** **** **** 6789

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your card number");

        String cardNum = scan.nextLine();

        String firstPart = cardNum.substring(0, 15).replaceAll("[0-9]", "*");  // starting index=0 is inclusive; ending index = 14 here is exclusive

        System.out.println("firstPart = " + firstPart);


        String secondPart = cardNum.substring(15);
        System.out.println("secondPart = " + secondPart);


//        String result = firstPart + " "+ secondPart ;  // use a string to add space if you used index 14 to get the firstPart => cardNum.substring(0, 14)

        String result = firstPart + secondPart ;
        System.out.println("result = " + result);

        System.out.println("using concat method= " + firstPart.concat(secondPart));


    }
}
