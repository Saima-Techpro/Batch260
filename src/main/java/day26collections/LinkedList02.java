package day26collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("Mars", "Earth", "Moon"));
        System.out.println("list1 = " + list1);  // [Mars, Earth, Moon]
        list1.add("Jupitar");
        System.out.println("list1 = " + list1); // [Mars, Earth, Moon, Jupitar]

        /*
        Structure: list1 is a LinkedList that is constructed by passing a List created using Arrays.asList.
        Internally, Arrays.asList returns a fixed-size, mutable list backed by an array.
        Then, the LinkedList constructor creates a new LinkedList by copying the elements from this list.

        Mutability: The resulting list1 is mutable, meaning you can add, remove, or modify elements.
        Underlying Data Structure: The underlying structure of list1 is a doubly linked list, which allows
        efficient insertion and deletion of elements from both ends.
         */


        LinkedList<String> list2 = new LinkedList<>(List.of("Mars", "Earth", "Moon"));
        System.out.println("list2 = " + list2); // [Mars, Earth, Moon]
        list2.add("Mercury");
        System.out.println("list2 = " + list2); // [Mars, Earth, Moon, Mercury]
        /*
        Structure: list2 is also a LinkedList but is constructed using List.of, which returns an immutable list.
        However, the LinkedList constructor copies the elements from the immutable list into a mutable LinkedList.

        Mutability: Like list1, list2 is mutable because LinkedList allows modifications (even though the source list,
        List.of, is immutable).
        Underlying Data Structure: The underlying structure is a doubly linked list, similar to list1.
         */

        List<String> list3 = List.of("Mars", "Earth", "Moon");
        System.out.println("list3 = " + list3); // [Mars, Earth, Moon]
//        list3.add("Pluto");  // IMMUTABLE LIST
//        System.out.println("list3 = " + list3); // UnsupportedOperationException

        /*
        Structure: list3 is a list created using List.of, which returns an immutable list.
        The list is structurally fixed and does not allow modifications such as adding or removing elements.

        Mutability: list3 is immutable, meaning you cannot modify its contents after creation (any attempt to
        do so will throw an UnsupportedOperationException).
        Underlying Data Structure: The underlying structure is an immutable list implementation that is optimized
        for memory and performance, but its exact structure is implementation-dependent and not publicly specified.
        It does not allow any structural changes.
         */


        //  poll()  => retrieves and removes the head of the list, returns null if the list is empty
        // list1 = [Mars, Earth, Moon, Jupitar]
        System.out.println(list1.poll());  // Mars
        System.out.println(list1); // [Earth, Moon, Jupitar]

        // element() => retrieves the head of the list but done NOT remove it, throws exception if the list is empty
        System.out.println(list1.element());  // Earth
        System.out.println(list1);  // [Earth, Moon, Jupitar]

        // 14. pop() => retrieves and removes the head of the list, throws exception if the list is empty
        System.out.println(list1.pop()); // Earth
        System.out.println(list1);  // [Moon, Jupitar]



    }
}
