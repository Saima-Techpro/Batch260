package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        /*
        Syntax of nested for loop

        for (){
            for (){

            }
        }

         */

        /*
        Example: Type the code to print following pattern:
        Week: 1
            Day: 1
            Day: 2
            Day: 3
            ....
        Week: 2
            Day: 1
            Day: 2
            Day: 3
            ....
         Week: 3
            Day: 1
            Day: 2
            Day: 3
            ....

         */

        for (int i = 1; i < 5; i++) { // outer loop tp print weeks

            System.out.println("Week: " +  i);
            for (int j = 1; j < 8; j++) {  // nested loop for days
                System.out.println("  Day: " + j);
            }

        }

        /*
        NOTES:
        Once the outer loop starts running after the checking the condition, Java enters the loop body.
        and executes the codes.
        When it enters the nested loop, it checks the condition, if condition is true, it enters the body of the
        nested loop ... runs it as long as the condition to break the nested loop is not met.
        Once the condition to break the nested loop is met, Java comes OUT of the nested loop.
        But it still is INSIDE the outer loop body.
        And the whole process to check the condition if it is true or not.... starts again

        Outer loop is broken when the condition in the outer loop is met

         */


//        Example: Print the following pattern on the console:
//                    * * * *
//                    * * * *
//                    * * * *
//                    * * * *

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print!");
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns you want to print!");
        int columns = scan.nextInt();

        for (int i=1; i <= rows; i++){

            for (int k = 1; k<=columns; k++){
                System.out.print("* ");
            }
            System.out.println();  // This is used just to send the cursor to the next line
        }


    }
}
