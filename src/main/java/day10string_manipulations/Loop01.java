package day10string_manipulations;

public class Loop01 {
    public static void main(String[] args) {

        // Print "Hi" 5 times on the console

        System.out.println("Hi");  // 1
        System.out.println("Hi");  // 2
        System.out.println("Hi");  // 3
        System.out.println("Hi");  // 4
        System.out.println("Hi");  // 5

        System.out.println("========================");
        // The aim is to write HIGH QUALITY and CLEAN CODE

        /* JAVA Principle: AVOID REPETITION

         1. Java created special structure called LOOPS to avoid REPETITION.
         2. We can handle repetitive tasks by using loops and specific conditions

         We have 4 types of loops:
         1.  for loop  2. while loop   3. do while loop   4. for each loop

         syntax for "for loop"

         for (startingValue; condition to stop the loop; increment/decrement){

                    loop body
         }

         */

        for (int startingValue = 1; startingValue < 6; startingValue++ ){

            System.out.println("Hi");
        }

        System.out.println("==================");
        // Print the numbers from 20 to 8

        for (int i = 20;  i>17;       i--){


            System.out.println(i);
        }


        System.out.println("==================");

        // Print all even numbers from 3 to 10


        for (int x = 3;   x < 11;           x++){


            if (x%2 == 0){

                System.out.println(x);
            }
        }



        // HW TASK:
        // 1. Print all odd numbers from 6 to 19
        // 2. Type odd integers from 68 to 13 in the same line with a space between consecutive integers.
        // 3. Type all integers which are divisible by 4 and not divisible
        //  by 6 from 120 to 11 in the same line with a space between consecutive integers







    }
}
