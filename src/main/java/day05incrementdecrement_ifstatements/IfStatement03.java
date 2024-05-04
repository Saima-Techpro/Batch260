package day05incrementdecrement_ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        // When we have two conditions, we use if else statement
        // When we have more two conditions, we use if, else if  and else statement

        /*
         SYNTAX:
         You can use aas many else if as you need
        if (){

        } else if () {

        } else if () {

        } else {

        }

         */

        // Example: Ask user to give the number of the day and check what day is it.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the day");

        int dayNumber = scan.nextInt();

        // 1st way:
        if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2){
            System.out.println("Tuesday");
        } else  if (dayNumber == 3){
            System.out.println("Wednesday");
        } else  if (dayNumber == 4){
            System.out.println("Thursday");
        } else  if (dayNumber == 5){
            System.out.println("Friday");
        } else  if (dayNumber == 6){
            System.out.println("Saturday");
        } else  if (dayNumber == 7){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number!");
        }


        // 2nd way: Recommended

        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid day number!");
        } else if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2){
            System.out.println("Tuesday");
        } else  if (dayNumber == 3){
            System.out.println("Wednesday");
        } else  if (dayNumber == 4){
            System.out.println("Thursday");
        } else  if (dayNumber == 5){
            System.out.println("Friday");
        } else  if (dayNumber == 6){
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
















    }
}
