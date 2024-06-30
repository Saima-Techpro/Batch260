package day33lambda;

import java.util.*;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(11, 2, 24, 5, 2, 11, 13));
        System.out.println("myList = " + myList); // [11, 2, 24, 5, 2, 11, 13]
        // System.out.println(Integer.MAX_VALUE);

        // method call
        findMinimum(myList);
        findMinimum2(myList);
        findMinimum3(myList);
        findMinimum4(myList);
        findMinimum5(myList);
    }


    // Create a method to find the minimum value from the given list
    // 1st way:
    public static void findMinimum(List<Integer> list){
        int minValue = list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u) -> t > u ? u : t );
        System.out.println("1st minValue = " + minValue);
    }

    // 2nd way:
    public static void findMinimum2(List<Integer> list){
        int minValue = list.  // [11, 2, 24, 5, 2, 11, 13]
                        stream().
                        distinct().
                        //sorted(). // [2, 5, 11, 13, 24]
                        sorted(Comparator.reverseOrder()). // [24, 13, 11, 5, 2]
                        reduce((t,u) -> u).get();
        System.out.println("2nd minValue = " + minValue);

        // sorted() function orders the elements in ascending order => smallest to greatest
        // sorted(Comparator.reverseOrder()) => Comparator.reverseOrder() is used to reverse the order => from greatest to smallest

    }

    // 3rd way:
    public static void findMinimum3(List<Integer> list){
        Optional<Integer> minValue = list.  // [11, 2, 24, 5, 2, 11, 13]
                stream().
                distinct().
                        sorted(Comparator.reverseOrder()). // [24, 13, 11, 5, 2]
                        reduce((t,u) -> u);

        if (minValue.isPresent()){
            System.out.println("3rd minValue = " + minValue.get());
        }else {
            System.out.println("List is empty or the value cannot be found!");
        }

        /*
        Previously, we stored the variable in int data type, so we had to use get() method to
        get the value out of reduce() function which was returning Optional data.

        In this method, we stored our variable in Optional data, type so we can see how isPresent() method works.
        So we don't need get() method after reduce() function.
        But we still need to use get() in if statement to display the result.
         */
    }

    // 4th way:
    public static void findMinimum4(List<Integer> list) {
        int minValue = list.  // [11, 2, 24, 5, 2, 11, 13]
                stream().
                distinct().
                reduce(Math::min).get();
        System.out.println("4th minValue = " + minValue);
    }

    // 5th way:
    public static void findMinimum5(List<Integer> list) {
        int minValue = list.  // [11, 2, 24, 5, 2, 11, 13]
                stream().
                distinct().
                sorted(). // [2, 5, 11, 13 , 24]
                findFirst().
                get();

        System.out.println("5th minValue = " + minValue);
    }







}
