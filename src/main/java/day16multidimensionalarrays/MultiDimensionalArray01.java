package day16multidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        /*
        Multidimensional array means array inside an array.
        The most common one is two-dimensional array.

         */


        // How to create Multidimensional array?
        // 1st way:  non-flexible
        int[][] arr = new int[3][2];

        // How to print the Multidimensional array?

        System.out.println(Arrays.toString(arr));  // [[I@a09ee92, [I@30f39991, [I@452b3a41]


        System.out.println(Arrays.deepToString(arr));  // [[0, 0], [0, 0], [0, 0]]


        // How to add elements to a Multidimensional array?
        arr[0][0] = 8;
        arr[0][1] = 3;

        arr[1][0] = 34;
        arr[1][1] = 7;

        arr[2][0] = 2;
        arr[2][1] = 14;

        // arr[3][0] = 5;  // This is not possible, because we have a fixed length for outer array as 3.

        System.out.println(Arrays.deepToString(arr)); // [[8, 3], [34, 7], [2, 14]]


        // How to print the second element from a Multidimensional array?

        System.out.println("second element: " + Arrays.toString(arr[1])); // arr[1] => returns inner array =>  [34, 7]
        System.out.println("third element: " + Arrays.toString(arr[2])); // arr[2] => returns inner array =>  [2, 14]

        // How to print specific element from a Multidimensional array?

        System.out.println("Specific element: " +arr[2][0]);

        System.out.println("============================");
        // 2nd way:  flexible way of creating Multidimensional array

        String[][]  languages = new String[4][];
        System.out.println("languages = " + Arrays.deepToString(languages));  // [null, null, null, null]

        languages[0] = new String[]{"English", "Arabic"};
        languages[1] = new String[]{"Java", "C++", "Python", "SQL" };
        languages[3] = new String[] {"Spanish", "Turkish", "French"};
        languages[2] = new String[]{"JavaScript"};

        System.out.println("languages = " + Arrays.deepToString(languages)); // [[English, Arabic], [Java, C++, Python, SQL], [JavaScript], [Spanish, Turkish, French]]

        System.out.println("==========================");
        // How to print each inner array on the console one by one
        // [[English, Arabic], [Java, C++, Python, SQL], [JavaScript], [Spanish, Turkish, French]]

        for ( String[] innerArray : languages ){
            System.out.println(Arrays.toString(innerArray));
        }

        System.out.println("==========================");

        // How to print each element on the console one by one from inside a Multidimensional array>
        // [[English, Arabic], [Java, C++, Python, SQL], [JavaScript], [Spanish, Turkish, French]]

        for ( String[] innerArray: languages){
            if (innerArray == null){
                continue;
            }
            for (String each: innerArray){
                System.out.println(each);

            }
        }

        // 3rd way:  the most flexible way of creating Multidimensional array

        String[][] names = {{"Tom", "Ali"}, {"Jane"}, {"Henok", "Uranus", "Junaid"}, {"Jennifer", "Mel", "Jerry", "Judi"}};
        System.out.println("names = " + Arrays.deepToString(names));  // [[Tom, Ali], [Jane], [Henok, Uranus, Junaid], [Jennifer, Mel, Jerry, Judi]]

        // HW task:
        // Create a String Multidimensional array and print all values which contain "a"
    }
}
