package day06ifstatement_switch;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        // If the user is female and older than 60, print "You can retire!"
        // If the user is male and older than 65, print "You can retire!"


        Scanner scan = new Scanner(System.in);
        System.out.println("Please tell us your gender");
        String gender = scan.next();

        System.out.println("Please enter your age!");
        short age = scan.nextShort();

        if (age< 0 ){
            System.out.println("Age cannot be less than 0");
        } else if (gender.equalsIgnoreCase("female")){
            if (age>60){  // this is nested if statement
                System.out.println("You can retire!");
            } else {
                System.out.println("Keep working! You can't retire yet!");
            }



        } else if (gender.equalsIgnoreCase("male")){

            if (age>65){
                System.out.println("You can retire!");
            } else {
                System.out.println("Keep working! You can't retire yet!");
            }




        } else {
            System.out.println("Please define your gender");
        }










    }
}
