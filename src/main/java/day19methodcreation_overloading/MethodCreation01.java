package day19methodcreation_overloading;

public class MethodCreation01 {

    public static int add(int a, int b){
        int result = a+b;
        return  result;  // return keyword provides the result of the codes inside that method whenever it is called
    }



    public static void main(String[] args) {

        /*
        Main method is considered the engine in Java.

        We can NOT create methods inside the main method.
        We can create methods OUTSIDE main method and then call those methods in the main method to implement them.

        Syntax:
        AccessModifier + static (optional) + returnType (when we need it) + methodName + () + method body{}

        The methods that we create, we can call them in our main method to perform that function for us.
        This is called "Method Call"


        add(int a, int b)  => this part is called "Method Signature" => name of the method  + parameters / arguments
        In this example, add() is the name of the method, and 'int a' and 'int b' are the parameters / arguments

         methods provided by Java
         Math.max();
        String str = new String();
        str.substring();

          */

        // method call
        System.out.println(add(3, 5));
        System.out.println(add(12, 5));
        System.out.println(add(6, 15));

    }

}
