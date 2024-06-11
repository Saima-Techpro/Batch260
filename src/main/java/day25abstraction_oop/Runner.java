package day25abstraction_oop;

public class Runner {

    public static void main(String[] args) {

        // Honda honda = new Honda();  shows error => objects cannot be created from abstract classes

        // How do we actually use the methods from that abstract class?
        // We can create object from its child class which will provide complete access to its parent class.

        Civic civic = new Civic();
        civic.engine();
        civic.music();




    }
}
