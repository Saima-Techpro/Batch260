package day18arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        // Example: Create a String ArrayList with duplicate values.Transfer the unique values into a new ArrayList
        // 'J', 'a', 'a', 'v', 'a' => 'J','a', 'v'

        ArrayList<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('a');
        a.add('v');
        a.add('a');

        System.out.println("a = " + a);  // [J, a, a, v, a]

        ArrayList<Character> b = new ArrayList<>();
        System.out.println("b = " + b); // []  empty ArrayList to store the UNIQUE characters
        for (Character c :a){
            if (!b.contains(c)){
                b.add(c);
            }
        }
        System.out.println("b = " + b); // [J, a, v]

        System.out.println("==============================");

        // INTERVIEW QUESTION
        // Create a String ArrayList of cities  and remove the ones that contain "u"
        // HINT: use remove() method

        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Istanbul");
        cities.add("Houston");
        cities.add("Moscow");
        cities.add("Dubai");

        System.out.println("cities = " + cities);

//        for (String w : cities) {
//            if (w.contains("u")) {
//                cities.remove(w);
//            }
//        }

        /*
        NOTE: the above for each loop shows error (throws java.util.ConcurrentModificationException)
        This is loop telling us that I cannot work with a structure that keeps changing its size every time I remove an element.
        We know that ArrayLists reindex the elements automatically when an element is added or removed from the ArrayLists.
        So this loop will not solve the above question.

        We need to create a logic where the index remains the same every time the element is removed and re-indexed to 0

        We will use for loop,  so we can deal with re-indexing issue by using decrement inside the loop as well
         */

        // cities = [London, Istanbul, Houston, Moscow, Dubai]

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).contains("u")){
                cities.remove(i);
                i--;
            }

        }
        System.out.println("cities = " + cities);  // [London, Moscow]



        /*
        Junaid's solution works absolutely fine if you're asked to transfer the elements to an empty ArrayList

        ArrayList<String> empty = new ArrayList<>();
        for (String w: cities){

            if (w.contains("u")){
                continue;
            }else {
                empty.add(w);
                System.out.println(w);
            }

         */

    }
}
