package day06ifstatement_switch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*  Notes about Switch Statement
        1. Switch Statement is also used for conditional situations.
        2. Switch Statement works just like if - else if  - else but it has SIMPLER syntax
        3. We don't  write if (), instead we write switch ()

        What's the main difference?
        a) The order of the values / conditions doesn't matter in Switch Statement
        b) In Switch statement, Java keeps executing the codes even AFTER true condition is met.
           We need 'break' keyword to stop the execution in Switch Statement.
           But in if statement, Java automatically stops execution once it finds true condition.
        c) Switch statement works with byte, short, int, char, String data types only.
           If statements have no such limitation.




         */

        // Create a code to print day numbers based on the day name

        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter a day of the week");
        String dayName = scan.next();


        // 1st way: if - else if  - else  => not recommended because of repetition

        if (dayName.equalsIgnoreCase("Monday")){
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(7);
        } else {
            System.out.println("Please provide a valid name of the weekday!");
        }


        // 2nd way: SWITCH STATEMENT  => have simpler syntax
        // Syntax of Switch statement:

        /*

        switch (variableName){
            case data1:
                codes to be executed
                break; // Optional.... makes Java stop execution  => used only when and where required
            case data2:
                codes to be executed
                break;
            case data3:
                codes to be executed
                break;
            case data4:
                codes to be executed
                break;
            case data4:
                codes to be executed
                break;
            default:
                codes to be executed
        }

         */

        switch (dayName.toLowerCase()){
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:  // is used to execute codes when none of the condition stated above match
                System.out.println("Provide a valid name of the weekday!");

        }

        /*
In computer programming, a sentinel value (also referred to as a flag value, trip value, rogue value, signal value, or
dummy data) is a special value in the context of an algorithm which uses its presence as a
condition of termination, typically in a loop or recursive algorithm.
 */



    }
}
