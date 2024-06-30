package day33lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(11, 2, 24, 5, 2, 11, 13));
        System.out.println("myList = " + myList); // [11, 2, 24, 5, 2, 11, 13]

        System.out.println(Integer.MIN_VALUE);
        // method call
        findMaximum(myList); // 24

        findMaximum2(myList); // 24

        findMaximum3(myList); // 24

        findMaximum4(myList); //24

        findMaximum5(myList); // 24
    }

    // 1st way: Using Integer.MIN_VALUE as identity element
    // Create a method to find out the maximum element from the list
    public static void findMaximum(List<Integer> list){

        int maxValue = list. // [11, 2, 24, 5, 2, 11, 13]
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t,u) -> t > u? t : u);
        System.out.println("maxValue 1 = " + maxValue);

        // Integer.MIN_VALUE gives us the minimum value that an integer can have  => -2147483648 => -2^31
    }

    // 2nd way: by taking the element from the list itself as identity element
    public static void findMaximum2(List<Integer> list){

        int maxValue = list. // [11, 2, 24, 5, 2, 11, 13]
                stream().
                distinct().
                reduce(list.get(0), (t,u) -> t > u? t : u);
        System.out.println("maxValue 2 = " + maxValue);

        // list.get(0) will always return the first element from the list itself, and we can use that as identity element

    }

    // 3rd way: BETTER WAY =>  using sorted()
    public static void findMaximum3(List<Integer> list){
        int maxValue = list. // [11, 2, 24, 5, 2, 11, 13]
                stream().
                distinct(). // [11, 2, 24, 5, 13]
                sorted().  // [2, 5, 11, 13, 24]
                reduce((t,u) -> u).get();
        System.out.println("maxValue 3 = " + maxValue);

        /*
        reduce() function can be used with / without an identity element
        reduce() function with identity element:
        identity element for addition : 0
        identity element for multiplication : 1
        identity element  for maximum value : Integer.MIN_VALUE
        identity element  for maximum value : list.get(0)


        reduce() function without identity element:
        sorted() function will sort the stream in ascending order
        reduce() function here is NOT using identity element, and it returns Optional data type.
         In order for us to get that element, we have two options:
         1. declare Optional<Integer> data type for the variable maxValue
         2. use get() method to get the element from Optional data type


     We have 3 different reduce() functions. The one with optional class without identity element
     requires get() method...

    1. Optional<T> reduce(BinaryOperator<T> accumulator)
    2. T reduce(T identity, BinaryOperator<T> accumulator)
    3. <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)

         */
    }

    // 4th way: BEST PRACTICE
    public static void findMaximum4(List<Integer> list) {

        int maxValue = list. // [11, 2, 24, 5, 2, 11, 13]
                stream().
                distinct(). // [11, 2, 24, 5, 13]
//              reduce((t, u) -> Math.max(t, u)).get();
                reduce(Math::max).get();
        System.out.println("maxValue 4 = " + maxValue);

        // Math::max is called method reference for Math.max()
    }

    // 5th way:
    public static void findMaximum5(List<Integer> list) {
        int maxValue = list.  // [11, 2, 24, 5, 2, 11, 13]
                stream().
                distinct().
                sorted(Comparator.reverseOrder()). // [2, 5, 11, 13 , 24]
                findFirst().
                get();

        System.out.println("5th maxValue = " + maxValue);
    }



    }
