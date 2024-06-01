package javapractice.Practice04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Q01_ArrayList {
    public static void main(String[] args) {

        /*
        Create a list containing 200 positive integers less than the value 1000.
        Ask the user for a number and tell the user whether if it is in the list or not.
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        Random ran = new Random();

        // 1st Way
        /*
        for (int i=0; i<200; i++){

            int num = ran.nextInt(1000);
            numbers.add(num);

        }
         */


        // 2nd Way
        /*
        int counter = 0;
        while (counter<200){
            int num = ran.nextInt(1000);

            if (!numbers.contains(num)){
                numbers.add(num);
                counter++;
            }

        }
         */


        // 3rd Way
        while (numbers.size()<=200){
            int num = ran.nextInt(1000);

            if (!numbers.contains(num))
                numbers.add(num);
        }


        System.out.println(numbers);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int input = scan.nextInt();

        if (numbers.contains(input)){
            System.out.println("The list contains this number!");
        }else{
            System.out.println("The list does not contain this number.");
        }





    }
}
