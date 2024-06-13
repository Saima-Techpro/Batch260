package day27collections;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        /*
        2)LinkedHashSet: This set stores elements based on their addition order (insertion order).

        LinkedHashSets are a good choice for applications that require maintaining the order of elements.
        However, they offer slower performance than HashSets. (medium)

        Example: Caching "recently viewed items" on an e-commerce site where both uniqueness and order are important.
        Example2; You can use it to keep student information in order of registration in schools


        3) TreeSet:
        This set stores elements based on their natural order (from smallest to largest).
        It offers slower performance than HashSets and LinkedHashSets.
        In Java, TreeSet is a class that implements the SortedSet interface.
        Therefore, TreeSet is a sorted set.

         */

        // How to create LinkedHashSet

        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs1.add(23);
        lhs1.add(12);
        lhs1.add(9);
        lhs1.add(43);
        lhs1.add(19);
        System.out.println("lhs1 = " + lhs1); // insertion order =>  [23, 12, 9, 43, 19]


        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        lhs2.add(2);
        lhs2.add(12);
        lhs2.add(67);
        lhs2.add(3);
        lhs2.add(19);
        System.out.println("lhs2 = " + lhs2);  // [2, 12, 67, 3, 19]

        System.out.println(lhs1.retainAll(lhs2));  // true
        System.out.println("lhs1 = " + lhs1);  // [12, 19]

        // retainAll() keeps only those values which are available in the second set as well

        lhs1.add(null);
        System.out.println("lhs1 = " + lhs1);  // [12, 19, null]

        // can we add null again?
        lhs1.add(null); // No
        System.out.println("lhs1 = " + lhs1);  // [12, 19, null]


        // How to create TreeSet?
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('D');
        ts.add('Z');
        ts.add('A');
        ts.add('M');
        ts.add('X');
        ts.add('P');
        System.out.println("tree set = " + ts); // [A, D, M, P, X, Z]

//        ts.add(null);
//        System.out.println("ts = " + ts);  // TreeSet does NOT accept 'null' as an element

        // subSet()

        //TreeSet<Character> ts1 = ts.subSet('D', 'P'); // error
        // subSet(startingValue, endingValue) => startingValue is inclusive and endingValue is exclusive
        SortedSet<Character> ts1 = ts.subSet('D', 'P');
        System.out.println("ts1 = " + ts1); // [D, M]


    }
}
