package javapractice;

import java.util.ArrayList;

public class ArrayListRotator {
    public static void rotateArrayList(ArrayList<Integer> list, int n) {
        int size = list.size();
        n = n % size;  // Handle cases where n > size

        if (n == 0) {
            return;  // No need to rotate if n is 0 or a multiple of size
        }

        // Store the last n elements in a temporary list
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = size - n; i < size; i++) {
            temp.add(list.get(i));
        }

        // Shift the remaining elements to the right
        for (int i = size - 1; i >= n; i--) {
            list.set(i, list.get(i - n));
        }

        // Place the stored elements from temp into the first positions
        for (int i = 0; i < n; i++) {
            list.set(i, temp.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> queue = new ArrayList<>();
        // Simulating a queue of people (represented by numbers 1 to 7)
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println("Original queue: " + queue);

        // Rotate the queue by 3 positions
        rotateArrayList(queue, 3);

        System.out.println("Queue after rotation: " + queue);
    }
}
