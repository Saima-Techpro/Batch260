package day20constructor_datetime;

public class Car {

    /*
    Constructor is like  a chef in Java. Just like we need a chef to bake a cake, we need
    a constructor to create an object.

    Class is a template that is used to create objects. The moment we create a class, Java
    automatically creates a constructor. This is called "Default constructor".


    Default constructor is invisible and works at the background.


    Does that mean we can't create constructors?
    No. We can create as many constructors as we want. But the rule is:
    when we create our own constructor, the default one disappears.

   RULE: If you want to keep the default constructor, you need to make it VISIBLE. Otherwise, it will be over-written
         Multiple constructors provide flexibility while creating new objects

    If you want to keep the default constructor as well, you need to make it visible.

    How to create a constructor?
    accessModifier + className() + body{}

    Difference between a constructor and a method?
    1) Constructor doesn't have 'return type / data type'; method has 'return type / data type'.
    2) Constructor name MUST match with the name of the class (not flexible);
        method name can be anything (flexible)
    3) Constructor is used to create objects; method is used to create some actions (functions)


    A project in real life has many classes (C1, C2, C3....) which store many active and passive
    characteristics (variables, methods). But we don't use main method in those classes.

    We create a separate helper class usually named as 'Runner'. We put main method in the Runner
    class, which serves as an entry point to the project. All objects are created in Runner class.

     */

    // default constructor  ... we made it visible by writing it like this
    public Car(){

    }

    // We can create as many constructors as we want (following the method overloading concept => same methods name, different parameters, different data type)

    public Car(String model){
        this.model = model;
    }

    public Car(String brand, String model, int price, int year, String engineType){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.engineType = engineType;
    }

    public Car(String brand, String model, int price, int year, boolean airCond, String engineType, boolean sunRoof) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.airCond = airCond;
        this.engineType = engineType;
        this.sunRoof = sunRoof;
    }

    // Let's create some passive characteristics (variables) in our Car class

    String brand = "Toyota";
    String model = "Prius";
    int price = 20000;
    int year = 2021;

    String engineType= "Hybrid";
    boolean airCond = true;
    boolean sunRoof = false;

    // Let's create some active characteristics (method / functions)

    public void action(){
        System.out.println(brand + " reaches 100 km/h in 15 secs.");
    }

    public void brake(){
        System.out.println(brand + " takes 2 secs to brake.");
    }

    // toString() method
    // This method is created to make the objects printable as a whole in the runner class.


//    @Override
//    public String toString() {
//        return "Car{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", year=" + year +
//                ", engineType='" + engineType + '\'' +
//                ", price=" + price +
//                ", airCond=" + airCond +
//                ", sunRoof=" + sunRoof +
//                '}';
//    }


}
