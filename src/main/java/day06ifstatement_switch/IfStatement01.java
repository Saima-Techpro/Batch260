package day06ifstatement_switch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        // Example: Based on the age entered by the user, print one of the following messages:
        // 0-4 => infant
        // 5-12 => child
        // 13-20 => teen
        // 21-40 => adult
        // 41+  => middle age

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age!");

        int age = scan.nextInt();

        // 3 mins

        // 1st way:

        if (age<=0 || age > 130){
            System.out.println("Invalid age");
        } else if(age<5){
            System.out.println("Infant");
        } else if(age>=5 && age<13) {
            System.out.println("Child");
        } else if(age>=13 && age<21){
            System.out.println("Teen");
        } else if (age>20 && age<41){
            System.out.println("Adult");
        } else if (age>40) {
            System.out.println("Middle Age");
        }


        // 2nd way:

        if (age<=0 || age > 130){
            System.out.println("Invalid age");
        } else if (age < 5) {
            System.out.println("Infant");
        } else if (age < 13) {
            System.out.println("Child" );
        } else if (age < 21) {
            System.out.println("Teen");
        } else if (age < 41) {
            System.out.println("Adult");
        }else {
            System.out.println("Middle age");
        }



    }
}
