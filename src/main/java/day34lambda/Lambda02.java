package day34lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Fatma");
        myList.add("Veli");
        myList.add("Yusuf");
        myList.add("Maryam");
        myList.add("Nataliya");
        myList.add("Josef");

        System.out.println("myList = " + myList);  // [Ali, Fatma, Veli, Yusuf, Maryam, Nataliya, Josef]
        // method call
        // removeIfGreaterThanFive(myList);
       // removeElementsWithSpecificLetters(myList);
        //removeElementsWithA(myList);

        //removeElements1(myList);  // [Ali, Nataliya]

//        System.out.println(checkLength(myList));

        System.out.println(checkLength1(myList)); // true
        System.out.println(checkInitials(myList)); // true
        System.out.println(checkLastChar(myList)); // true
    }


    // Create a method to delete elements whose length is greater than 4
    public static void removeIfGreaterThanFive(List<String> list){
        // we don't need to use stream() here because removeIf() method is coming from Collection interface
        // so we can use it directly.
        list.removeIf(t -> t.length() > 4);
        System.out.println(list);

        // removeIf() removes the element only if the condition inside is true
    }

    // Create a method to delete the elements which start with 'Y' and end with 'f'
    // [Ali, Fatma, Veli, Yusuf, Maryam, Nataliya, Josef]
    public static void removeElementsWithSpecificLetters(List<String> list){
        list.removeIf(t-> t.charAt(0) == 'Y'  || t.charAt(t.length()-1) == 'f');

        System.out.println(list);  // [Ali, Fatma, Veli, Maryam, Nataliya]
    }


    // Create a method to delete the elements which contain 'a'
    public static void removeElementsWithA(List<String> list){
        list.removeIf(t -> t.contains("a"));
        System.out.println(list);
    }

    // Remove the elements if the length is between 4 and 7 and ending with 'a'
    // [Ali, Fatma, Veli, Yusuf, Maryam, Nataliya, Josef]
    public static void removeElements1(List<String> list) {
        Predicate<String> condition = t -> t.length() > 3 && t.length() < 8 || t.endsWith("a");
        list.removeIf(t -> condition.test(t));
        System.out.println(list);
    }

    // Create a method to check if the length of all elements is greater than 6
    public static boolean checkLength(List<String> list) {
        return list.stream().allMatch(t -> t.length() > 6);
    }

    // Create a method to check if the length of any element is less than 5
    public static boolean checkLength1(List<String> list) {
        Predicate<String> condition = t -> t.length() < 5 ;
        return list.stream().anyMatch(t -> condition.test(t));
    }


    // Create a method to check that no element starts with 'X'
    public static boolean checkInitials(List<String> list) {
        Predicate<String> condition = t -> t.startsWith("X") ;
        return list.stream().noneMatch(condition::test);
    }

    // Create a method to check if any element ends with 'f'
    public static boolean checkLastChar(List<String> list) {
        Predicate<String> condition = t -> t.charAt(t.length()-1) == 'f';
        return list.stream().anyMatch(condition::test);
    }

}
