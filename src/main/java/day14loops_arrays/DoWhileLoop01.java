package day14loops_arrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        /*
        Example: Accept input from user:

    1.	If password and username are correct: print "Welcome to your account"
    2.	If username and password are incorrect; print 4 times "Enter your username and password"
    3.	If username and password are incorrect fifth time as well, print "Account is blocked"

    4.	Valid credentials => username= ""admin""    password= "pwd123"

         */

        Scanner scan = new Scanner(System.in);

        int numOfTrials = 1;

        do {
            if (numOfTrials == 5){
                System.out.println("Your account is blocked!");
                break;
            }
            System.out.println("Enter your username please");
            String username = scan.next();

            System.out.println("Enter your password please");
            String password = scan.next();

            numOfTrials++;

            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("Welcome to your account!");
                break;
            }

            System.out.println("Username and Password don't match! Please enter correct credentials");
            System.out.println("Warning! This is your " + numOfTrials + " attempt!");


        }while (true); // this creates an infinite loop because the condition never turns false
                        // So in order to prevent infinite loop, we added if statements and break keyword.


    }
}
