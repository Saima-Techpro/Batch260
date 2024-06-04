package day22stringbuffer_instanceblock_staticblock;

public class StaticBlock01 {

    /*
    - Static block is a block of code that is used to initialise static variables.
    - Static Block runs once when the class is loaded in memory.

   Syntax:
   static{

        static block codes here
   }

    1. JVM: Makes the class ready to use for you.
    2. JVM prepares the class for you (class members are loaded) in this order normally:
             1) main method  2) methods and variables

    3. But sometimes we need some data to be available before we start the main method, in that case,
    we use "static block" even before the main method.
              1) static block   2) main method    3) methods and variables
                   see example of static block of pi.
    4. Rule: "static" structures can work with just static class structures.
       Do not put non-static class members (methods or variables) into static methods. It will give error.
    5. "static block" can be used just with "static" variables (as defined in number 4.)
    6. "static block" is used to initialise (means assigning first value) "static variables"

    Note:
    When we create a variable inside a main method, we don't use "static" keyword because Java knows everything inside the main method is static.

    If there are multiple static blocks, Java follows top to bottom rule.


     */

    public static double pi;

    static {
        System.out.println(pi = 3.142);
        System.out.println("Static block is being executed");
    }

    public StaticBlock01(){
        System.out.println("Constructor is being executed");
    }

    /*
        ************ Differences between Instance Block and Static Block ************

1.	Initialization:

Instance Block: Initializes instance variables and runs every time an instance of the class is created.
Static Block: Initializes static variables and runs only once when the class is loaded.

2.	Scope:

Instance Block: Operates on instance-level data.
Static Block: Operates on class-level data.

3.	Execution Timing:

Instance Block: Runs before the constructor during the creation of each instance.
Static Block: Runs once when the class is loaded, before any static members are accessed or any instances are created.

     */


    public static void main(String[] args) {
        System.out.println("This is the main method");
    }














}
