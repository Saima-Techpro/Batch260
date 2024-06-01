package javapractice.Practice04;

import java.util.Arrays;

public class Q02_MDA {
    public static void main(String[] args) {

         /*
            Create an integer multidimensional array and print the elements of the array you created.
         */

        // 1st
        int [][] arr = {{4,5,6}, {9,0}, {3,2,1,4}};

        System.out.println("Array = " + Arrays.deepToString(arr));


        // 2nd
        int[][] mda = {{4,7},{-9,4,8},{15,36,-12,9},{67,23,88}};

        for (int[] w : mda){
            for (int l : w){
                System.out.println(l);
            }
        }

        // 3rd
        int[][] multiArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Elements of the 2D array: ");
        for( int i = 0; i < multiArray.length; i++){
            for (int j = 0; j < multiArray[i].length; j++){
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}
