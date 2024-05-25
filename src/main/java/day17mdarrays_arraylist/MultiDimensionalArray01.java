package day17mdarrays_arraylist;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        // Convert an int multidimensional array into a single int array

        int[][] arr = {{5, 4, 3}, {8,2}, {3, 7, 9}};

        // [[5, 4, 3], [8, 2], [3, 7, 9]] => [5, 4, 3, 8, 2, 3, 7, 9]
        System.out.println("arr = " + Arrays.deepToString(arr)); // [[5, 4, 3], [8, 2], [3, 7, 9]]

        // Step 1: As Arrays are fixed size structure, we need to know the size of the given array
        // Step 2: Using that size, we will create another empty array
        // Step 3: Using nested loop, we'll transfer the elements from md array to single array

        // System.out.println("arr = " + arr.length);  // 3 => this is teh 3 inner arrays, but we need the innermost data to calculate all elements



        // Step 1: We need to know the size of the given array
        int totalNumOfElements = 0;

        for (int[] w: arr){
              totalNumOfElements = totalNumOfElements + w.length;
        }
        System.out.println("totalNumOfElements = " + totalNumOfElements);  // 8



        // Step 2: Using that size, we will create another empty array

        int[] simpleArr = new int[totalNumOfElements];
        System.out.println("simpleArr = " + Arrays.toString(simpleArr)); // [0, 0, 0, 0, 0, 0, 0, 0]


        // Step 3: Using nested loop, we'll transfer the elements from md array to single array
        // [[5, 4, 3], [8, 2], [3, 7, 9]]

        int idx = 0;

        for (int[] eachArray: arr){
            for (int element: eachArray){
                simpleArr[idx]  = element;
                idx++;
            }
        }
        System.out.println("simpleArr = " + Arrays.toString(simpleArr));

    }
}
