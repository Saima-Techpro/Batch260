package day22stringbuffer_instanceblock_staticblock;

public class InstanceBlock02 {

    public int year;  // non-static variable

    // instance block

    {
        System.out.println("Hello everyone!!");
    }
    // constructor
    public InstanceBlock02(){
       // System.out.println("Hello everyone!!");  // To avoid repetition, use instance block and move this line of code to instance block
    }

    // parameterised constructor
    public InstanceBlock02(int year){
       //  System.out.println("Hello everyone!!"); // To avoid repetition, use instance block and move this line of code to instance block
       this.year = year;
        System.out.println(year);
    }

    // ================================================

    public String colour;
    public String fuelType;
    public String brand;
    public String model;
    public boolean airCond;
    public int price;

    // use instance block to intialise all common features and make them available for all objects

    {
        System.out.println(colour = "Black");
        System.out.println(fuelType = "Diesel");
        System.out.println(brand = "IT Car");
        System.out.println(model = "Coding");
        System.out.println(airCond = true);
        System.out.println(price = 60000);
    }

    public InstanceBlock02(int year, String colour, String fuelType, String brand, String model, boolean airCond, int price) {
        this.year = year;
        this.colour = colour;
        this.fuelType = fuelType;
        this.brand = brand;
        this.model = model;
        this.airCond = airCond;
        this.price = price;
    }

    public static void main(String[] args) {
        // int year; // static variable

        InstanceBlock02 obj1 = new InstanceBlock02();
        InstanceBlock02 obj2 = new InstanceBlock02(2024);
        InstanceBlock02 obj3 = new InstanceBlock02(2024, "Green", "Hybrid", "IT Car", "Coding", true, 65000);

        System.out.println(obj3.colour);
        System.out.println(obj3.price);


    }


}
