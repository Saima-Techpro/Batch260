package day14loops_arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        byte b = 3;
        int i = 45;
        double d = 23.99;
        String str = "Java is interesting!" ;

        /*
        When we create byte, short, int, double, String etc. variables, we can store only SINGLE value at a time.
         Java provides a special structure to store MULTIPLE values in the same variable (container).
         That is called Arrays class.

         1. Arrays can store multiple values.
           e.g. you can store multiple student names in the same variable / container.
         2. Arrays allow to  store multiple values that belong to SAME data type.
           e.g. int array will store only int values
         3. To create array, we need to specify two things =>  a) data type      b) the size
         4. Arrays are faster because they have fix size structure
         5. Arrays use less memory because they have fix size structure
         6. Arrays can store both Primitive data type object references as well (references of Non-Primitive data type
            such as Strings and Wrapper classes)

         */

        // How to create Arrays
        // 1st: Recommended
        String[]  stdNames  = new String[3];

        // 2nd:
        String teacherNames[] = new String[5];


        // How to print the arrays on the console
        System.out.println("stdNames = " + stdNames); // [Ljava.lang.String;@a09ee92  => reference of the arrays

        System.out.println( Arrays.toString(stdNames));  // [null, null, null]  => the default value of non-primitive is null

        int[] x = new int[5];
        System.out.println(x);  // [I@30f39991
        System.out.println(Arrays.toString(x));  // [0, 0, 0, 0, 0] => the default value of primitive is zero


        // Create an array to store 5 names and allocate the names as well

        String[] names = new String[5];
        System.out.println(Arrays.toString(names)); // [null, null, null, null, null]

        names[0] = "John";
        names[3] = "Mary";
        names[2] = "Husnu";
        names[1] = "Junaid";
        names[4] = "Nataliya";

        System.out.println(Arrays.toString(names));  // [John, Junaid, Husnu, Mary, Nataliya]

        // How to print a specific value on the console?
        String specificName = names[3];
        System.out.println(specificName);  // Mary



    }
}
