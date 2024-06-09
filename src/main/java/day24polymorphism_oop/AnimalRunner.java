package day24polymorphism_oop;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat cat = new Cat();
        //before over-rinding
        //cat.eat();  // Animals eat...
        // after over-rinding
        cat.eat(); // Cats love to eat fish.


        Dog dog = new Dog();
        //before over-rinding
        //dog.eat();  // Animals eat...

        //after over-rinding
        dog.eat();  // Dogs love to eat meat.
        dog.create();
        dog.feedWithMilk();





    }
}
