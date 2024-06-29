package day32lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 7, 14));
        System.out.println( nums); // [2, 3, 3, 5, 7, 14]

        // method call

        sumOfElements(nums);

        System.out.println("======Multiplication=======");
        multiply(nums);
    }


    // create a method to calculate the total value (sum) of the elements
    public static void sumOfElements(List<Integer> list){ // [2, 3, 3, 5, 7, 14]
       /*
        int sum = 0;
       for (Integer w:list){
           sum = sum+w;
       }
        */
        // Lambda expressions
        //int result = list.stream().reduce(0, (t, u) -> t+u);
        int result = list.stream().reduce(0, Integer::sum);
        System.out.println("result = " + result);  // 34

        /*
        NOTES:
        in reduce() function, identity element is declared zero because we are doing addition
        reduce() function is used to reduce the elements to a single element result after performing addition/multiplication operation
        Integer::sum => is the method reference  of (t, u) -> t+u
         */

        // Get the total value AFTER removing the duplicates
        int result1 = list.stream().distinct().reduce(0, Integer::sum);
        System.out.println("Total value of unique numbers = " + result1);


        // Get the total value AFTER removing duplicate and Odd values // [2, 3, 3, 5, 7, 14]
        int result2 = list.stream().distinct().filter(t -> t%2 == 0).reduce(0, Integer::sum);
        System.out.println("Total value of unique and even numbers = " + result2);


        // Get the total value of square of unique and even numbers
        int result3 = list.  // [2, 3, 3, 5, 7, 14]
                stream(). // initiate lambda expression
                distinct(). // remove duplicate
                filter(t -> t%2 ==0). // keep even numbers only
                map(t -> t*t).   // get the square of each element and update the stream with the new value
                reduce(0, (t,u) -> t+u);  // performing addition operation and returning single value as a result

        System.out.println("Total value of square of unique and even numbers = " + result3);

    }

    // Create a method to perform multiplication
    public static void multiply(List<Integer> list){
      /*
        int multiply = 1;
       for (Integer w:list){
           multiply = multiply+w;
       }
        */
       int result = list.  // [2, 3, 3, 5, 7, 14]
               stream().
               distinct().
               filter(t -> t%2 != 0).
               reduce(1, (t, u) -> t*u);
        System.out.println("Total value of unique and odd elements = " + result);  // 105

    }

}
