package day24polymorphism_oop;

public class Dog extends Mammal{


    public void bark(){
        System.out.println("Dogs bark...");
    }

    @Override
    public void eat(){
        System.out.println("Dogs love to eat meat.");
    }

//    @Override
//    public Animal create() {
//        System.out.println("Inheritance allows to create Dog obj from Animal return type.");
//        return new Animal(); // Here we are creating Animal object which is same as class
//    }

    @Override
    public Animal create() {
        System.out.println("Inheritance allows to create Dog obj from Animal return type.");
        return new Dog();  // Here we are creating dog object and Dog is the child class of Animal
                            // we can return child data type under parent
    }
//
//    @Override
//    public Integer add(int a, int b) {
//        return a+b;
//    }   // Primitive data types are not classes.
          //So no parent-child relation, so we can't change return data type


    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Dogs like milk too.");
    }
}
