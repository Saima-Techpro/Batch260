package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        // Example: Create an int array called 'ages' of size 6. Print them in Ascending order

        int[] ages = {12, 7, 22, 18, 5, 20};
        System.out.println("ages = " + Arrays.toString(ages)); // [12, 7, 22, 18, 5, 20]

        Arrays.sort(ages);
        System.out.println("ages after sorting = " + Arrays.toString(ages)); // [5, 7, 12, 18, 20, 22]

        // Get the min and max age from the array
        // 1st way:
        int minAge = ages[0];
        int maxAge = ages[ages.length-1]; // dynamic way of getting the last index

        // NOTE: with Strings, we use length() method to count the number of characters
        // NOTE: with Arrays, we use length property/field to count the number of characters

        System.out.println("minAge = " + minAge);
        System.out.println("maxAge = " + maxAge);


        // 2nd way:
        // [12, 7, 22, 18, 5, 20]
        // sorted ages =  [5, 7, 12, 18, 20, 22]

        int maximum = ages [0];
        int minimum = ages [0];

        for (int w : ages){
            maximum = Math.max(maximum, w);
             minimum = Math.min(minimum , w);
        }

        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);
        System.out.println(maximum + minimum);

        /*

        int max = Math.max(17, 8);
        System.out.println("max = " + max); // 17
        int min = Math.min(17,8);
        System.out.println("min = " + min);  // 8

         */


    }
}
