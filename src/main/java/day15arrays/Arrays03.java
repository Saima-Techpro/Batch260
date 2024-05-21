package day15arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        // Example: Create an int array of size 5 and print the number less than 5


        int[] numbers = {2, -3, -8, 6, 12};

        for (int w : numbers){
            if (w<5){
                System.out.println(w);
            }
        }

        // Check if this array has number 9
        /*
        1. binarySearch() method returns us the index of the element if it exists
        2. binarySearch() method returns us "-" negative sign for the element that does NOT exist
        3. binarySearch() method returns order of the place / position of the element if it EXISTED in the array
         NOTE: binarySearch() method should be used AFTER sort() method

         */


        System.out.println("====================");
        // sort the above array first
        Arrays.sort(numbers);
        System.out.println("numbers after sorting = " + Arrays.toString(numbers));
        // [-8, -3, 2, 6, 12]

        System.out.println(Arrays.binarySearch(numbers, 12));  // index of 12 is 4

        System.out.println(Arrays.binarySearch(numbers, 15));  // -6 => "-" means it does not exist ;
                                                                    // "6" here means that if it existed it would have been the 6th element

        System.out.println("=================");

        String[] letters = {"O", "A", "M", "S", "Z"};
        System.out.println("letters = " + Arrays.toString(letters));

        // First we need to sort the array
        Arrays.sort(letters);
        System.out.println("letters after sorting = " + Arrays.toString(letters)); // [A, M, O, S, Z]

        // Find the index of "M" using binarySearch()
        int indexOfM = Arrays.binarySearch(letters ,  "M");
        System.out.println("indexOfM = " + indexOfM);  // 1


        // Find the index of "Y" using binarySearch()
        int indexOfY = Arrays.binarySearch(letters , "B");
        System.out.println("indexOfY = " + indexOfY); // -5  => '-'  means doesn't exist; 5th position because "Y" comes before "Z" so in this case,
                                                        // if "Y" existed, it would exist on 5th position in the array before "Z"


        // Example: Print the number of words in the given String.

        String str = "Java is easy. Learn Java; earn money";
        String[] words = str.split(" ");

        System.out.println("words = " + Arrays.toString(words));

        int numOfWords = words.length;
        System.out.println("numOfWords = " + numOfWords);  // 7


    }
}
