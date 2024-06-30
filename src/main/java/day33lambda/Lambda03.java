package day33lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Nataliya");
        myList.add("Ali");
        myList.add("Ali");
        myList.add("Olijas");
        myList.add("Resham");
        myList.add("Husnu");
        myList.add("Rumeysa");
        myList.add("rumeysa");

        System.out.println("myList = " + myList);  // [Nataliya, Ali, Ali, Olijas, Resham, Husnu, Rumeysa, rumeysa]  => insertion order


        // method call
        //printElements(myList);

        //printElementsGreaterThanFive(myList); // Nataliya Olijas Resham Rumeysa rumeysa

        //System.out.println(printElementsGreaterThanFiveInList(myList));  // [NATALIYA, OLIJAS, RESHAM, RUMEYSA, RUMEYSA]


        //System.out.println(printUniqueSortedElementsInList(myList));  // printing in list structure =>[ali, husnu, nataliya, olijas, resham, rumeysa, rumeysa]

        List<String> printingList = printUniqueSortedElementsInList(myList);
        for (String w: printingList){
            System.out.print(w + " ");  // not in the list structure anymore => ali husnu nataliya olijas resham rumeysa rumeysa
        }




    }


    // Create a method to print the elements except the ones that start with "R" or "r"
    // [Nataliya, Ali, Ali, Olijas, Resham, Husnu, Rumeysa, rumeysa]

    public static void printElements(List<String> list){
        list.stream().filter(t -> !t.startsWith("R") && !t.startsWith("r")).forEach(t -> System.out.print(t + " "));
    }


    // Create a method to print UNIQUE elements whose number of characters is greater 5
    // [Nataliya, Ali, Ali, Olijas, Resham, Husnu, Rumeysa, rumeysa]

    public static void printElementsGreaterThanFive(List<String> list){
        list.
                stream().
                distinct().
                filter(t -> t.length() > 5).
                forEach(t -> System.out.print( t + " "));
    }

    /*
    Create a method returning version of the list as follows:
    1.	must contain elements whose length is greater than 5
    2.  must contain elements all converted to uppercase
    3.	must return as a list as well
     */

    public static List<String> printElementsGreaterThanFiveInList(List<String> list){
        return list.stream().filter(t -> t.length()>5).map(String::toUpperCase).collect(Collectors.toList());

    }


     /*
    Create a method returning version of the list as follows:
    1.	must contain UNIQUE elements
    2.  must be in alphabetical order
    3. must be in lowercase
    4. must return as a list as well
    5. print the elements in the same line with space between
     */

    public static List<String> printUniqueSortedElementsInList(List<String> list){
        return list.stream().distinct().sorted().map(t-> t.toLowerCase()).collect(Collectors.toList());
    }








}
