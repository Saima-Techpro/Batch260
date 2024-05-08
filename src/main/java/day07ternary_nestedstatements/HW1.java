package day07ternary_nestedstatements;

import java.util.Scanner;

public class HW1 {

    /*
    Task 1: use nested TERNARY

    Ask user to enter a password

            If the initial of the password is uppercase
          Check if it is 'A' or not.
          If it is 'A' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; Ali ==> Valid password    -    Mark ==> Invalid

           If the initial of the password is lowercase
          Check if it is 'z' or not.
          If it is 'z' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; zoe ==> Valid password  -   john ==> Invalid

     */

    public static void main(String[] args) {
        // Task 1:
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your password please");

        String pwd = scan.next();
        char pwdInitial = pwd.charAt(0);

        String check = ( pwdInitial >= 'A' && pwdInitial <= 'Z') ? (pwdInitial == 'A' ? "Valid Password" : "Invalid Password") : (pwdInitial >= 'a' && pwdInitial <= 'z') ? (pwdInitial == 'z' ? "Valid Password" : "Invalid Password"):"Invalid Password";

        System.out.println(check);



    }
}
