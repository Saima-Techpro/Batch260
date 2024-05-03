package day04scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        // Ask user to enter following credentials:
        // Firstname and lastname
        // Age
        // Height
        // Weight
        // Marital status => married, unmarried, do not want to mention

        // Step 1: Create scanner object

        Scanner scan = new Scanner(System.in);

        // Step 2: Give message to the user about the values that you need
        System.out.println("Enter your First name and Last name please");

        // Step 3: Store those values provided by the user (using Scanner object and next methods)

        String fullName = scan.nextLine();  // nextLine() method didn't cause any problem at this step

        System.out.println("Enter your age");
        byte age = scan.nextByte();

        System.out.println("Enter your height");
        float height = scan.nextFloat();


        System.out.println("Enter your weight");
        float weight = scan.nextFloat();

        scan.nextLine();  // add this empty method to take care of hidden new line character '\n'

        System.out.println("Enter your marital status");
        String maritalStatus = scan.nextLine();  // nextLine() method is causing a problem here at this step

        /*
        When nextLine() method is used after NUMERIC input, it causes a problem because of hidden '\n' value
        passed down to the next line. It stops the data flow and assigns next line character '\n' to the String
        input field.

        How to fix the problem?

        1. Don't use nextLine() method after numeric methods. Use next() instead.
        2. If you must use nextLine() method for some reason, add an empty scan.nextLine() in the flow.
           This will take care of the next line character '\n' and your normal scan.nextLine() method wil work fine

         */


        System.out.println("Full Name = " + fullName);
        System.out.println("Age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);



        /*
        JAVA LIBRARY: Standard Java libraries are made available for our project
        java.util => all utility classes => Scanner, Arrays, Maps, Sets, Lists
        java.lang  => System, String, Object
        java.sql => database operations like connection
        java.io => used for File operations


        There are 3rd party external libraries as well:
        Selenium
        Apache Maven
        JavaFX, UI
        Hibernate

         */


    }
}
