package day03typecastingwrapperscanner;

public class Wrapper01 {
    public static void main(String[] args) {

        /*
        // Primitive data types =>  byte < short < int < long < float < double

        1) Primitive data types allows to store values, but they don't have methods.
           In order to do any data manipulation, we need methods. Java solved this problem
           by creating WRAPPER Classes for Primitive data types.
             byte   =>   Byte
             short  =>  Short
             int    =>  Integer
             long   =>  Long
             float  =>  Float
             double =>  Double
           WRAPPER Classes for Primitive data types provide us values as well methods.

           NOTE: Wrapper classes are Non-Primitive data type.  (values+methods)

           => When we convert primitive data into its wrapper class, it's called "Auto-boxing"
              Java performs this action automatically.

           => When we convert wrapper class into its primitive data , it's called "Un-boxing"
              Java performs this action automatically too.

         */

        int a = 10;

        // a.  => no methods are accessible because a has primitive data type
        Integer b = 15;

        // b.  => many methods are accessible because b has WRAPPER class of int data type

        char c = 'L';
        Character d = c ;  // Auto-boxing

        Short s = 24;
        short sh = s;  // Un-boxing

        // How to get the minimum and maximum values of numeric data type in Java?
        // Integer
        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of Integer: " +  Integer.MIN_VALUE);

        // Byte

        System.out.println("Max value of Byte: " + Byte.MAX_VALUE);
        System.out.println("Min value of Byte: " + Byte.MIN_VALUE);

        // Character

        System.out.println("Max value of Character: " + Character.MAX_VALUE);
        System.out.println("Min value of Character: " + Character.MIN_VALUE);

        // Example: Create two variables to store total amount of money and number of people in a team.
        // Calculate the amount each teammate gets. Print it on the console.
        // amount = 90
        // num of players: 12

        int amount = 90;
        int numOfPlayer = 12;

        System.out.println("Each teammate gets: "  + amount/numOfPlayer); // 7 =>  we were expecting 7.5 where is the decimal part gone?

        // when both variables have int data, the result will be returned in int data type as well (decimal part will be removed)

        float amount1 = 90; // let's try with different data type

        System.out.println("Per teammate: " + amount1/numOfPlayer);  // float/int
        // NOTE: When both variables g=have different data types, result will be returned in the larger data type


        double result = (double) amount /  numOfPlayer; // the division operation will return us int, but we have to insist by adding (double)
                                                       // so Java can assign the value to result container which had double data type
        System.out.println("result = " + result);

        // combination of int and short
        short numOfPlayers = 12;

        System.out.println("Different combination: " + amount/numOfPlayers);


    }
}
