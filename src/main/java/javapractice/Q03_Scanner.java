package javapractice;

import java.util.Scanner;

public class Q03_Scanner {
    public static void main(String[] args) {
        /*
        Example: Ask user to enter first name and last name. Print their initials.
         Tom Hanks  => TH
         Create only one variable to store both firstname and last name

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name");

        String fullName = scan.nextLine();

        // 1st solution:
//        String initials = fullName.replaceAll("[^A-Z]", "");
//        System.out.println("Initials = " + initials);
        // The above solution is very good if the user follows the rules for Uppercase for nouns.
        // But that's not always possible. So in that case, we have to think of a solution which will work
        // for all inputs

        // 2nd solution:
        // System.out.println("first initial = " + fullName.charAt(0));  // Tom Hanks
        // System.out.println("last initial = " + fullName.charAt(4));  // Hard coding => it works for Tom Hanks but not for all values


        // Proper solution
        char fistChar= fullName.charAt(0);

        char lastChar = fullName.split(" ")[1].charAt(0);

        // System.out.println(fistChar + lastChar); // 156 => char data type converts characters to their ASCII values

        System.out.println(fistChar + "" +lastChar);

    }
}
