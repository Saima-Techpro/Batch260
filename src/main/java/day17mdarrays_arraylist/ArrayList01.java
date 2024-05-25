package day17mdarrays_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        /*
        What is ArrayList?
        1) ArrayList is dynamic structure to store multiple elements of same data type.
        2) We do not need to mention the size while creating an ArrayList. It automatically adjusts the
            size of the container when we add / remove an element.
        3) ArrayList cannot store Primitives (byte, short, int, double, float, long, boolean, char) because they have direct
            values. But ArrayList stores references (Non-Primitive like String and Wrapper classes of all Primitives)

            Real-life example of ArrayList  => shopping list

            DIFFERENCES BETWEEN Array and ArrayList?

        a) Arrays are fixed size structure; ArrayLists are not. (They're flexible, can adjust size automatically
        b) Arrays can store Primitives; ArrayLists store Non-Primitive and Wrapper classes
        c) Arrays are faster than ArrayLists
        d) Arrays use less memory as compared to ArrayLists
        e) Arrays don't allow reindexing, ArrayLists allow reindexing

        So, which is better?
        It really depends on the usage
        If you're creating a variable to store static data (length is known), use Arrays
        If you're creating a variable to store dynamic data (length is unknown like shopping list),use ArrayList

         */

    //  How to create an ArrayList?
        // 1st way:
        // ArrayList<Integer> ages = new ArrayList<Integer>();  // Java 6 and earlier

        // 2nd way:
        // ArrayList<Integer> ages = new ArrayList<>(); // Java 7 onwards

        // 3rd way:
        List<Integer> ages = new ArrayList<>();  // Java 8
        // How to print?
        System.out.println("ages = " + ages);

        // How to add elements to an empty list?
        System.out.println("ages= " + ages.add(12));  // true

        ages.add(4);
        ages.add(9);
        ages.add(7);
        ages.add(72);
        ages.add(36);

        System.out.println("ages = " + ages); // [12, 4, 9, 7, 72, 36]

        //Reindexing
        ages.add(1, 25);

        System.out.println("ages = " + ages); // [12, 25, 4, 9, 7, 72, 36]

        // Add any number between 9 and 7
        ages.add(4, 16);

        System.out.println("ages = " + ages);  // [12, 25, 4, 9, 16, 7, 72, 36]

        // Add 15 at the end of the list
        ages.add(15);
        System.out.println("ages = " + ages);  // [12, 25, 4, 9, 16, 7, 72, 36, 15]

        // Add 0 to the beginning of the list
        ages.addFirst(0);
        System.out.println("ages = " + ages);  // [0, 12, 25, 4, 9, 16, 7, 72, 36, 15]

        // Add 90 to the end of the list
        ages.addLast(90);
        System.out.println("ages = " + ages);  // [0, 12, 25, 4, 9, 16, 7, 72, 36, 15, 90]

        // Add the given ArrayList into the ages ArrayList

        List<Integer> newAges = new ArrayList<>();
        newAges.add(30);
        newAges.add(40);
        newAges.add(50);
        System.out.println("newAges = " + newAges);

        // System.out.println("ages + newAges = " + ages.addAll(newAges)); // true
       //  System.out.println("ages = " + ages); // [0, 12, 25, 4, 9, 16, 7, 72, 36, 15, 90, 30, 40, 50]

        System.out.println(ages.addAll(3, newAges));
        System.out.println("ages = " + ages);  // [0, 12, 25, 30, 40, 50, 4, 9, 16, 7, 72, 36, 15, 90]


    }
}
