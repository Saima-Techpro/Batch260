package day13loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        /*
                    *** Syntax for While loop ***
        starting value is declared outside the loop body;

         while (condition){
            loop body => contains the codes to be executed
            increment/decrement;
         }
                    *** Syntax for Do While loop ***
                 starting value;
                 do {
                 loop body => codes to be executed

                 } while (condition);

         */

        int i = 1;
        while (i<1){
            System.out.println("While Loop");
            i++;
        }

        // While loop will not run even once in above example because the condition is false in the first check
        // Nothing will be printed.
        // Zero execution is possible in While loops.
        // While loop is wise :) it thinks first, and acts later.

        int k = 1;

        do {
            System.out.println("Do while loop ");

            k++;

        } while(k<1);

        // Do While loop will run the codes at least ONCE  before checking the condition.
        // Message will be printed at least ONCE .
        // Zero execution is NOT possible in Do While loops.
        // Do While loop acts first, and thinks later.
        // It checks the condition AFTER executing the codes at least ONCE.
        // It is used in situations like ATMs or games etc.

        System.out.println("=========================");

        // Example: Print the numbers from 3 to 9 on the console

        int x = 3;

        while ( x < 10) {
            System.out.print(x + " ");  // infinite loop will be created if we don't add increment or decrement part
            x++;
        }
        System.out.println();
        System.out.println("========== Using Do While Loop ==============");
        // Using Do While Loop
        int y = 3;

        do {
            System.out.print(y + " ");

            y++;

        } while (y<10);






    }
}
