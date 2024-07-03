package day34lambda;


import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        /*
        a) IntStream - Allows for sequential operations on primitive int values. (There's also LongStream, DoubleStream)
    b) range - Creates a stream that represents consecutive numbers between specified start (inclusive) and end
    values (exclusive).
    c) rangeClosed - Creates a stream that represents consecutive numbers between specified start (inclusive) and end
     values (inclusive).
    d) addExact - Adds two int or long values exactly. This method is in the Math class.
    e) getAsInt - A method found in the OptionalInt class. If a value is present, this method returns it.
    (We use this when we use IntStream)
    If a value is not present, it throws a NoSuchElementException.

         */
        int result = getSumFromSevenToSeventy();
        System.out.println("result = " + result);

        System.out.println(multiplyGivenRange());

        //System.out.println(getFactorial(0)); // NoSuchElementException but in Maths, factorial of 0 is 1.
        System.out.println(getFactorial(0));

        System.out.println(getSumOfEvens(3, 10));  // 18
        System.out.println(getSumOfEvens(20, 10)); // 60

    }


    // Create a method that gives the sum of integers between 7 and 70
    public static int getSumFromSevenToSeventy(){
       return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }

    // Create a method that gives multiplies integers between 3 and 11
    public static int multiplyGivenRange(){
        return IntStream.range(2, 10).reduce(Math::multiplyExact).getAsInt();
    }

    // Create a method that gives factorial
    // 3! => 3*2*1 = 6
    // 5! => 5*4*3*2*1 = 120
    public static int getFactorial(int x){

        if (x == 0){
            return 1; // 0! = 1
        } else if (x < 0) {
            System.out.println("Invalid number for Factorials");
            return x;
        }else {
            int factorial = IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
            return factorial;
        }

    }

//    // Create a method to get the sum of EVEN integers between the given range
//    public static int getSumOfEvens(int a , int b){
//        return IntStream.range(a , b).filter(Utils::isNumEven).sum();
//    }

    // Other way

    // Create a method to get the sum of EVEN integers between the given range
    public static int getSumOfEvens(int a , int b){
        if (a>b){
            int temp = a; // now a is in temp variable
            a = b;
            b = temp;
        }

        return IntStream.range(a+1 , b).filter(Utils::isNumEven).sum();
    }


}
