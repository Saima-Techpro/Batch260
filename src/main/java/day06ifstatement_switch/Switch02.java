package day06ifstatement_switch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        // Example: when user enters the number of the month, print the name of that month and ALL the months AFTER that.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the month");
        short monthNumber = scanner.nextShort();

        switch (monthNumber){  // switch statement works with byte, short, int, char, String
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("There is no " + monthNumber + " number of the month in a year!");

        }



    }
}
