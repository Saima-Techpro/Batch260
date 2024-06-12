package day26interfaces;

public interface Brake {

    public abstract void abs();
    void esp(int a);

    void run();

    // NOTE: we can insist on creating concrete methods in interface by using
    // two keywords:  1. 'static' and 2. 'default'

    static void speed(){
        System.out.println("takes 3 sec to stop at 200km per hour speed");
    }

    default void power(){// here 'default' is NOT an access modifier. It's considered a keyword
        System.out.println("200km per hour... ");
    }




}

/*
    - An interface can be thought of as an agreement/ requirement that classes have to implement.
    -  An interface contains abstract methods with or without method signature (name and parameter) but does NOT
       define its implementation.
    - Classes which have inheritance relation with these interfaces have to implement these methods.
    - abstract methods are incomplete methods which MUST be completed by a child class
    - Methods inside an interface are automatically 'public' and 'abstract' so we don't need to use these keywords
      while creating these methods.
    - 'static' methods are not allowed in interfaces


    // Can we create concrete methods in interface?
    // Yes, we can.


 */

