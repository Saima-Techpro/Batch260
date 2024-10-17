package javapractice;

import java.util.ArrayList;


public class ArrayList_HW {
    public static void main(String[] args) {

        /*
        Write a Java method that takes an ArrayList<Integer> as input and returns the element that appears
        the most times in the list. If there are multiple elements with the same highest frequency,
        return the first one that appears in the list.

        Real life implementation:
        Imagine you are running a customer survey for a new product, and customers are rating the product
        on a scale of 1 to 5. You’ve collected the survey responses and stored the ratings in an ArrayList<Integer>.
        Now, you want to find out which rating was given most frequently, so you can understand the general
        sentiment of your customers.
         */



        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(6);
        list.add(3);

        System.out.println("list = " + list);

        int mostFrequent = list.get(0); // Assume the first element is the most frequent
        int maxCount = 0;

        // Outer loop to go through each element

        for (int i = 0; i < list.size(); i++) {
            int currentElement = list.get(i);
            int count = 0;

            // Inner loop to count occurrences of currentElement
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(currentElement)) {
                    count++;
                }
            }

            // Update mostFrequent if currentElement has a higher frequency
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = currentElement;
            }
        }
        System.out.println("mostFrequent = " + mostFrequent);


        /*

        Write a Java method that takes an ArrayList<Integer> and an integer n as input and rotates the list to
        the right by n positions. The method should modify the original list.


        Real life implementation:
        Imagine you're running a ticketing system for a concert where customers are queued in an online waiting list.
        Suddenly, the first n people in the queue encounter an issue, so you decide to move them to the back of the line.
        Essentially, you're rotating the queue to shift those first n people to the end.
         */

        ArrayList<Integer> queue = new ArrayList<>();
        //  a queue of people (represented by numbers 1 to 7)
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println("Original queue: " + queue);

        // Number of positions to rotate
        int n = 3;

        int size = queue.size();
        System.out.println("size = " + size); // 7
        //n = n % size;  // Handle cases where n > size


        if (n != 0) {  // Only rotate if n is not 0
            // Store the first n elements in a temporary list
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(queue.get(i));
            }

            // Shift the remaining elements to the left
            for (int i = n; i < size; i++) {
                queue.set(i - n, queue.get(i));
            }

            // Place the stored elements from temp into the last positions
            for (int i = 0; i < n; i++) {
                queue.set(size - n + i, temp.get(i));
            }
        }

        System.out.println("Queue after rotation: " + queue);




        /*
        Write a Java method that takes an ArrayList<String> as input and returns a new
        ArrayList<String> with the elements in reverse order.
        You are not allowed to use any built-in reverse method.
         */

        // Create a String ArrayList and assign values
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");
        fruitList.add("Elderberry");

        System.out.println("Original fruitList: " + fruitList);

        // Create a new ArrayList to hold the reversed elements
        ArrayList<String> reversedList = new ArrayList<>();

        // Traverse the list from the end to the beginning
        for (int i = fruitList.size() - 1; i >= 0; i--) {
            reversedList.add(fruitList.get(i));
        }

        // Print the reversed list
        System.out.println("Reversed list: " + reversedList);


        /*
        Write a Java method that takes two ArrayList<Integer> objects, both sorted in ascending order,
        and merges them into a single sorted ArrayList<Integer>

        Real life scenario:
        Imagine you have two different online platforms that sell concert tickets, and
        each platform has a sorted list of ticket prices. You want to merge these two lists into one sorted list
        to compare prices easily.
         */

        // Create and populate the first sorted ArrayList of ticket prices
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(50);  // Price from Platform A
        list1.add(75);
        list1.add(100);
        //list1.add(120);


        // Create and populate the second sorted ArrayList of ticket prices
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);  // Price from Platform B
        list2.add(80);
        list2.add(120);
        list2.add(135);

        // Print original lists
        System.out.println("Ticket Prices from Platform A: " + list1);
        System.out.println("Ticket Prices from Platform B: " + list2);

        // Merging logic
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Merge both lists while there are elements in both lists
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        System.out.println("mergedList = " + mergedList);

        // To ensure remaining elements from list1 are added
        // Add remaining elements from list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        System.out.println("mergedList after 2nd while loop = " + mergedList);

        // To ensure remaining elements from list2 are added
        // Add remaining elements from list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        // System.out.println("mergedList after 3rd while loop = " + mergedList);

        // Print the merged sorted list
        System.out.println("Merged Sorted Ticket Prices: " + mergedList);



    }
}
