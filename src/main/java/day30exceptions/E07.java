package day30exceptions;

public class E07 {
    public static void main(String[] args) {
        printAge(12);
        printAge(81);
        // printAge(-5); // IllegalArgumentException will be thrown because we asked for it in our if statement

        try{
            printAge(-5);
        }catch (IllegalArgumentException e){
            System.out.println("What kind of age is this?");
        }

    }

    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age can't be less than zero");
        }else {
            System.out.println("Age: "+age);
        }
    }

    // NOTE: by using "throw new", we can throw any exception at any point in our code depending upon the condition
}
