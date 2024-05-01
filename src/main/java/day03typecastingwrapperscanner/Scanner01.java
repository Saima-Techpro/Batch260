package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*
                      **** Scanner Class ****
           * Scanner class is used to get the input/values from the user
           * Why do we need this class?
           * Every application needs to interact with the users. (Calculator, ATM Machine, Bank, E-commerce app, social media etc.)
           * Users input / provide their data and that data goes into the application database.
           * Scanner class is used to get that data from the users.

         */

        // How to get the data from users?

        // Step 1:  Create an object from Scanner class
        // Type Scanner word, it will be red, hover over it, you'll see the option Scanner java.util, select that option
        // Scanner class will be imported from java.util library  => see line 3 above => import java.util.Scanner;

        // Class name      Object name   Assignment Operator    'new' keyword   Constructor (with parameters)    ;
        //    Scanner          input            =                   new            Scanner()              ;
            Scanner          input              =                   new            Scanner(System.in)              ;

            // Scanner Constructor works with a parameter => System.in


        // Step 2:  Give a message to the user about the data that you want to get
        System.out.println("Enter your name please");

        // Step 3:  Store that data provided by the user into your database

        String name = input.next();

        System.out.println("name = " + name);

        // HW TASK:  Ask user to provide their age and address, store and print it on the console


    }

}
