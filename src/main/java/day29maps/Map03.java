package day29maps;

import java.util.*;

public class Map03 {
    public static void main(String[] args) {
        /*
        a)HashMap is non-synchronized. This means that multiple threads can access a HashMap at the same time.
        For example, if one customer withdraws money while another deposits at the same time, it could result in an
        incorrect account balance. (it is also not thread-safe)
        However, synchronization must be managed manually in such cases.
        (developers use special structures like Synchronized Blocks, Locks, and Semaphores.)

        b)HashTable is thread - safe and synchronized
        (meaning that only one thread can use the same Hashtable at a time, creating a queue and extending the service
        time).

        // DIFFERENCE
        a) HashMap allows one null key(must be unique, cannot have 2 nulls, it would overwrite) and as many null values as
        you want.

        b) Hashtable does not allow null values for either keys or values.
        Attempting to add a null value will throw a NullPointerException.

        HashMap is fast, HashTable is slower compared to HashMap.

        Note:Both HashMaps and Hashtables store their entries in a random order.

         */


        Hashtable<String, Integer> stGrades = new Hashtable<>();
        stGrades.put("Ali", 85);
        stGrades.put("Asye", 84);
        stGrades.put("Veli", 87);
        stGrades.put("Emina", 88);
        System.out.println("stGrades = " + stGrades); // {Asye=84, Ali=85, Emina=88, Veli=87}

        // Can we add null to a HashTable?
        // NO
//        stGrades.put(null, 90); // NullPointerException
//        System.out.println("stGrades = " + stGrades);
//        stGrades.put("Ahmet", null); // NullPointerException
//        System.out.println("stGrades = " + stGrades);

        /*
                          *** TREEMAP ***
        TreeMap keeps the data in natural order, so they are very slow
        They order entries considering keys
        They are not thread safe and synchronized
        Don't allow null in key part, but allow null in value part


         */
        TreeMap<String, String> capitals = new TreeMap<>();
        capitals.put("USA", "Washington DC");
        capitals.put("UK", "London");
        capitals.put("Turkiye", "Ankara");
        capitals.put("Italy", "Rome");
        capitals.put("Albania", "Tirane");
        capitals.put("Spain", "Madrid");
        System.out.println("capitals = " + capitals); // {Albania=Tirane, Italy=Rome, Spain=Madrid, Turkiye=Ankara, UK=London, USA=Washington DC}

        // TreeMap doesn't allow null key
//        capitals.put(null, "Kabul"); // NullPointerException
//        System.out.println("capitals = " + capitals);


        capitals.put("Romania", null );
        capitals.put("Germany", null );
        System.out.println("capitals = " + capitals);


        System.out.println("=======LinkedHashMap=========");
        /*
                *** LinkedHashMap ***
               It keeps the entries with insertion order and keeps the order all the time

         */

        LinkedHashMap<String, Integer> stdAges = new LinkedHashMap<>();
        stdAges.put("Ali", 25);
        stdAges.put("Asye", 24);
        stdAges.put("Veli", 27);
        stdAges.put("Emina", 18);

        // Follows insertion order
        System.out.println("stdAges = " + stdAges); // {Ali=25, Asye=24, Veli=27, Emina=18}

        Set<Map.Entry<String, Integer>> allEntries = stdAges.entrySet();

        for (Map.Entry<String, Integer> w:allEntries){
            String keys = w.getKey();
            Integer values = w.getValue();

            System.out.println(keys + " => " + values);
        }










    }
}
