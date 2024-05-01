package day02variablesconcatenation;

public class Variable01 {
    public static void main(String[] args) {


        // Example: Create a variable to store number of cells of a human body
        long numbOfCells = 12345678912L; // Java will assume that this value needs to be stored as int.
                                        // Initially it allocates the memory as int UNLESS we insist on using long data type.
                                        // WE can insist by adding 'L' or 'l' in th end of the value.
        System.out.println(numbOfCells);
        System.out.println("Number of cells:" + numbOfCells);

        // Example: Create two float variables and print their total value on the console with the message

        float num1 = 525.30f , num2 = 244.24f;
        System.out.println("Result: " + (num1+num2));

        float result = num1 + num2;
        System.out.println("Result1: " + result);

        System.out.println("Result 2: " + result); // result.soutv+enter

        // Example: Create a char variable and an int variable and try to add them

        char a = 'X';
        int b = 55;

        System.out.println(a + b); // 143

        // When we use char data type in maths operation, Java uses ASCII value of the given letter/character and then does the addition
        // ASCII value of 'X' is 88,  ASCII value of 'x' is 120

    }
}
