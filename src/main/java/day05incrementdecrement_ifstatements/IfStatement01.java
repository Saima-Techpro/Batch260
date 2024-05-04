package day05incrementdecrement_ifstatements;

public class IfStatement01 {
    public static void main(String[] args) {

        // If statements are like conditional sentences in English
        // If it rains, picnic will be cancelled.



        /*
         if (condition) {
            this is the body part  (like result in English).
            This part contains codes
        }
         */

        if (3<8){  // condition is true, body will be implemented
            System.out.println("If you see this message, it means the condition is true");
        }

        if (3>8){  // condition is false, body will not be implemented
            System.out.println("If you see this message, it means the condition is true");
        }

        System.out.println("=====================");

        // Example: Print positive if the given number is greater  than zero or negative if the given number is less than zero

        int a = 34;

        if (a >0 ){
            System.out.println( a +" is a positive number");
        }

        if (a < 0 ){
            System.out.println( a +" is a negative number");
        }

        System.out.println("=======================");

        // Example: Print "Digit" on the console if the given number is a digit
        //  digits = 0-9

        int num = 15;

        if (num >= 0 && num <=9){
            System.out.println(num + " is a Digit");
        }

        int number = 0;

        if (number >=0 && number < 10){   // or condition can be written like this => 0 <= number <10
            System.out.println(number + " is a Digit");
        }

        // AND Operator &&: returns true if BOTH conditions are true
        // OR Operator || : returns true even if ONE condition is true


        // Example: Check if the given number has three digits
        int no = 149;
        if (no > 99  && no < 1000){
            System.out.println(no + " is a three digit number");
        }



    }
}
