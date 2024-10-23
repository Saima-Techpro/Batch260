package day29maps;

import java.util.HashMap;
import java.util.Scanner;

public class HW2 {
    /*
        Homework: Interview Question
        - Write code that shows how many times each word is used in a given String.
        - The operation should be case-insensitive.
        - Mike is Mike.  => mike is mike ==> mike, is, mike
        - expected result should be in a map => {mike=2, is=1}
       */
    private HashMap<String, Integer> wordCount;
    private HashMap<String, Integer> letterCount;
    private String text;

    // constructor
    public HW2(){
        wordCount = new HashMap<String, Integer>();
        letterCount = new HashMap<String, Integer>();
    }

    // get sentence from the user
    Scanner input = new Scanner(System.in);



    public void getText(){
        System.out.print("Please enter your text: ");
        this.text = input.nextLine();
    }
    public void countWord() {
        for (int i = 0; i < text.split(" ").length; i++) {
            String key = text.split(" ")[i];
            Integer value = wordCount.get(text.split(" ")[i]);
            if (wordCount.containsKey(key)) {
                wordCount.put(key, value + 1);
            }
            else {
                wordCount.put(key, 1);
            }
        }
    }
    public void countLetter() {
        for (int i = 0; i < text.split("").length; i++) {
            String key = text.split("")[i];
            Integer value = letterCount.get(text.split("")[i]);
            if (letterCount.containsKey(key)) {
                letterCount.put(key, value + 1);
            } else {
                letterCount.put(key, 1);
            }
        }
    }
    public void showCount(){
        System.out.println(wordCount);
    }
    public void showLetterCount(){
        System.out.println(letterCount);
    }

    public static void main(String[] args) {
        HW2 hw2 = new HW2();
        hw2.getText();
        hw2.countWord();
        hw2.showCount();
        hw2.countLetter();
        hw2.showLetterCount();

    }
}
