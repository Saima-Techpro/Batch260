package day23inheritance_oop;

public class Vehicle {
    // Every class has an invisible constructor which allows the object creation

    // non-parameterised constructor
    public Vehicle(){
        System.out.println("Vehicle constructor... ");
    }

    // parameterised constructor
    public Vehicle(String brand, int price, String engine){
        System.out.println(brand + price + engine);

    }

}
