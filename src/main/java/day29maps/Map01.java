package day29maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {
    public static void main(String[] args) {
        /*
           1) Maps have key - value structure
           2)Keys are unique but values are not
           3)Every element in a Map is called as "Entry"
           4)All elements are called as "EntrySet"
           5)Key cannot be null in maps except "HashMap" but value can
           6)HashMap puts the entries in random order, because of that it is superfast.
	       7)Maps are not collections. We don’t inherit from them.

-	Maps are like dictionaries. They are descriptive. e.g.: Jim = 13.
-	The left side, i.e., keys, are unique. The value side can have duplicates.
-	For keys, a Set is used. For values, a Collection structure is generally used.
-	***(A Collection structure is used, which can be a List or an Array depending on the situation.)

         */

        // HASHMAP
        // How to create a map?
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Tom", 36);
        myMap.put("Keira", 32);
        myMap.put("John", 26);
        myMap.put("Hulya", 21);
        myMap.put("Rumeysa", 106);
        myMap.put("Junaid", 20);
        myMap.put("Uranus", 90);

        System.out.println("myMap = " + myMap); // {Tom=36, Junaid=20, John=26, Uranus=90, Rumeysa=106, Hulya=21, Keira=32}

        // How to get keys only?

        Set<String> keys = myMap.keySet();
        System.out.println("keys = " + keys);  // [Tom, Junaid, John, Uranus, Rumeysa, Hulya, Keira]

        // How to get values only?
        Collection<Integer> values = myMap.values();
        System.out.println("values = " + values);  // [36, 20, 26, 90, 106, 21, 32]

        // get() method
        Integer age = myMap.get("John");
        System.out.println("John's age = " + age);  // 26

        // Can we get the keys / values from a map one by one?
        // Yes, we can. Using loop for keys / values that we retrieved from the map above.

        // What's the average age in myMap?
        int sum = 0;
        for (Integer w:values){ // [36, 20, 26, 90, 106, 21, 32]
            sum = sum+w;
        }
        System.out.println("Average age: " +(sum/ values.size())); // 47

        // Can we get the entries (key:value pair) from a map one by one?
        Set<Map.Entry<String, Integer>> allEntries = myMap.entrySet();

        for (Map.Entry<String, Integer> w:allEntries){
            System.out.print(w + " , ");

        }

        // HW Task: Calculate the total number of characters in this map.



    }
}
