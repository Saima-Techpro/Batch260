package day24polymorphism_oop;

public class Animal {

    /*
            NOTES on POLYMORPHISM
      - Polymorphism => poly means many , morphism means forms  => many forms
      - Polymorphism is the 2nd characteristic of OOP concept
      - Polymorphism is used to implement the methods in many ways
      - Polymorphism consists of two parts:
          1) Method Overloading (learned previously)
          2) Method Overriding
             In Method Overriding, child classes use the methods from parent class but implement
             them after some modification.

       Real life example:
       BROWSERS => safari, chrome, edge, mozilla, opera, firefox etc.
       All these types of browsers are actually child classes of Browser class.
       Browser class has some common features like navigation(), version variable etc.
       All browsers inherit these common features from the parent class and then
       implement them for their specific needs after some modification.


       ********* Rules for Method Overriding *********

       1) Private methods cannot be overridden!
       2) Access modifier of the method in child class can not be more
            restrictive / narrower than the access modifier of the method in parent class
       3) Final members in a class can not be overridden.
         Bcs Final keyword is used to prevent any change on the variable or method or class.
         So if we have final keyword, we have the latest version that we can ever assign
      4) If a class is final, can not be inherited...
      5) Static members cannot be overridden...Bcs static members are class property and are common for all the objects...



     */

    // public final int a;  => final variables cannot be created without assigning a value
     public final int a = 23;  //final variables cannot be created without assigning a value
    // a = 12;   // final variables cannot be updated

    public static int year;

     public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

    // Let's create some methods with a return type

    // return type => int => primitive data types
    //  is it a class as well? NO because primitive data types cannot be classes
    public int add(int a, int b){
        return a+b;
    }


    public Number multiply(Integer a , Integer b){
        return a*b;
    }

    // return type is this current class. Because custom classes can also be used
    // as data types

    public Animal create(){
        // Animal animal = new Animal();
        System.out.println("Classes can be used as data type.");
        return new Animal();
    }






}
