package day27collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {
        /*
        Sets are used to store UNIQUE data.
         Three types:
         1. HashSet => random insertion
         2. LinkedHashSet => insertion order
         3. TreeSet => natural order
         */

        /*

        1) HashSet: This set stores elements based on their hash codes.
        Elements are stored in a structure where each has a unique hash code (identity number).
        When an element is added, its hash code is calculated and placed in a cell corresponding to that hash code.

        HashSets offer the fastest performance. However, they do not maintain the order of elements.
        They accept null as an element.
         */

        // Hashset
        // Deal with hashcode
        String s = "class";
        System.out.println("hash Code= " + s.hashCode());  // 94742904

        String ss ="Core Java class";
        System.out.println("ss.hashCode() = " + ss.hashCode());  // 1141725467


        // How to create HashSet?
        HashSet<String> hs = new HashSet<>();
        hs.add("Mango");
        hs.add("Apricot");
        hs.add("Orange");
        hs.add("Apple");
        hs.add("Lychee");
        hs.add("Grapes");
        System.out.println("hs1 = " + hs);  // randomly adds the values => [Apple, Grapes, Lychee, Mango, Apricot, Orange]

        hs.add("Apple"); // overwrites the duplicate value
        System.out.println("hs1 = " + hs);

        // can we add null?
        hs.add(null);
        System.out.println("hs1 = " + hs);  // null has no hashcode, so it's usually added at the beginning of the HashSet =>  [null, Apple, Grapes, Lychee, Mango, Apricot, Orange]

        // can we add null again?
        hs.add(null);
        System.out.println("hs1 = " + hs);  // overwritten


        // clone() => creates a shallow copy of HashSet
        Object fruits = hs.clone();
        System.out.println("fruits = " + fruits); // [null, Apple, Grapes, Lychee, Mango, Apricot, Orange]

        // clear()
        hs.clear();  // clears all values from the set
        System.out.println("hs1 = " + hs); // []

        // Extra information about Hashset creation
        List<Integer> list1 = Arrays.asList(2, 4, 6,9,1);  // list1 will have Arrays structure at the background
        // list1.add(12);  // error => arrays are fixed structure
        System.out.println("list1 = " + list1);

        HashSet<String> hs1 = new HashSet<>(Arrays.asList("Tom", "Emily", "Mark"));  // hs1 will have Hashset structure at the back

        hs1.add("Aisha");
        System.out.println("hs1 = " + hs1);

        Set<String> hs2 = Set.of("Mary", "John");
        hs2.add("Junaid");
        System.out.println("hs2 = " + hs2);

        // NOTE: When we create a set using Set.of() method, it provides an Immutable Set which means it cannot be updated/modified.










    }
}
