package day17mdarrays_arraylist;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {

        // Find the maximum (greatest) element from a given MultiDimensional Array
        // {{4, 7},{-9,4,8},{15,36,-12,9},{67,23,88}}

        int[][] numbers = {{4, 7},{-9,4,8},{15,36,-12,9},{67,23,8}};
        // Hint: Math.max()

        int max = numbers[0][0];  // we assume that the element at this index is the maximum
        for (int[] eachArray:numbers){
            for (int singleElement: eachArray){
                max = Math.max(singleElement, max);
            }
        }
        System.out.println("max = " + max);  // 67


    }
}
