package day12loops;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        // Example: Type code to find the sum of the Unique digits in the given integer
        // 1232 => 1+3 => 4
        // HINT:  Use valueOf() OR parseInt() method to extract the numerics from String data type to do addition
        // Both methods are performing the same function => extracting numerical value out of String
        // But valueOf() is broader




        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an Integer!");
        String num = scan.next();             // We store data in String variable because it's easier to manipulate data in String data type

        int sum =0;

        for (int i = 0; i < num.length(); i++) {   // i+1

           String  digit = num.substring(i, i+1);  // Dynamic
            if (num.indexOf(digit) == num.lastIndexOf(digit)){

                sum = sum + Integer.parseInt(digit);  // OR Integer.valueOf(digit)
            }

        }

        System.out.println("sum = " + sum);

        System.out.println("========= Following example doesn't involve user input ");
        // Type code to multiply counting numbers from 3 to 8 using loops

        int multiplication = 1;

        for (int i = 3; i < 19; i++) {

            multiplication = multiplication * i;

        }
        System.out.println("multiplication = " + multiplication); // 20160


    }
}
