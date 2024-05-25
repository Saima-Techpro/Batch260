package day16multidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {

        // Create a MultiDimensional Array with int data type.
        // Calculate total value of min and max element.

        int[][] numbers = {{12, 5}, {34, 56}, {3, 7}};
        System.out.println("numbers = " + Arrays.deepToString(numbers));  // [[12, 5], [34, 56], [3, 7]]

        int min = numbers[0][0]; // we assume that the number at this index is the min in our given md
        int max = numbers[1][0]; // we assume that the number at this index is the max in our given md


        for (int[] inner: numbers){
            for (int each : inner ){
                min = Math.min(each, min);
                max = Math.max(each, max);
            }

        }
        System.out.println("min = " + min); // 3
        System.out.println("max = " + max); // 56
        System.out.println("sum: " + (min+max)); // 59

        System.out.println("========================");
        // Create a MultiDimensional Array with int data type.
        // Calculate total value of all elements.

        int[][] num = {{78, 2}, {3, 6}, {6, 91, 33}};
        System.out.println("num = " + Arrays.deepToString(num)); // [[78, 2], [3, 6], [6, 91, 33]]

        // [[78, 2], [3, 6], [6, 91, 33]]
        int sum = 0;

        for (int[] innerArray: num){
            for (int each: innerArray){
                sum = sum+each;
            }
        }
        System.out.println("sum = " + sum);


    }
}
