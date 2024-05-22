package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {

        // How to check if the two arrays are equal?

        int [] a = {3, 6, 8};
        int [] b = {3, 8, 8};

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

        boolean check = Arrays.equals(a , b);
        System.out.println("check = " + check);  // false


        // INTERVIEW QUESTION
        // Move all zero elements to the end of array from a given array

        int[] arr = {0, 2, 5, 0, 12, 17,0, 0, 21};  // => {2, 5, 12, 17, 0, 0, 0}
        System.out.println("arr = " + Arrays.toString(arr));  // [0, 2, 5, 0, 12, 17, 0]

        int[] brr = new int[arr.length];  // empty array with the given size => get the size in dynamic way

        int index = 0;
        for (int w : arr){

            if ( w != 0){
                 brr[index] = w;
                 index++;
            }
            System.out.println(Arrays.toString(brr));
        }

        // HW: Create an array to store names of students.
        // Ask user to enter the names
        // Use loops to get the names from the user
        // Print all the names of the students on the console

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students you want to register");
        int numOfStudents = scan.nextInt();

        String[] studentNames = new String[numOfStudents];
        System.out.println("studentNames = " + Arrays.toString(studentNames));  // [null, null, null, null, null]


        for (int i =0; i < numOfStudents; i++) {

            System.out.println("Please enter " +(i+1) +" the name of the student. To stop, press Q");

            String inputNames = scan.next();

            if ( !inputNames.equalsIgnoreCase("Q")) {

                studentNames[i] = (inputNames.replaceAll("\\s++", " "));
            } else {
                break;  // sentinel value
            }
        }
        System.out.println(Arrays.toString(studentNames));  // [Tom, null]
        System.out.println(studentNames[0]);  // Tom


        scan.close();


    }
}
/*
In computer programming, a sentinel value (also referred to as a flag value, trip value, rogue value, signal value, or
dummy data) is a special value in the context of an algorithm which uses its presence as a
condition of termination, typically in a loop or recursive algorithm.
 */