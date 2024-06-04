package day22stringbuffer_instanceblock_staticblock;

public class InstanceBlock01 {

    /* Static members (variables, methods) belong to Class. They're considered class property.
    // Non-Static members (variables, methods) belong to object. We need to create object of the class in order to reach them.


    // What is instance?
       Object of a class

     An instance block is a block of code that runs every time an instance (object) of the class is created.
     It is used to initialise the instance variables

     syntax=>  {}

            Main characteristics of Instance block:

        1- Runs for Every Instance: The instance block runs every time a new instance of a class is created.
           That means, for every new object, this block is executed again.
        2- Prevents Code Repetition: By using instance blocks, you avoid repeating the initialization
            processes or specific pieces of code for every object.


     */

    // Instance block

    {
        System.out.println("Hello everyone!! ");
    }


    public static void main(String[] args) {
        InstanceBlock01 obj1 = new InstanceBlock01();

        InstanceBlock01 obj2 = new InstanceBlock01();


    }


}
