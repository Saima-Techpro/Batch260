package day19methodcreation_overloading;

public class MethodCreation02 {

    /*
             ACCESS MODIFIERS IN JAVA

      1) public => NO RESTRICTION AT ALL => everyone can access within the project

      2) protected => Accessible within the package
                      Accessible to specific members when they're related (through inheritance)

      3) default  => Accessible within the same package only  (package private)
                  It's less restrictive than private; more restrictive than public and protected
      4) private => Accessible within the same class



     */

    public static void main(String[] args) {
        // method call for example 1:
        System.out.println("multiply: " + multiply(2, 4, 9));

        int result = multiply(2, 4, 9);
        System.out.println("result = " + result);

        // method call for example 2:
        System.out.println("add and multiply = " + addAndMultiply(3, 6, 9));

        // method call for example 3:
        System.out.println("Hello");
        printText("Hello");  // method call

    }

    // Example 1: Create a method to multiply 3 numbers
    public static int multiply(int a, int b, int c){
        int result = a*b*c; // local instance / local variable => that's available only within this method/function=> limited scope
        return result;
    }

    // Example 2: Create a method with 3 parameters. Multiply two parameters and add the third one
    private static int addAndMultiply(int a, int b, int c){
        return a*b+c;
    }

    // Example 3: Create a method to print the given text
    public static void printText(String s){ // if a method doesn't create a new data, then we use void return type
        System.out.println(s);
    }


}
