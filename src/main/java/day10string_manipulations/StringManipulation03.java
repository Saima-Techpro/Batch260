package day10string_manipulations;

public class StringManipulation03 {
    public static void main(String[] args) {

        /*
        JVM (Java Virtual Machine) deals with memory management automatically in JAVA.

        JAVA has two types of memory: HEAP and STACK

        STACK Memory:
        Primitive data type and references of Non-Primitive data type are stored in Stack.
        Stack memory is faster. But it has limited space as compared to HEAP memory.
        It provides address / reference of the Non-Primitive data type like a map /navigation.
        NOTE: Primitive data types don't have reference

        HEAP  Memory:
        Non-Primitive data type is stored in HEAP.
        HEAP memory is like a jungle where variables can be lost. so their reference is kept in STACK
        Dynamically created objects (using 'new' keyword) are stored in HEAP e.g. Scanner object
        so HEAP memory contains values, methods as well as objects.

        NOTE: STRING POOL
        When Java sees same value allocated to another String variable, it doesn't create another container
        ( means it doesn't allocate separate space to this variable in heap memory.
        Both variables are allocated same space in HEAP and same reference point in STACK.

        NOTE: equality operator '==' and equal() method
        equality operator '=='  checks the values as well as references
        equal() method checks the values ONLY

         */

        int x = 6;
        String str = "Tom";

        String s = "Hello";
        String s1 = "Hello";

        System.out.println(s == s1);  // true
        System.out.println("using equal method: " + s.equals(s1)); // true

        //

        System.out.println(s == str); // false
        System.out.println("using equal method: " + s.equals(str)); // false


        System.out.println("===================");
        String s2 = new String("Hello");

        System.out.println(s == s2);  // false
        System.out.println("using equal method: " + s.equals(s2)); // true

        s = s + 1;
        System.out.println("s = " + s);

        // NOTE: if anything is added to s variable, the value will be different. now 's' will be allocated separate
        // place in HEAP and separate reference in STACK

        int m = 12;
        int n = 12;

        System.out.println(m == n); // true  because Primitive data doesn't have references
                                    // so equality operator == only checks the values and returns true


    }
}
