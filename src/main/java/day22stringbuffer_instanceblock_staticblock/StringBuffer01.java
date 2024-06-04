package day22stringbuffer_instanceblock_staticblock;

public class StringBuffer01 {
    public static void main(String[] args) {

        /*

        1) StringBuffer is another class in Java that produces Strings.
       StringBuffer is the first class created by Java to produce Strings.

    2) StringBuffer is very similar to StringBuilder, meaning both produce "mutable" (changeable) Strings.
    3) StringBuffer is "multi-threaded", but StringBuilder is not.
    4) Because StringBuilder is not multi-threaded, it operates faster than StringBuffer.
    5) In multi-threaded environments, the order of operations is important. Organizing operations in a logical
    sequence is called "synchronization".
       Since StringBuffer is multi-threaded, it is also synchronized.

    We have learned about three classes that create Strings;
    1) If an Immutable String is needed ==> String class
    2) For a Mutable String, use StringBuilder or StringBuffer
       a) Use StringBuilder when multi-threading is not needed
       b) Use StringBuffer when multi-threading is required

            Difference between single thread and multi thread

Simplicity and Predictability: A single thread makes the program simpler and more predictable. Therefore, using a
single thread is easier for small and simple applications.

Resource Control: A single thread makes it easier to keep certain resources (e.g., file access) under control. Using
multiple threads requires sharing and synchronizing resources, which can be more complex.

Performance Optimization: Some tasks may perform better with a single thread. Especially, CPU-intensive tasks may
benefit from a simpler single-thread approach. Also, when specific tasks need to be done sequentially, using a single
 thread makes sense.

Platform Independence: A single thread provides more consistent behavior across different operating systems and
platforms. Using multiple threads can introduce platform-dependent issues and behavior differences.

Data Integrity: A single thread can be more easily managed to maintain data integrity. Using multiple threads
requires careful attention to data integrity issues and the use of synchronization mechanisms.

         */

        StringBuffer sbf = new StringBuffer("Buffer");
        System.out.println(sbf);

        // As StringBuffer and StingBuilder are not as rich in terms of methods, we can change them to String using
        // toString() and have access to all methods from String Class.

        System.out.println(sbf.toString().toUpperCase());

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.toString().toLowerCase());

        // Can we change them back to StringBuffer or StringBuilder?

        StringBuilder sb1 = new StringBuilder(sb);

        StringBuffer sbf1 = new StringBuffer(sbf);



    }
}
