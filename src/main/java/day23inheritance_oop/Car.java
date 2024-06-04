package day23inheritance_oop;

public class Car extends Vehicle{

    public String model = "Accord";
    public int year = 2020;

    // non-parameterised constructor
    public Car(){
//        super();
//        this(); // use constructor of this class
        this("this keyword is executed");  // this(parameter) calls to the parameterised constructor of this class
        System.out.println("H-pack");
    }

    // parameterised constructor
    public Car(String type){
        super("Acura, ", 40000, " , Gas" );
        System.out.println(type);
    }
}
