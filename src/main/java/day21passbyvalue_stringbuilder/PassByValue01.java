package day21passbyvalue_stringbuilder;

import java.util.Arrays;


public class PassByValue01 {
    public static void main(String[] args) {

        /*
        When we use a variable inside a method, Java creates copy of that variable and
        uses it for any further manipulations.
        Java protects the original value of String variable.
        If this property didn't exist, it will change the value of the variable every method use, which is not good.

        Example: Original Price of a shirt is 100 => there's 10% discount for seniors, 10% discount for students,
        20% discount for veterans etc.
        int price = 100;

        This is called "Pass By Value". This feature helps Java protect the original values.

        Java does not allow "Pass By Reference". Because with the address / reference, the original data is accessible
        and changeable. Which allows data manipulation directly.

        In multi-structure data type, data can be updated / manipulated directly,
        and the reference/ pointer is changed to new value.

        "Pass By Value" is very important for two reasons:
        1) Security => prevents data changes without control; increases security by keeping original values.
        2) Performance => by preventing address changes, operations are performed faster.


         */
        String str = "Java";
        System.out.println("Original: " +str); // Java

        // method call
        method1(str);  // JAVA
        System.out.println("Original: " + str); // Java

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]

        // method call
        method2(arr);  // [1, 5, 8]
        System.out.println(Arrays.toString(arr));  // [1, 5, 8]

    }

    private static void method1(String s){
        s = s.toUpperCase();
        System.out.println("Method call: " +s);
    }

    private static void method2 (int[] a){
        a[1] = 5;
        a[2] = 8;
        System.out.println("Method call: " + Arrays.toString(a));
    }



}
