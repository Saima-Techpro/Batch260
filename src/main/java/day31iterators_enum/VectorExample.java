package day31iterators_enum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) throws InterruptedException {

        int size = 1000000;

        List<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++){
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Added "+ size + " elements to ArrayList: " +(end - start) + "ms");


        // Vector
        List<Integer> vector = new Vector<>();

       start = System.currentTimeMillis();

        for (int i = 0; i < size; i++){
            vector.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Added "+ size + " elements to Vector: " +(end - start) + "ms");

        // ArrayList is faster in the above example (single thread)



        // Multiple-threading in ArrayList


        List<Integer> multiThreadedList = new ArrayList<>();
        // List<Integer> multiThreadedList = Collections.synchronizedList(new ArrayList<>()); => wrap around to make ArrayList thread safe.
        start = System.currentTimeMillis();

        Thread t1 = new Thread( () -> {
            for (int i= 0; i<size; i++){
                multiThreadedList.add(i);
            }
        });


        Thread t2 = new Thread( () -> {
            for (int i= 0; i<size; i++){
                multiThreadedList.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        System.out.println("Added elements in a multi-threaded way to an ArrayList " +(end - start) + "ms");
        System.out.println("Size is multiThreadedList " + multiThreadedList.size());


        // Multiple-threading in Vector
        List<Integer> multiThreadedVector =  new Vector<>();
        start = System.currentTimeMillis();

         t1 = new Thread( () -> {
            for (int i= 0; i<size; i++){
                multiThreadedVector.add(i);
            }
        });


         t2 = new Thread( () -> {
            for (int i= 0; i<size; i++){
                multiThreadedVector.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        System.out.println("Added elements in a multi-threaded way to a Vector " +(end - start) + "ms");

        System.out.println("Size is multiThreadedVector " + multiThreadedVector.size());


        /*

        Operations on ArrayList are fast but non-synchronized (not safe for multiple threads)
        Operations on Vector are slower but synchronized (safe for multiple threads)

        Can we make ArrayList be made synchronized?
        YES
        List<Integer> multiThreadedList = Collections.synchronizedList(new ArrayList<>()); => wrap around to make ArrayList thread safe.

        https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Vector.html

         */
    }
}
