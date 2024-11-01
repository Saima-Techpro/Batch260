package day34lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Fatma");
        myList.add("Veli");
        myList.add("Yusuf");
        myList.add("Maryam");
        myList.add("Nataliya");

        System.out.println("myList = " + myList);  // [Ali, Fatma, Veli, Yusuf, Maryam, Nataliya]

        // method call
        printElements(myList);
        System.out.println("==============");
        printUniqueLowercaseAndSorted(myList); // ali veli fatma yusuf maryam nataliya

        System.out.println("=========");
        printUniqueSortedByLastChar(myList);  // Fatma Nataliya Yusuf Ali Veli Maryam

        System.out.println("=========");
        printUniqueSortedByFirstChar(myList);  // Ali Fatma Maryam Nataliya Veli Yusuf

        System.out.println();
        //Using a custom comparator
        List<String> names = Arrays.asList("Alice", "Bob", "Charlotte", "Dave");

        // Call the method to sort by length
        System.out.println(sortByLength(names));   // [Bob, Dave, Alice, Charlotte]

    }

    // Create a method to print all elements in Uppercase in the same line with a space
    public static void printElements(List<String> list){
        list.stream().map(t -> t.toUpperCase() ).forEach(Utils::printWithSpace);
    }

//    another possible way
//    public static void printElements1(List<String> list){
//        list.replaceAll(String::toUpperCase);
//        System.out.println(list);
//    }

    // Create a method that prints the unique elements from a list, in lowercase and
    // sorted by their length (from shortest to longest)


    public static void printUniqueLowercaseAndSorted(List<String> list){
        list.stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(String::length)).  // ali veli fatma yusuf maryam nataliya
                forEach(Utils::printWithSpace);

        /*
        - Comparator.comparing() method allows comparison on the basis of the specific conditions
        - sorted(Comparator.comparing(String::length)) => orders the string list according to the length of the names
           (from shortest to longest)
        - If you want to reverse the order =>  sorted(Comparator.comparing(String::length).reversed()
           (from longest to shortest)
         */
    }

    // Create a method to sort the distinct elements according to their last character
    public static void printUniqueSortedByLastChar(List<String > list){
        // [Ali, Fatma, Veli, Yusuf, Maryam, Nataliya]
        list.stream().
                distinct().
//                sorted(Comparator.comparing(t -> t.charAt(t.length()-1))).
                sorted(Comparator.comparing(Utils::getLastChar)).
                forEach(Utils::printWithSpace);

        // t.length()-1) => provides last index for each element
        // we created a reusable method to get the last character from a String => Utils::getLastChar
    }

    // Create a method to sort the distinct elements according to their length and first character

    public static void printUniqueSortedByFirstChar(List<String > list){
        list.stream().
                distinct().
                sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).
                //sorted(Comparator.comparing(t -> t.charAt(0))).  // t.charAt(0) provides first character
                forEach(Utils::printWithSpace);

    }

    // Method to sort a list of names by length
    public static List<String> sortByLength(List<String> names) {
        return names.stream()
                .sorted((name1, name2) -> Integer.compare(name1.length(), name2.length()))
                .toList();
    }


}
