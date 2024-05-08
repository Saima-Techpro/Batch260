package day07ternary_nestedstatements;

import java.util.Scanner;

public class HW2 {

    /*
          Task 2: Use  nested If Statement and nested Ternary both

     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary

     Hint: length() method is used to count the length of a String


     */

    public static void main(String[] args) {

        //  Task 2:

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your password please");

        String pwd = scan.next();

        // Nested If

        if (pwd.length() < 1) {
            System.out.println("Password cannot be empty!");
        } else {
            char initials = pwd.charAt(0);
            String result = "";

            if (pwd.length() > 8) {
                result = initials == 'i' ? "Valid Password" : "Invalid Password";
            } else if (pwd.length() < 9) {
                result = initials == 'K' ? "Valid Password" : "Invalid Password";
            }
            System.out.println("result: " +result);
        }


        // Nested Ternary

        String result1 = pwd.length() < 1 ? "Password cannot be empty!" :
                         pwd.length() > 8 ?
                        (pwd.charAt(0) == 'i' ? "Valid Password" : "Invalid Password") :
                        (pwd.length() < 9 ? (pwd.charAt(0) == 'K' ? "Valid Password" : "Invalid Password") : "Invalid Password");

        System.out.println("result1: " +result1);


    }
}
