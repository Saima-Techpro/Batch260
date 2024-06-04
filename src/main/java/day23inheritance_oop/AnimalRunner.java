package day23inheritance_oop;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
        cat.drink();
        cat.feedWithMilk();

        // Create other objects

        Dog dog = new Dog();
        dog.bark();
        dog.drink();
        dog.eat();

        Bird bird = new Bird();
        bird.tweet();
        bird.drink();
        bird.eat();

        /*
        Notes:

    OOP => Object-Oriented Programming Language

    //It is the way how various objects we see in real life are transferred into computer environment
    //For example: showing an object's colour, state, name, year of manufacture, among many other properties

        OOP language has 4 fundamental characteristics.
        1. Inheritance
        2. Polymorphism
        3. Encapsulation
        4. Abstraction

        1)Inheritance
        It is a concept that transfers properties from one class to other classes
        We use "extends" keyword in child class to inherit from parent


    1. We use "inheritance"
       a) to prevent "repetition"
       b) to make "maintenance" easy
       c) to make our classes "atomic"

     2. To make a class child of another class, we use "extends" keyword

     3. Child classes can use class members from the parent classes
        However, parent classes cannot use anything from the child classes.
        (one way direction)
     4. Every class in Java has at least one parent class, which is "Object Class".
        "Object Class" is like Adam .. it doesn't have parent class.

     5. Inheritance types in Java
        a) Multilevel Inheritance  => Grandparent => parent => child
        b) Hierarchical Inheritance => Single parent => Many children
        c) Multiple Inheritance => more than one parent at the same level (Java doesn't support it)
        d) Opposite of "Multiple Inheritance" is "Single Inheritance"
          Java supports "Single Inheritance"

        Java does not support "Multiple Inheritance". It supports "Single Inheritance"

        IS-A relationship and HAS-A relationship

        Mammal IS-A child of Animal => true
        Bird IS-A child of Mammal => true
        Bird IS-A child of Animal => true
        Cat IS_A Mammal => true

        Animal HAS-A Mammal => true
        Cat HAS-A Mammal => false
        Dog HAS-A Animal => false
        Dog HAS-A Mammal => false


       In Java, the relationship from parent to child is called a HAS-A Relationship (from top to bottom)
       In Java, the relationship from child to parent is called an IS-A Relationship (from bottom to top)



         */

    }
}
