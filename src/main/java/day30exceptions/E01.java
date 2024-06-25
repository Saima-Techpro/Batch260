package day30exceptions;

public class E01 {
    public static void main(String[] args) {

        /*
        1)"Exception" means un-expected issues in code executions (e.g. divide by zero)
        2)There are two ways to work with Exceptions
            i)  Using try-catch block: Handling Exception
            ii) Throw Exception and block the application
        3) If you do not handle the Exception, Java stops execution and the application is blocked.
        4) "try" can be used with a "single" or "more" catch blocks
        5) "try" "cannot" be used "alone"

        Try block is like asking for help when something unexpected happens in the coding.
        So it doesn't block the application.
        Exceptions are not errors.

         */

        // Method call
        //divide(12,4); // 3
        //divide(8,0); // ArithmeticException is thrown and execution stops completely UNLESS we handle it.
        divide2(6,0);
    }


    public static void divide(int a, int b){
        if (b==0){
            System.out.println("Division is not possible by zero");
        }else {
            System.out.println("division = " + a / b);
            System.out.println("Division is successful!");
        }
    }  // This if statement work, but it is NOT recommended because it can't take care of all possible Arithmetic problems.


    public static void divide2(int a, int b){

        try {
            System.out.println("division = " + a / b);
            System.out.println("Division is successful!");

        }catch (ArithmeticException e){
            System.out.println("Please don't divide by zero");

        }

        System.out.println("And the system carries on.... ");



    }

}
