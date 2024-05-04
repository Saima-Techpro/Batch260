package day05incrementdecrement_ifstatements;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {

        // Check the name given by user, print if it is 'weekend' or 'weekday'


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the day of the week");

        String dayName = scan.next();

        // equals() method to check the two Strings if they're equal or not
        // equals() method is case sensitive

        // 1st way:
        if (dayName.equals("Monday")){
            System.out.println("Weekday");

        } else if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");

        } else if (dayName.equals("Wednesday")) {
            System.out.println("Weekday");

        }else if (dayName.equals("Thursday")) {
            System.out.println("Weekday");

        }else if (dayName.equals("Friday")) {
            System.out.println("Weekday");

        }else if (dayName.equals("Saturday")) {
            System.out.println("Weekend");

        }else if (dayName.equals("Sunday")) {
            System.out.println("Weekend");

        } else {
            System.out.println("Invalid name of the day");
        }






    }
}
