package day05incrementdecrement_ifstatements;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {

        // Check the name of the weekday given by user, print if it is 'weekend' or 'weekday'
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the day of the week");

        String dayName = scan.next();

        // equals() method to check the two Strings if they're equal or not
        // equals() method is case sensitive
        // with string, we use equal() method, with numeric data type, we use  "=="

        // 1st way:  if - else if - else
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
            System.out.println("Invalid name of the day!");
        }

        // 1st way compares works fine. But there's a lot of repetition and Java has to work a lot.
        // In order to make Java work less, we recommend using 2nd way.
        // 2nd way:  RECOMMENDED

        boolean weekendCondition =  dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        boolean weekdayCondition = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                                    || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                                    || dayName.equalsIgnoreCase("Friday");

        if (weekendCondition){
            System.out.println("Weekend");
        } else if (weekdayCondition) {
            System.out.println("Weekday");

        } else {
            System.out.println("Invalid name of the day!");
        }

        /*
        boolean weekendCondition =  dayName.equals("Saturday") || dayName.equals("Sunday");

        boolean weekdayCondition = dayName.equals("Monday") || dayName.equals("Tuesday")
                                    || dayName.equals("Wednesday") || dayName.equals("Thursday")
                                    || dayName.equals("Friday");

        if (weekendCondition){
            System.out.println("Weekend");
        } else if (weekdayCondition) {
            System.out.println("Weekday");

        } else {
            System.out.println("Invalid name of the day!");
        }

         */







    }
}
