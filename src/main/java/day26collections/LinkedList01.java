package day26collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        /*
        Collections are a set of classes and interfaces used to store and process objects.

    There are three main Collections:
        1) List(interface)  ==>  a) ArrayList  (concrete class)     b) LinkedList (concrete class)
        2) Queue ==>  a)Priority Queue   b) Deque
        3) Set   ==>  a) HashSet         b) LinkedHashSet   c) TreeSet

        a) ArrayLists are successful in "search operations" but not good at "adding" and "removing" operations.
        b) LinkedList are successful in "adding" and "removing" operations but not good at "search operations".

        Structural difference:
        LinkedLists have "nodes" , not elements. "Nodes" consist of 2 parts:
                1) data  2) pointer
                "Pointer" acts like index but is not an index.

        Functional difference:
        When we add or remove any node, LinkedLists don't have to re-index all the remaining data that's why it is
        successful at adding and removing.
        When we add/remove data from LinkedLists , it adds another node (data+pointer) in the middle or remove it in
        removing operation, but doesn't change/check the other nodes.
         */

        ArrayList<String> list1 = new ArrayList();  // concrete class constructor to reach out ArrayList concrete class
        // List<String> list2 = new List();  // error=> because interfaces don't have constructors
        List<String> list2 = new ArrayList<>(); // concrete class constructor to reach out List interface
        LinkedList<String> list = new LinkedList<>();
        Object list3 = new ArrayList<>();   // This also works

        /*
        Arrays[] are fixed length / structure. They can't dynamically grow small / big.
        Multidimensional Arrays are also complex structures. Not suitable for dynamic elements; lack flexibility.

        We use Lists (ArrayList or LinkedList to store multiple values, so we can change size (add/remove elements) dynamically.

         */

        LinkedList<String> myList = new LinkedList<>();

        // 1. add() method
        myList.add("Hulya");
        myList.add("Husnu");
        myList.add("Junaid");
        myList.add("Henok");

        System.out.println("myList = " + myList);  // myList = [Hulya, Husnu, Junaid, Henok]

        // Linked List structural design => [Head]-> Hulya-> Husnu-> Junaid-> Henok-> null [Tail]
        //                                       node has 2 parts:  1. data 2. pointer where pointer acts like an index
        // NOTE: LinkedList don't have indexes. Pointers act like an index.

        // 2. add(ind, string) method
        myList.add(2, "Uranus");  // adds the value at the specified place
        System.out.println("myList = " + myList);  // [Hulya, Husnu, Uranus, Junaid, Henok]

        // 3. addFirst() method
        myList.addFirst("Nataliya");
        System.out.println("myList = " + myList);  // [Nataliya, Hulya, Husnu, Uranus, Junaid, Henok]

        // 4. addLast() method
        myList.addLast("Anisa");
        System.out.println("myList = " + myList);

        List<String> classList = new LinkedList<>();
        classList.add("Emily");
        classList.add("Kiera");
        classList.add("Denzel");
        System.out.println("classList = " + classList);

        // 5. addAll()
//        myList.addAll(classList);
//        System.out.println(myList);  // [Nataliya, Hulya, Husnu, Uranus, Junaid, Henok, Anisa, Emily, Kiera, Denzel]

        // 6. addAll(ind, list)
        myList.addAll(4, classList);
        System.out.println(myList);  // [Nataliya, Hulya, Husnu, Uranus, Emily, Kiera, Denzel, Junaid, Henok, Anisa]

        // 7. remove(Object o)
        System.out.println(myList.remove("Emily")); // true
        System.out.println(myList);  // [Nataliya, Hulya, Husnu, Uranus, Kiera, Denzel, Junaid, Henok, Anisa]

        System.out.println(myList.remove(4)); // Kiera
        System.out.println(myList);  // [Nataliya, Hulya, Husnu, Uranus, Denzel, Junaid, Henok, Anisa]

        // 8. removeFirst()
        String nameRemoved = myList.removeFirst();
        System.out.println("nameRemoved = " + nameRemoved); // Nataliya

        // 9. removeLast()
        System.out.println(myList.removeLast());  // Anisa


        // 10. removeFirstOccurrence()
        myList.add("Tom");
        myList.add(3, "Tom");
        System.out.println(myList);  // [Hulya, Husnu, Tom, Uranus, Denzel, Junaid, Henok, Anisa, Tom]

        System.out.println(myList.removeFirstOccurrence("Tom"));  // true
        System.out.println(myList); // [Hulya, Husnu, Uranus, Denzel, Junaid, Henok, Tom]

        // 11. removeLastOccurrence()
        myList.removeLastOccurrence("Tom");
        System.out.println(myList); // [Hulya, Husnu, Uranus, Denzel, Junaid, Henok]

        // 12. poll()  => retrieves and removes the head of the list, returns null if the list is empty
        System.out.println(myList.poll());  // Hulya
        System.out.println(myList); // [Husnu, Uranus, Denzel, Junaid, Henok]

        // 13. element() => retrieves the head of the list but done NOT remove it, throws exception if the list is empty
        System.out.println(myList.element());  // Husnu
        System.out.println(myList);  // [Husnu, Uranus, Denzel, Junaid, Henok]

        // 14. pop() => retrieves and removes the head of the list, throws exception if the list is empty
        System.out.println(myList.pop()); // Husnu
        System.out.println(myList);  // [Uranus, Denzel, Junaid, Henok]


        // Example 1: If the number of characters in the given list is more than 4, remove them from the list.
        // Don't use for-each loop

        LinkedList<String> names = new LinkedList<>();
        names.add("Mark");
        names.add("Emily");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Alexander");
        names.add("Asye");
        System.out.println("names = " + names);  // [Mark, Emily, Tom, Jeremy, Alexander, Asye]

        for (int i = 0; i < names.size()  ; i++) {

            if (names.get(i).length()>4){
                names.remove(names.get(i));
                i--;
            }
        }
        System.out.println("names = " + names);  // [Mark, Tom, Asye]

        // HW: Change all names that start with 'A' to '****'


    }
}
