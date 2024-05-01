package day03typecastingwrapperscanner;

public class TypeCasting01 {

    public static void main(String[] args) {

        // byte < short < int < long < float < double

        /*
        The action of converting primitive data types into each other is called "TypeCasting"

        1. Java automatically allocates the smaller data type into larger data type (e.g. short->int).
           This is called "Auto-widening".

        2. If we try to allocate the larger data type into a smaller data type, JAVA resists. Java doesn't
           automatically perform this action because of the risk of losing/damaging data.
            UNLESS we insist on this by declaring the data type on the right hand side of the assignment operator.
            This is called "Explicit Narrowing"

         */

        // Auto-widening
        byte a = 12;
        int b = a;

        // Explicit Narrowing
        int c = 25;
        short s = (short) c;


        // Example: Create an int data and assign it to byte data type

        int num1 = 34;
        byte num2 = (byte) num1;
        System.out.println(num2);


    }
}
