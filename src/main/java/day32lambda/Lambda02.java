package day32lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record Lambda02() {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 2, 6, 11));
        System.out.println(nums); // [3, 5, 2, 6, 11]
//        int a = 10;
//        a = a*a;
//        System.out.println(a);


        // method call
        printSquare(nums);
        System.out.println("==============");
        cubeOfOdds(nums);
        System.out.println("==============");

        // another list with duplicates
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,4,4,5,7,7,12));
        System.out.println("numbers = " + numbers); // [2, 4, 4, 5, 7, 7, 12]

        removeDuplicates(numbers); // 2 4 5 7 12

    }

    // Create a method to print square of each element
    public static void printSquare(List<Integer> list){
        list.stream().map(t -> t*t).forEach(t -> System.out.print(t + " "));  // 9 25 4 36 121

        // Note: map() function is used to update the stream after performing the mathematical operation
    }


    // Create a method to print the cube of odd elements only
    public static void cubeOfOdds(List<Integer> list){ // [3, 5, 2, 6, 11]
        list.stream().filter(t -> t%2 != 0).map(t -> t*t*t).forEach(t-> System.out.print(t + " ")); // 27 125 1331

    }

    // Create a method to remove duplicate elements and then print them
    public static void removeDuplicates(List<Integer> list){  // [2, 4, 4, 5, 7, 7, 12]

        list.
                stream(). // puts the list in stream format
                distinct(). // filters the duplicates out .. keeps the unique elements only in the stream
                forEach(t -> System.out.print(t + " ")); // works the same as for-each-loop

    }


}
