package day02variablesconcatenation;

import java.util.Arrays;

public class Variable02 {
    public static void main(String[] args) {
        //      COMPARISON OPERATORS

        /*
        They're mostly used in Conditional statements.
        EQUAL TO: '=='  => represents equality in JAVA
                  '=' is called ASSIGNMENT OPERATOR => takes the data from the right the side and assigns it to the left side (to the variable)

        NOT EQUAL TO: '!='  => represents not equal in JAVA
        myAge = 30; // assignment operator

        myAge == 30
        myAge != 30

        GREATER THAN:   '>'   => 9>5
        LESS THAN :     '<'   => 5<10

        GREATER THAN or EQUAL TO: '>='    =>  18>=16
        LESS THAN or EQUAL TO:    '<='    =>  14<=19

        //    MATHS OPERATIONS

        Addition: +
        Multiplication: *
        Subtraction: -
        Division: /

        // If there's parenthesis in the code line, the operation inside the parenthesis will be done first.
        // Multiplication / division operations have first priority
        // Addition / subtraction have the second priority

        16/4*(2+6) = 32

        30-4+6*9 = 80


        //     LOGICAL OPERATORS

        OR sign: '||'  this is used for filtration (at least one of the conditions should be fulfilled)
        AND sign: '&&' this is used for filtration (BOTH of the conditions should be fulfilled)

         */

//        boolean b1 = true;
//        boolean b2 = true;
//        boolean b3 = false;
//        boolean b4 = 5>9;

        boolean b1 = true , b2 = true, b3 = false , b4 = 5>9;

        System.out.println(b1 || b2); // true
        System.out.println(b1 || b3); // true
        System.out.println(b1 && b2); // true
        System.out.println(b1 && b3); // false
        System.out.println(b3 && b4); // false

        // OR Operator is quite generous. Even if one condition is fulfilled, it returns the data
        // AND Operator is quite strict. Even if one condition is NOT fulfilled, it does NOT return the data

        System.out.println("========================");
        boolean a = 10 > 6; //TRUE
        boolean b = 2 + 3 != 5; // FALSE
        boolean c = 2 + 3 * 5 >= 19;

        System.out.println(a && b); //FALSE
        System.out.println(a  || b || c);//TRUE





    }
}
