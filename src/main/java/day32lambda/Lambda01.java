package day32lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        /*
         1) Lambdas in Java facilitate functional-style programming by allowing methods to be treated as data,
         enabling us to write short, reusable functions, often without the overhead of an anonymous class.
         Lambdas themselves are not "functional programming" but rather a feature that supports a functional
         programming style in Java, which remains an object-oriented language.

            Structured Programming: Structured programming is a programming paradigm that encourages
            writing programs using certain structures or control structures (such as loops, conditional statements).

        2) Functional programming is commonly used with Collections and Arrays. (It's not directly used with maps but can be
            used if converted to a Set with entrySet. To iterate over a Map functionally, it’s common to use entrySet()
            to convert it to a collection of Map.Entry objects, allowing functional operations to be applied to
            each entry. Alternatively, maps also support operations like forEach directly.)

        Lambda expressions, introduced with Java 8, are a feature used to facilitate functional (method-based) programming.

        Essentially, they represent anonymous functions and are usually used to define short functions that
        are to be used once.

        (Anonymous Functions: Lambdas are effectively anonymous functions—functions that have no name and are
        typically concise. While lambdas are often used for short-lived functions (e.g., passing behavior as an argument),
        they can also be stored in variables and reused.)

    The general advantages of lambda expressions:
    1- Writing less code: Lambdas allow you to write less and more readable code.
    2- Functional programming: They help you utilize Java's functional programming features.
    3- Anonymous: Lambda expressions do not have a name.
    4- Can contain a single expression: Lambda expressions can contain a single expression that performs one or more
    operations.
    5- Can take one or more parameters: Lambda expressions can take one or more parameters.

        Lambda expressions are sometimes also called "arrow functions" ->

         */

        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 9, 62, 24, 12));

        // method call
        printElements(nums);

        System.out.println("=============");
        printElementsWithLambda(nums);
        System.out.println("=============");

        printEvenNums(nums);

    }


    // Create a simple method to print the elements
    public static void printElements(List<Integer> list){
        for (Integer w:list){
            System.out.print(w +  " ");
        }
    }

    public static void printElementsWithLambda(List<Integer> list){  // 5 9 62 24 12
       list.stream().forEach(t -> System.out.print(t + " "));

       // 't' here is the name of the variable and it represents each element from the list one by one
        // NOTE: in Structured programming, we create loop, in LAMBDA (functional programming), we just use forEach()
    }

    // Create a method to print the even elements from the given list
    public static void printEvenNums(List<Integer> list){
        for (Integer w: list){
            if (w%2 == 0){
                System.out.print(w +  " ");
            }
        }

    }

    public static void printEvenNumsWithLambda(List<Integer> list){  // 5 9 62 24 12
      list.stream().filter(t -> t%2 == 0).forEach(t -> System.out.println(t)); // 62 24 12

      // Note: in Lambda, we use filter() function in place of 'if statements'

    }


}
