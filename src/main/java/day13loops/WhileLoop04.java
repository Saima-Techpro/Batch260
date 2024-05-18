package day13loops;

import java.util.Scanner;

public class WhileLoop04 {
    public static void main(String[] args) {

        // Interview Question
        // Type code to check if the given number is Palindrome or not
        // 121 => 121   313 => 313  123321 => 123321

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number to check if it is Palindrome or not");
        int number = scan.nextInt(); // original number

        // Step 1: change the number to String. so we can manipulate it
        String numberStr = String.valueOf(number); // now the number is in string data type
        String reversed = "";  // to store the reversed values

        // Step 2: Start the loop
        int i = numberStr.length()-1; // starting value

        while (i > -1){
            reversed  = reversed + numberStr.charAt(i);
            i--;
        }
        System.out.println("reversed = " + reversed);

        if (numberStr.equals(reversed)){
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is not a Palindrome");
        }


    }
}
