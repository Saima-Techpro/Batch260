package day08string_manipulations;

import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {

        /*
        Example: Check the given password by user and validate with following criteria...
            i) must contain at least 8 characters
            ii) must not contain space characters
            iii) must contain at least one uppercase
            iv) must contain at least one lowercase
            v) must contain at least one digit

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password please!");
        String password =  scan.nextLine();

//        i) must contain at least 8 characters

        boolean passwordLength = password.length() >= 8;
        System.out.println("passwordLength = " + passwordLength);

//        ii) must not contain space characters
        boolean spaceCheck = password.replaceAll("[^ ]", "").length() == 0;
        System.out.println("spaceCheck = " + spaceCheck);

//        iii) must contain at least one uppercase
        boolean upperCaseCheck = password.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("upperCaseCheck = " + upperCaseCheck);

//        iv) must contain at least one lowercase

        boolean lowerCaseCheck = password.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("lowerCaseCheck = " + lowerCaseCheck);

//        v) must contain at least one digit
        boolean digitCheck = password.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("digitCheck = " + digitCheck);

        // In order for the password to be accepted, ALL above conditions need to be true

        boolean isValid = passwordLength && spaceCheck && upperCaseCheck && lowerCaseCheck && digitCheck;

        if (isValid){
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid!!");
        }

        // Ternary

        String passwordAccepted = isValid ? "Valid" : "Invalid";
        System.out.println("Password Accepted? " + passwordAccepted);


    }
}
