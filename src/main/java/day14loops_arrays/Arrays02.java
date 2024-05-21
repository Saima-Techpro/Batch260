package day14loops_arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

       // Example: Create an int array with size 7 and print the sum of the first and last number

        int[] numbers = new int[7];
        numbers[0] = 15;
        numbers[1] = 34;
        numbers[2] = 8;
        numbers[3] = 54;
        numbers[4] = 22;
        numbers[5] = 77;
        numbers[6] = 49;
        System.out.println("numbers: " + Arrays.toString(numbers));  // [15, 34, 8, 54, 22, 77, 49]

        System.out.println( numbers[0] + numbers[6]);

        // Example: Create cities Array with the size of 5  and allocate names of the cities to the array
        // Print them on the console

        String[] cities = new String[5];
        cities[0]= "Paris";
        cities[1]= "Istanbul";
        cities[2]= "Miami";
        cities[3]= "Roma";
        cities[4]= "Lisbon";

        System.out.println(Arrays.toString(cities));  // [Paris, Istanbul, Miami, Roma, Lisbon]

        // How to print the values one by one
        // loops

        // 1st : for loop
        for (int i=0; i< cities.length; i++){  // with arrays, we cannot use length() method, we use only length.
            System.out.println(cities[i]);
//           String namesX= cities[i];
//            System.out.println(namesX);
        }

        System.out.println("====== Using for each loop =======");

        //Note: To get the number of characters from a String use "length()".
        //      To get the number of elements from an Array use "length".


        // 2nd: for-each loop => enhanced version of loops ... commonly used in Arrays and Collections
        /*
         for (returndataType nameOfTempContainer : nameoftheVariable){
                    loop body => codes to execute
         }
         */

        // String[] cities = new String[5];
        // [Paris, Istanbul, Miami, Roma, Lisbon]

        for (String w : cities){
            System.out.println(w);
        }

        // Create a double array and find the sum of all prices
        // Use for-each loop

        double[] prices= new double[5];
        prices[0]=12.5;
        prices[1]=10.45;
        prices[2]=15.5;
        prices[3]=18.5;
        prices[4]=20.55;
        System.out.println(Arrays.toString(prices)); // [12.5, 10.45, 15.5, 18.5, 20.55]

        double sum=0;
        for (double w: prices){
            sum = sum + w;
        }
        System.out.println("sum = " + sum);  // 77.5




    }
}
