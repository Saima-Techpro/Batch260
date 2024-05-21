package day15arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*

        1. Arrays are fix size structure provided by Java.
        2. Arrays are used to store Multiple Values.
        3. All values should belong to the SAME data type.

         */

        // Example: Create a String array and print the elements in Alphabetical order

        String [] countries = new String[5];
        //String countries1[] = new String[5];
        countries[0] = "Turkiye";
        System.out.println("countries = " + countries);
        System.out.println("countries = " + Arrays.toString(countries));

        // 2nd way:

        String[] cities = {"Istanbul", "London", "Washington DC", "Lisbon", "Manchester", "Paris"};
        System.out.println("cities = " + Arrays.toString(cities)); // [Istanbul, London, Washington DC, Lisbon, Manchester, Paris]

        //cities[6] = "Tokyo";  // error => because Arrays is a fixed size structure. Once you create an Array of size 6, you cannot add a 7th value
        //System.out.println("cities = " + Arrays.toString(cities));

        cities[2] = "Tokyo";
        System.out.println("cities = " + Arrays.toString(cities));  // [Istanbul, London, Tokyo, Lisbon, Manchester, Paris]

        // sort() method is used to sort the elements in an Array
        // String array will be sorted in alphabetical order
        // Numeric arrays (int, short, byte, double etc.) will be sorted in ASCENDING order
        Arrays.sort(cities);

        System.out.println("cities in alphabetical order = " + Arrays.toString(cities));  // [Istanbul, Lisbon, London, Manchester, Paris, Tokyo]


        System.out.println("======= Example 2 ==========");

        // Example: Create a String array called names with a size of 5. Print the names whose length is less than 6

        String names[]= {"Mary","Johnson","Ali","Suleyman","Mark"};
        System.out.println(Arrays.toString(names));
//        System.out.println("number of names = " + names.length);  // 5

        for (String w: names){

            if (w.length()<6){
                System.out.println(w);
            }
        }

        System.out.println("====================");
        // Print the names before "Ali"
        // names = [Mary, Johnson, Ali, Suleyman, Mark]

        for (String w : names){
            if (w.equals("Ali")){
                break;
            }
            System.out.println(w);
        }
        System.out.println("====================");

        // Print the names before "Ali" and "Ali" as well
        // names = [Mary, Johnson, Ali, Suleyman, Mark]

        for (String w : names){
            System.out.println(w);
            if (w.equals("Ali")){
                break;
            }
        }

        System.out.println("=================");

        // Print all the names different from  "Ali"
        // names = [Mary, Johnson, Ali, Suleyman, Mark]

        for (String w : names){
            if (w.equals("Ali")){
                continue; //  continue keyword skips the given data and executes the rest of the code
            }
            System.out.println(w);
        }

    }
}
