package day13loops;

public class WhileLoop01 {
    public static void main(String[] args) {

        /*
                    *** Syntax for loop ***
          for(starting value ; condition ; increment/decrement){

                loop body => contains the codes to be executed
          }

                    *** Syntax for while loop ***
        starting value is declared outside the loop body;

         while (condition){
            loop body => contains the codes to be executed
            increment/decrement;
         }
         */

        // Print the numbers from 2 to 9 on the console

        // 1st way: using for loop
        for (int i = 2; i < 10; i++) {
            String str = "";
            System.out.println(i);
        }

        System.out.println("======= solution with while loop ========");
        // 2nd way: using while

        int i = 2; // starting value

        while (i <10){
            System.out.println(i); // codes to be executed inside the body of the loop
            i++; // increment/decrement inside the loop body
        }
        System.out.println("=======================");
        // Print even numbers from 61 to 49

        int m = 62;  // staring value

        while (m > 49) {
            if (m%2==0){
                System.out.println(m);
            }
            m--;
        }

        System.out.println("=======================");

        // Example: Type code to print the sum of integers from 12 to 43

        int x = 12;  // starting value
        int sum = 0; // to store the result of addition
        while ( x < 44){
             sum = sum + x;
             x++;
        }
        System.out.println("sum = " + sum); // 880


    }
}
