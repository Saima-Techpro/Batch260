package day24polymorphism_oop;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cats meow ... ");
    }


    @Override
    public void eat() {
        System.out.println("Cats love to eat fish.");
    }



}
