package day25abstraction_oop;

public abstract class Honda {

    public void music(){// This one is concrete method because it has a body
        System.out.println("Pro music system... ");
    }

    public abstract void engine(); // this one is abstract method because it has does not body.
                                    // This method is incomplete. So it needs to be completed by any class which inherits from it.

}

/*
        Notes about ABSTRACTION

        Abstract classes cannot be used for object creation. We create
        abstract classes for categorizing some features and to determine
        general characteristics that will be followed by all child classes.

        Inheritance -> Over-riding -> Abstraction
        Concrete method => a method which has a method body =>{}
        Abstract method => a method which does NOT have a body.

        Rules of abstraction:

        1) Abstract methods do not have a body. They tell you what is done, not how it's done.

       2) Methods with a body are called 'non-abstract' or 'concrete' methods. (music()in this example)

       3) Abstract methods MUST be overridden(mandatory), meaning they must be used by all child classes.(required) e.g. engine() for all cars)

       4) Abstract methods can only be created within abstract classes.

       5) Abstract classes can contain both 'abstract methods' and 'concrete methods'.

       6) Concrete methods can be overridden by child classes if desired.

       7) final methods cannot be overridden hence cannot be abstract!

       8) An abstract class cannot be private; otherwise, its children would not be able to access and override it.

       9) An abstract class can have an abstract child, and the abstract child is not required to override the methods of its parent, but it can if it wants to.







 */
