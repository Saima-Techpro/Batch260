package day29maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HW {
    public static void main(String[] args) {

       /*
       Homework: Interview Question
        - Write code that shows how many times each word is used in a given String.
        - The operation should be case-insensitive.
        - Mike is Mike.  => mike is mike ==> mike, is, mike
        - expected result should be in a map => {mike=2, is=1}
        */

        String str = "Mike is Mike.";

        str = str.replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println("v1 => " + str); //v1 => mike is mike

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words)); //[mike, is, mike]

        //create an empty map to store words and number of usage

        HashMap<String, Integer> myMap = new HashMap<>();
        for(String w : words){  //[mike, is, mike]
            Integer usage = myMap.get(w); //check the map if there is any value of the key; if no, put the key into the map with value of 1
            //...if yes, put key into map by increasing existing value by one
            if(usage == null){
                myMap.put(w, 1);
            }else{
                myMap.put(w, usage+1);
            }
        }
        System.out.println(myMap);//{mike=2, is=1}


        // Hulya's solution
        String sentence = "How much wood would a woodchuck chuck if a woodchuck could Chuck wood WOOD";
        String[] splittedSentence = sentence.toLowerCase().split(" ");

        Map<String, Integer> map = new HashMap<String, Integer> ();

        for (String s:splittedSentence) {
            if (!map.containsKey(s)) {  // if map doesn't contain the string
                map.put(s, 1);
            }
            else {

                int count = map.get(s); // returns the value of s
                map.put(s, count + 1);

            }

        }
        System.out.println(map);





        //Homework: Write code that shows how many times each character is used in a given String
        //           “Hello” ==> H=1, e=1, l=2, o=1




    }
}
