package day14loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        // Guess the number game!


        // 1st step: Create a random number using Random class object
        Random random = new Random();  // Creating object from Random class
        int randomNum = random.nextInt(101);
        // System.out.println("randomNum = " + randomNum);

        Scanner scan = new Scanner(System.in);

        int enteredNum;

        int counter = 0;

        boolean isGuessed = false;   // Creating this variable to act like a switch

        do {
            System.out.println("Enter a number from 0 - 100 ");
            enteredNum = scan.nextInt();

            counter++;

            if (enteredNum < randomNum){
                System.out.println("The number you entered is smaller than the given number");

            } else if (enteredNum > randomNum) {
                System.out.println("The number you entered is greater than the given number");

            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                System.out.println("You guessed the number in " + counter + " attempts");
                isGuessed = true;  // it works just like break keyword
            }

        }while (!isGuessed);



    }
}
