package day21passbyvalue_stringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {

        /*

        1) The "StringBuilder" class is also a class that produces Strings.
        2) We use the "String" class to create Strings. Why did Java also create the StringBuilder class?
        The "String" class produces "immutable" (unchangeable) Strings,
        while the StringBuilder class produces "mutable" (changeable) Strings.
        3) Being "immutable" means preserving the original value, being unchangeable.
        Being "mutable" means the original value CAN be changed.
        4) Therefore, when you need to frequently add, remove, or modify text,
            using StringBuilder can be a more efficient option.
        5) StringBuilder includes various methods and functions for adding, removing, changing, or reversing text data.
            Among these are commonly used methods like append, delete, insert, and replace.

         */

        // Strings are IMMUTABLE  => Unchangeable
        String s = "Java";  // Java
        String st = s + "x"; // Javax
        String str = st +  "?";  // Javax?

        System.out.println(str + " is easy");  // Javax? is easy

        String name = "Tom";
        String name1 = "Tom";
        // There are two variables that have same values. So Java creates "String Pool" and puts the two values at the same
        // place in that pool. But allocates different references / pointers to both variables.

        String name2 = new String("Tom");  // Although this name2 variable also has the same value, but it will NOT be sent to
                                                // String Pool, because of "new" keyword. We are insisting that JVM should allocate
                                                // separate container for this variable.

        name =  name + " loves Java.";

        // we can insist Java to update the value through assignment operator
        // In this case, name variable will be kicked out of String Pool, and will be allocated a new place in Heap memory.
        // And the pointer will be extended to the new container.
        // So what will happen to the old "name" container that was inside the String Pool?
        // Java has Garbage Collector. It collects all pointer-less / reference-less containers, finalises them and destroys them
        // Thus, frees the memory.
        // Garbage Collector operation is performed by JVM,  so we can't interfere / change / decide this operation.
        // This is considered key feature of Java, which makes it efficient as it doesn't allow stray containers to linger on
        // in the memory.

        System.out.println("======= StringBuilder ==========");
        // Java created a StringBuilder class to create Strings.
        // StringBuilder class s used to create "Mutable Strings" => Changeable


        StringBuilder sb = new StringBuilder();
        sb.append("Python");
        System.out.println(sb);  // Python

        sb.append("!");
        System.out.println(sb); // Python!


    }
}
