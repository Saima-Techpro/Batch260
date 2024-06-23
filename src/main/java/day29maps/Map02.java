package day29maps;

import java.util.HashMap;

public class Map02 {
    public static void main(String[] args) {
        /*
        -	Hashing Technique" means Java creates unique values (hash codes) for each element.
        -	HashMap can accept "Key" as null; other Maps don't.
        -	Value can be null repeatedly.
        -	The order in HashMap is random order. It's superfast.
         */

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 22);
        stdAges.put("Asye", 20);
        stdAges.put("Veli", 21);
        stdAges.put("Arda", 19);
        stdAges.put("Mert", 24);
        stdAges.put("Maryam", 22);
        System.out.println("stdAges = " + stdAges); // {Asye=20, Arda=19, Veli=21, Maryam=22, Mert=24, Ali=22}


        stdAges.put(null, 23);
        System.out.println("stdAges = " + stdAges); //{null=23, Asye=20, Arda=19, Veli=21, Maryam=22, Mert=24, Ali=22}

        // Maps dn not allow duplication for keys.
        stdAges.put(null, 17); // It doesn't throw exception. It considers the already existing key and overwrites the value for the existing key
        System.out.println("stdAges = " + stdAges); // {null=17, Asye=20, Arda=19, Veli=21, Maryam=22, Mert=24, Ali=22}

        stdAges.put("Mert", 21);
        System.out.println("stdAges = " + stdAges); //{null=17, Asye=20, Arda=19, Veli=21, Maryam=22, Mert=21, Ali=22}

        // Can we assign multiple null values?
        stdAges.put("Rumeysa", null);
        stdAges.put("Anisa", null);
        stdAges.put("Someone else", null);
        System.out.println("stdAges = " + stdAges); // {null=17, Asye=20, Arda=19, Veli=21, Someone else=null, Maryam=22, Rumeysa=null, Anisa=null, Mert=21, Ali=22}

        // replace() method is used to update values using their keys
        // Technically, you can do the same with put, but using replace provides clearer information
        // replace() method can also work by checking the old value,
        // assign new value conditionally => if tge old value matches, it will be replaced with new value

        stdAges.replace("Ali", 25);
        System.out.println("stdAges = " + stdAges); // {null=17, Asye=20, Arda=19, Veli=21, Someone else=null, Maryam=22, Rumeysa=null, Anisa=null, Mert=21, Ali=25}

        stdAges.replace("Asye", 20, 19);
        System.out.println("stdAges = " + stdAges);


        // putIfAbsent() method put the entry (key:value pair) in the map if it doesn't already exist.
        stdAges.putIfAbsent("Mikail", 22);
        System.out.println("stdAges = " + stdAges);

        stdAges.putIfAbsent("Mikail", 22);
        System.out.println("stdAges = " + stdAges);

        //getOrDefault() method also works conditionally => if the given jey exists, return its value.
        // If it doesn't exist, return the default value that is given
        System.out.println(stdAges.get("Arda")); // 19

        System.out.println(stdAges.getOrDefault("Miryam", -1));  // -1


        // remove(key) method => checks the key only. If it exists, the whole entry will be removed.
        stdAges.remove("Someone else");
        System.out.println("stdAges = " + stdAges); // {null=17, Asye=19, Arda=19, Veli=21, Maryam=22, Rumeysa=null, Mikail=22, Anisa=null, Mert=21, Ali=25}

        // remove(key, value) method => checks the key AND value as well. If both exists (exact match), the whole entry will be removed.
        stdAges.remove("Mert", 25);
        System.out.println("stdAges = " + stdAges); // Mert is not removed because key:value pair has to be exact match for this to be removed

        stdAges.remove("Ali", 25); // Ali is removed because key:value pair was the exact match
        System.out.println("stdAges = " + stdAges); // {null=17, Asye=19, Arda=19, Veli=21, Maryam=22, Rumeysa=null, Mikail=22, Anisa=null, Mert=21}


    }
}
