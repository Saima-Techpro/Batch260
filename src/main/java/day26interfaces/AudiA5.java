package day26interfaces;

public class AudiA5 implements Brake, Engine, AirCond{
    /*
    a) We use 'implements' keyword inside the child to establish parent-child relation with interfaces.

    b) 'extends' is not used because it is used between two classes.

    c) The AudiA5 Class is obliged to override all methods in the Brake/Engine interface.

    d) Since the AudiA5 Class must override all methods from parent interface, it is not necessary to write '@Override' at the beginning of the methods, so we do not write it.

    e) If the access modifier is not written inside the class, it is considered default, hence we must write public.
       (because access modifier in child class can NOT be narrower than the parent.)

     */

    // override from Brake interface
     public void abs() {
        System.out.println("Audi A5 uses ABS braking system.");
    }

    public void esp(int a) {
        System.out.println("Audi A5 uses ESP braking system.");
    }

    // override from Engine interface
    public void eco(){
        System.out.println("Audi A5 uses eco engine.");
    }
    public void turbo(){
        System.out.println("Audi A5 uses turbo embedded in eco engine");
    }

    // override from AirCond interface
    public void digital() {
        System.out.println("Audi A5 uses digital ac control.");
    }

    public void run(){
        System.out.println("Audi A5 runs turbo engine... ");
    }

    // we cannot override speed() from Brake interface because it is 'static'



    public void power() {
        System.out.println("Audi A5 250km per hour... ");
    }
}
