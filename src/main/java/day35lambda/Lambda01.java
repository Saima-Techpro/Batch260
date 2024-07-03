package day35lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {
        /*
        How to print the text from a given text file on the console?

       a) "lines()" is a method of the Files class. It returns a Stream<String> for reading data line by line
        from a specified file path.
        This allows you to perform stream operations on each line in the file.

         b) Paths.get() is a static method of the Paths class.
            It returns a Path object representing the given file path string.
            This Path object is used for file and directory operations. (provides access to them)

         */

        //Example 1: Write the code that prints the text from a text file on the console.
        Path path = Path.of("src/main/java/day35lambda/File.txt");
        Files.lines(path).forEach(System.out::println);


        //Example 2: Write the code that prints the text in UPPERCASE from a text file on the console.
        Files.lines(path).map(String::toUpperCase).forEach(System.out::println);


        //Example 3: Write the code that prints all words from the text file
        List<String> words=  Files.lines(path).
                map(t -> t.replaceAll("\\p{Punct}", "").
                        split(" ")).  // returns String Array
                        flatMap(Arrays::stream). // is going to return it to stream structure
                        collect(Collectors.toList());

        System.out.println("words = " + words);


        //Example 4: Write the code that prints UNIQUE words from the text file
        List<String> uniqueWords=  Files.lines(path).
                map(t -> t.replaceAll("\\p{Punct}", "").  // map() returns update stream (all punctuation removed)
                        split(" ")).  // returns String Array of words
                        flatMap(Arrays::stream). // is going to return it to stream structure
                        distinct().
                        collect(Collectors.toList());

        System.out.println("unique Words = " + uniqueWords);



        //Example 5: Write the code that prints all letters from the text file
        List<String> letters =  Files.lines(path).
                map(t -> t.replaceAll("\\p{Punct}", "").
                        split("")).  // returns String Array of letters
                        flatMap(Arrays::stream). // is going to return it to stream structure
                        toList(); // replaces collect(Collectors.toList()

        System.out.println("letters = " + letters);

        //Example 6: Write the code to count letters in our text file (count())

        long numOfLetters = Files.lines(path).
                             map(t -> t.replaceAll("\\p{Punct}", "").
                             split("")).  // returns String Array of letters
                             flatMap(Arrays::stream).count();

        System.out.println("numOfLetters = " + numOfLetters);  // 438


        //Example 6: Write the code to check if text file contains "library"
         boolean isTrue = Files.lines(path).
                map(t -> t.replaceAll("\\p{Punct}", "").
                        split(" ")).  // returns String Array of words
                flatMap(Arrays::stream).anyMatch(t -> t.contains("library"));

        System.out.println("isTrue = " + isTrue);  // false


    }
}
